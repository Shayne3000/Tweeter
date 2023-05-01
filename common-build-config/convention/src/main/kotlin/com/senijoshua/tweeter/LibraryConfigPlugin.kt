package com.senijoshua.tweeter

import com.android.build.api.dsl.LibraryExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.kotlin

/**
 * Convention plugin for sharing common build configuration across library modules.
 *
 * @author Seni Joshua
 */
class LibraryConfigPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.library")
                apply("org.jetbrains.kotlin.android")
            }

            extensions.configure<LibraryExtension> {
                setupBaseAndroidConfig(this)
            }

            val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")

            configurations.configureEach {
                resolutionStrategy {
                    // Run tests with Junit4
                    force(libs.findLibrary("junit4").get())
                }
            }

            dependencies {
                // Kotlin test library dependency for annotating test cases and test assertions
                // see: https://kotlinlang.org/api/latest/kotlin.test/
                add("androidTestImplementation", kotlin("test"))
                add("testImplementation", kotlin("test"))
            }
        }
    }
}
