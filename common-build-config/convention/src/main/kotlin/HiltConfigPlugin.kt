import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType

/**
 * Convention plugin to share hilt configuration across modules that use Hilt.
 *
 * @author Seni Joshua
 */
class HiltConfigPlugin : Plugin<Project>{
    override fun apply(target: Project) {
        with(target){
            with(pluginManager) {
                apply("com.google.dagger.hilt.android")
                apply("org.jetbrains.kotlin.kapt")
            }
            val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")

            dependencies {
                add("implementation", libs.findLibrary("hilt.android").get())
                add("kapt", libs.findLibrary("hilt.compiler").get())
                add("kaptAndroidTest", libs.findLibrary("hilt.compiler").get())
            }
        }
    }
}
