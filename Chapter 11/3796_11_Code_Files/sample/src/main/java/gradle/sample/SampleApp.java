package gradle.sample;

import java.util.ResourceBundle;

public class SampleApp {

    public SampleApp() {
    }

    public static void main(final String[] arguments) {
        final SampleApp app = new SampleApp();
        app.welcomeMessage();
    }

    public void welcomeMessage() {
        final String welcomeMessage = readMessage();
        showMessage(welcomeMessage);
    }

    private String readMessage() {
        final ReadWelcomeMessage reader = new ReadWelcomeMessageImpl();
        final String message = reader.getWelcomeMessage();
        return message;
    }

    private void showMessage(final String message) {
        System.out.println(message);
    }
}
