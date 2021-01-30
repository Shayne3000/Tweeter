import org.gradle.kotlin.dsl.`kotlin-dsl`

plugins {
    `kotlin-dsl`
}
// Required since Gradle 4.10+.
repositories {
    jcenter()
}

dependencies {
    implementation("com.github.ben-manes:gradle-versions-plugin:0.33.0")
}
