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
 * Convention plugin for sharing common build configuration across data modules.
 *
 * @author Seni Joshua
 */
class DataConfigPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply {
                apply("tweeter.library.config")
            }

            extensions.configure<LibraryExtension> {
                defaultConfig {
                    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
                }
            }

            val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")

            dependencies {
                // TODO Inject the db and network library modules here.
                //  We have this plugin here because the config for data modules differ from feature modules.
                add("implementation", libs.findLibrary("androidx.ktx").get())

                // Test dependencies
                add("testImplementation", kotlin("test"))
                add("androidTestImplementation", kotlin("test"))
                add("androidTestImplementation", libs.findLibrary("espresso").get())
                add("androidTestImplementation", libs.findLibrary("android.junit.extension").get())
            }
        }
    }
}
