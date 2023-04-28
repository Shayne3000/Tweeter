package com.senijoshua.tweeter

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType

/**
 * Compose configuration for the Android closure in convention plugins.
 *
 * @author Seni Joshua
 */
@Suppress("UnstableApiUsage")
internal fun Project.setupComposeAndroidConfig(commonExtension: CommonExtension<*, *, *, *>,) {
    commonExtension.apply {
        val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")

        commonExtension.apply {
            buildFeatures {
                compose = true
            }

            composeOptions {
                kotlinCompilerExtensionVersion = libs.findVersion("composeCompiler").get().toString()
            }

            dependencies {
                val composeBom = libs.findLibrary("androidx-compose-bom").get()
                add("implementation", platform(composeBom))
                add("androidTestImplementation", platform(composeBom))
            }
        }
    }
}
