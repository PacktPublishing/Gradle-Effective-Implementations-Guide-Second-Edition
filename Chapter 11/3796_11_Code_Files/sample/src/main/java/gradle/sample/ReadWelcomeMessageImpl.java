package gradle.sample;

import java.util.ResourceBundle;

/**
 * Simple implementation to return welcome message.
 */
public class ReadWelcomeMessageImpl implements ReadWelcomeMessage {

    public ReadWelcomeMessageImpl() {
    }

    /**
     * Return "Welcome to Gradle." String value.
     *
     * @return Welcome to Gradle.
     */
    public String getWelcomeMessage() {
        return "Welcome to Gradle.";
    }
}
