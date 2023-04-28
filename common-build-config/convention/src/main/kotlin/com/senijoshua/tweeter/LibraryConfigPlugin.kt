package com.senijoshua.tweeter

import com.android.build.api.dsl.LibraryExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.getByType

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

                extensions.configure<LibraryExtension> {

                }

                val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")
            }
        }
    }
}
