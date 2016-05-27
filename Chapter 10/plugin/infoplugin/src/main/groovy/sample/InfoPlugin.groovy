package sample

import org.gradle.api.*

/**
 * Gradle plugin to show Gradle version.
 */
class InfoPlugin implements Plugin<Project> {

    void apply(Project project) {
        // Add InfoPluginExtension to project accessible
        // via info{} configuration block.
        project.extensions.create('info', InfoPluginExtension)

        // Add info task to project.
        project.tasks.create('info') << {
            println "$project.info.prefix: $project.gradle.gradleVersion"
        }
    }

}
