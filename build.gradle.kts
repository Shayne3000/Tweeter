// Top-level build file where you can add configuration options common to all sub-projects/modules.
@file:Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.android) apply false
    id("com.diffplug.spotless") version "6.18.0" apply false
    id("io.gitlab.arturbosch.detekt") version "1.22.0" apply false
}

apply(from = "$rootDir/tools/git-hooks/git-hooks.gradle.kts")

allprojects{
    // apply(from = "$rootDir/tools/spotless/spotless.gradle.kts")
    apply(from = "$rootDir/tools/detekt/detekt.gradle.kts")
}
