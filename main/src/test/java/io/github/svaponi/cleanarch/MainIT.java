package io.github.svaponi.cleanarch;

import org.junit.Assert;
import org.junit.Test;

public class MainIT {

    @Test
    public void test() {
        Plugin plugin = Main.load();
        Assert.assertNotNull(plugin);
    }

}
