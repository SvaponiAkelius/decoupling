package io.github.svaponi.cleanarch;

public class PluginImpl implements Plugin {

    @Override
    public Object get() {
        return getClass() + ":1.0";
    }
}
