// Top-level build file where you can add configuration options common to all sub-projects/modules.
@file:Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.hilt) apply false
    id("com.diffplug.spotless") version "6.18.0" apply false
    id("io.gitlab.arturbosch.detekt") version "1.22.0" apply false
}

apply(from = "$rootDir/tools/git-hooks/git-hooks.gradle.kts")

allprojects{
    if (this == rootProject) {
        return@allprojects
    }

    apply<com.diffplug.gradle.spotless.SpotlessPlugin>()
    configure<com.diffplug.gradle.spotless.SpotlessExtension> {
        // Formatting rules for kotlin
        kotlin {
            target("**/*.kt")
            targetExclude("**/build/**/*.kt")
            ktlint("0.46.0")
        }

        // Formatting rules for .kts files which are primarily gradle scripts
        format("kts") {
            target("**/*.kts")
            targetExclude("**/build/**/*.kts")
        }

        // Rules for xml files such as the AndroidManifest.xml file.
        format("xml") {
            target("**/*.xml")
            targetExclude("**/build/**/*.xml")
        }
    }

    apply<io.gitlab.arturbosch.detekt.DetektPlugin>()

    configure<io.gitlab.arturbosch.detekt.extensions.DetektExtension> {
        config = files("$rootDir/tools/detekt/config.yml")
    }
}
