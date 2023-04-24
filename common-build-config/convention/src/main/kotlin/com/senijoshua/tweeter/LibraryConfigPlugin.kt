package com.senijoshua.tweeter

import com.android.build.api.dsl.LibraryExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

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
            }
        }
    }
}
