import com.android.build.api.dsl.LibraryExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

/**
 * Convention plugin for provisioning and sharing compose configuration across library modules.
 *
 * @author Seni Joshua
 */
class ComposeLibraryConfigPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply("com.android.library")
            setupComposeConfig(extensions.getByType<LibraryExtension>())
        }
    }
}
