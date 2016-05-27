// File: src/test/java/gradle/sample/SampleTest.java
package gradle.sample;

import org.junit.Assert;
import org.junit.Test;

public class SampleTest {

    @Test
    public void readWelcomeMessage() {
        final Sample sample = new Sample();
        
        final String realMessage = sample.getWelcomeMessage();
        
        final String expectedMessage = "Welcome to Gradle.";
        Assert.assertEquals(
                "Get text from properties file",
                expectedMessage, realMessage);
    } 

}