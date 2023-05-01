package com.senijoshua.tweeter

import com.android.build.api.dsl.ApplicationExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

/**
 * Convention plugin for provisioning Compose configuration in the app module.
 *
 * @author Seni Joshua
 */
class ComposeAppConfigPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply("com.android.application")
            setupComposeConfig(extensions.getByType<ApplicationExtension>())
        }
    }
}
