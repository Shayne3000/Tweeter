package plugins

import com.diffplug.gradle.spotless.SpotlessExtension
import com.diffplug.gradle.spotless.SpotlessPlugin

apply<SpotlessPlugin>()

configure<SpotlessExtension> {
    // formatting rules for kotlin
    kotlin {
        target(
            fileTree(
                mapOf(
                    "dir" to ".",
                    "include" to listOf("**/*.kt"),
                    "exclude" to listOf("**/build/**", "**/.*")
                )
            )
        )
        ktlint("0.40.0")
        trimTrailingWhitespace()
        indentWithSpaces()
        endWithNewline()
    }

    // formatting rules for Gradle Kotlin files
    kotlinGradle {
        target(
            fileTree(
                mapOf(
                    "dir" to ".",
                    "include" to listOf("**/*.gradle.kts", "*.gradle.kts"),
                    "exclude" to listOf("**/build/**")
                )
            )
        )
        ktlint("0.40.0")
    }

    // formatting rules for generic files
    format("misc") {
        // define the files to apply `misc` to
        target(
            fileTree(
                mapOf(
                    "dir" to ".",
                    "include" to listOf("**/*.md", "**/.gitignore", "**/*.yaml", "**/*.yml"),
                    "exclude" to listOf(
                        ".gradle/**",
                        ".gradle-cache/**",
                        "**/tools/**",
                        "**/build/**",
                        "**/buildSrc/**"
                    )
                )
            )
        )
        indentWithSpaces()
        trimTrailingWhitespace()
        endWithNewline()
    }

    // formatting rules for xml files
    format("xml") {
        target("**/res/**/*.xml")
        indentWithSpaces()
        trimTrailingWhitespace()
        endWithNewline()
    }
}
