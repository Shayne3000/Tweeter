import org.gradle.kotlin.dsl.`kotlin-dsl`

plugins {
    `kotlin-dsl`
}

repositories {
    google()
    jcenter()
}

dependencies {
    implementation("com.github.ben-manes:gradle-versions-plugin:0.36.0")
    implementation("com.diffplug.spotless:spotless-plugin-gradle:5.9.0")
    implementation("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.15.0")
    implementation("com.vanniktech:gradle-android-junit-jacoco-plugin:0.16.0")
}
