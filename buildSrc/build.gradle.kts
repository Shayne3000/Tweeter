import org.gradle.kotlin.dsl.`kotlin-dsl`

plugins {
    `kotlin-dsl`
}
// Required since Gradle 4.10+.
repositories {
    jcenter()
}

dependencies {
    implementation("com.github.ben-manes:gradle-versions-plugin:0.36.0")
    implementation("com.diffplug.spotless:spotless-plugin-gradle:5.9.0")
}
