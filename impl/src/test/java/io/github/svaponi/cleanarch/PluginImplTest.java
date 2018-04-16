package io.github.svaponi.cleanarch;

import org.junit.Assert;
import org.junit.Test;

public class PluginImplTest {

    @Test
    public void test() {
        PluginImpl plugin = new PluginImpl();
        Assert.assertNotNull(plugin);
        Assert.assertTrue(plugin instanceof Plugin);

        Object result = plugin.get();
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof String);
    }
}
