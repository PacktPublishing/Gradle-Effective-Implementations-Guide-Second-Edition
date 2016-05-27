package gradle.sample

/**
 * Simple Groovy class to work with code-quality plugins
 * of Gradle.
 */
class GroovySample {
    def greeting

    static main(args) {
        println 'Running GroovySample application.'
        def sample = new GroovySample(greeting: 'Hello')
        println sample.greet()
    }    

    String greet() {
        "${greeting} world."
    }

    boolean equals(other) {
        other?.greeting == greeting
    }
}