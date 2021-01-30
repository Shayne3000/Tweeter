package plugins

import com.github.benmanes.gradle.versions.VersionsPlugin
import com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.withType

apply<VersionsPlugin>()

tasks {
    withType<DependencyUpdatesTask>() {
        resolutionStrategy {
            componentSelection {
                all {
                    if (!isStableVersion(candidate.version) && isStableVersion(currentVersion)) {
                        reject("Release candidate")
                    }
                }
            }
        }
    }
}

fun isStableVersion(version: String): Boolean {
    val hasStableKeywords = listOf(
        "alpha",
        "beta",
        "rc",
        "cr",
        "m",
        "preview",
        "b",
        "ea"
    ).any { !version.toLowerCase().contains(it) }
    val regex = "^[0-9,.v-]+(-r)?$".toRegex()
    return hasStableKeywords || regex.matches(version)
}
