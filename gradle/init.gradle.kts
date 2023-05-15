/**
 * Gradle script for applying the spotless and detekt plugins
 * to all modules in the project.
 */

initscript {
    repositories {
        mavenCentral()
    }

    dependencies {
        classpath("com.diffplug.spotless:spotless-plugin-gradle:6.18.0")
        classpath("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.22.0")
    }
}

allprojects{
    if (this == rootProject) {
        return@allprojects
    }

    apply(from = "$rootDir/tools/spotless/spotless.gradle.kts")
    apply(from = "$rootDir/tools/detekt/detekt.gradle.kts")
}
