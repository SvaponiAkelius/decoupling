package io.github.svaponi.cleanarch;

public class Main {

    public static void main(String[] args) {
        Plugin plugin = load();
        Object result = plugin.get();
        System.out.println(result);
    }

    static Plugin load() {
        return Factory.lookup("io.github.svaponi", Plugin.class);
    }
}
