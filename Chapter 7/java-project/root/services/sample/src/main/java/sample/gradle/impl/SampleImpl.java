package sample.gradle.impl;

import sample.gradle.util.Logger;
import sample.gradle.api.SampleService;

public class SampleImpl implements SampleService {
    public String sayHello() {
        Logger.log("sayHello()");
        return "Gradle sample.";
    }
}