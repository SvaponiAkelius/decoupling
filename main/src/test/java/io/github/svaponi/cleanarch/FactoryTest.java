package io.github.svaponi.cleanarch;

import io.github.svaponi.cleanarch.lookuptest.FakePlugin;
import org.junit.Assert;
import org.junit.Test;

public class FactoryTest {

    @Test
    public void test() {
        FakePlugin plugin = Factory.lookup("io.github.svaponi.cleanarch.lookuptest", FakePlugin.class);
        Assert.assertNotNull(plugin);
    }
}
