package sample

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class InfoTask extends DefaultTask {
    /**
     * Task property can be changed by user
     * of this task.
     */
    String prefix = 'Current Gradle version'

    /**
     * Method with actual implementation for this task.
     */
    @TaskAction
    def info() {
        println "$prefix: $project.gradle.gradleVersion"
    }
}
