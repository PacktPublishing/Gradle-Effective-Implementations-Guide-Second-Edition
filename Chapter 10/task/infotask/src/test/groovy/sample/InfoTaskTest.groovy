package sample

import org.junit.*
import org.gradle.api.*
import org.gradle.testfixtures.ProjectBuilder

class InfoTaskTest {

    @Test
    void createTaskInProject() {
        final Task newTask = createInfoTask()
        assert newTask instanceof InfoTask
    }

    @Test
    void propertyValueIsSet() {
        final Task newTask = createInfoTask()
        newTask.configure {
            prefix = 'Test'
        }
        assert newTask.prefix == 'Test'
    }

    private Task createInfoTask() {
        // We cannot use new InfoTask() to create a new instance,
        // but we must use the Project.task() method.
        final Project project = ProjectBuilder.builder().build()
        project.task('info', type: InfoTask)
    }
}
