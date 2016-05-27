package gradle.sample;

/**
 * Simple class to test code quality plugins of Gradle.
 */
public class JavaSample {

    private String greeting;
    
    public static void main(String[] args) {
        System.out.println("Running simple Java application.");
        final JavaSample sample = new JavaSample();
        sample.setGreeting("Hello");
        System.out.println(sample.greet());   
    }    

    public void setGreeting(final String greeting) {
        this.greeting = greeting;
    }

    public String getGreeting() {
        return this.greeting;
    }

    public String greet() {
        return greeting + " world.";
    }

    public boolean equals(Object other) {
        if (other != null && other instanceof JavaSample) {
            final JavaSample otherJavaSample = (JavaSample) other;
            return otherJavaSample.getGreeting().equals(this.greeting);
        }
        return false;
    }
}