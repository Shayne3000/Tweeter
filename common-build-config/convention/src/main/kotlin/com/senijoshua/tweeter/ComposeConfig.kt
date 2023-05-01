package com.senijoshua.tweeter

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType

/**
 * Configuration to setup Compose in convention plugins.
 *
 * @author Seni Joshua
 */
@Suppress("UnstableApiUsage")
internal fun Project.setupComposeConfig(commonExtension: CommonExtension<*, *, *, *>,) {
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
