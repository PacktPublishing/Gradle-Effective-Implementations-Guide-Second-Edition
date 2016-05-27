package sample

import org.gradle.api.*
import org.gradle.testfixtures.ProjectBuilder
import org.junit.*

class InfoPluginTest {

    @Test
    void infoTaskIsAddedToProject() {
        final Project project = ProjectBuilder.builder().build()
        project.apply plugin: sample.InfoPlugin
        assert project.tasks.findByName('info')
    }

    @Test
    void configurePrefix() {
        final Project project = ProjectBuilder.builder().build()
        project.apply plugin: sample.InfoPlugin
        project.info.prefix = 'Sample'
        assert project.info.prefix == 'Sample'
    }

}
