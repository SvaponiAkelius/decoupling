package io.github.svaponi.cleanarch;

import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.scanners.TypeAnnotationsScanner;
import org.reflections.scanners.TypeElementsScanner;

import java.lang.reflect.Modifier;
import java.util.Set;

public class Factory {

    public static <T> T lookup(String basePackage, Class<T> type) {

        final Reflections reflections = new Reflections(basePackage, new TypeElementsScanner(), new TypeAnnotationsScanner(), new SubTypesScanner());
        final Set<Class<? extends T>> classes = reflections.getSubTypesOf(type);

        if (classes.isEmpty()) throw new IllegalStateException("no implementation found");

        System.out.printf("found %d instances of '%s' in '%s' \n", classes.size(), type, basePackage);

        // TODO: handle the case of multiple implementations

        final Class<? extends T> targetImplementationClass = classes.stream().filter(cl -> !Modifier.isAbstract(cl.getModifiers())).findFirst().get();

        try {
            return targetImplementationClass.newInstance();
        } catch (InstantiationException e) {
            throw new IllegalStateException("instance creation failure", e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("instance creation failure", e);
        }
    }
}
