// File: src/test/java/gradle/sample/SampleTestNG.java
package gradle.sample;


import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class SampleTestNG {

    @Test
    public void readWelcomeMessage() {
        final Sample sample = new Sample();
        
        final String realMessage = sample.getWelcomeMessage();
        
        final String expectedMessage = "Welcome to Gradle.";
        AssertJUnit.assertEquals(
                "Get text from properties file",
                expectedMessage, realMessage);
    } 

}