import org.gradle.kotlin.dsl.`kotlin-dsl`

plugins {
    `kotlin-dsl`
    id("com.diffplug.spotless") version PluginVersion.spotless
    id("com.github.ben-manes.versions") version PluginVersion.versions
}
// Required since Gradle 4.10+.
repositories {
    jcenter()
}

dependencies {
}
