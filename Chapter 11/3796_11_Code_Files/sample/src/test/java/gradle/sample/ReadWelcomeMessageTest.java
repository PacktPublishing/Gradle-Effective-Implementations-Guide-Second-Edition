package gradle.sample;

import org.junit.Assert;
import org.junit.Test;

public class ReadWelcomeMessageTest {

    @Test
    public void readWelcomeMessage() {
        final ReadWelcomeMessage reader = new ReadWelcomeMessageImpl();
        final String realMessage = reader.getWelcomeMessage();

        final String expectedMessage = "Welcome to Gradle.";

        Assert.assertEquals("Get text from implementation", expectedMessage, realMessage);
    }
}
