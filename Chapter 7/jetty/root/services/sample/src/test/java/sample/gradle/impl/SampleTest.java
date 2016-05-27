package sample.gradle.impl;

import org.junit.*;

public class SampleTest {
    @Test
    public void sayHello() {
        final sample.gradle.api.SampleService impl = new SampleImpl();
        Assert.assertEquals("Gradle sample.", impl.sayHello());
    }
}