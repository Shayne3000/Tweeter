import org.gradle.kotlin.dsl.`kotlin-dsl`

plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation("org.jetbrains.kotlin.jvm:org.jetbrains.kotlin.jvm.gradle.plugin:1.5.20")
    implementation("com.android.tools.build:gradle:4.2.1")
    implementation("com.github.ben-manes:gradle-versions-plugin:0.39.0")
    implementation("com.diffplug.spotless:spotless-plugin-gradle:5.9.0")
    implementation("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.17.1")
    implementation("com.vanniktech:gradle-android-junit-jacoco-plugin:0.16.0")
}
