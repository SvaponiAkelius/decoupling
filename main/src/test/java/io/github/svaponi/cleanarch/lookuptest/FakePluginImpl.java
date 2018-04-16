package io.github.svaponi.cleanarch.lookuptest;

public class FakePluginImpl implements FakePlugin {

    public FakePluginImpl() {
        System.out.println("new instance of " + getClass() + " created");
    }
}
