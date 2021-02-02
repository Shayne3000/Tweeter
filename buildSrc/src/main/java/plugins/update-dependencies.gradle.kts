package plugins

import com.github.benmanes.gradle.versions.VersionsPlugin
import com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask
import org.gradle.kotlin.dsl.apply

apply<VersionsPlugin>()

tasks.named("dependencyUpdates", DependencyUpdatesTask::class.java).configure {
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

fun isStableVersion(version: String): Boolean {
    val unstableVersionKeywords = listOf(
        "alpha",
        "beta",
        "rc",
        "cr",
        "m",
        "preview",
        "b",
        "ea"
    ).any { version.toLowerCase().contains(it) }
    val regex = "^[0-9,.v-]+(-r)?$".toRegex()
    return !unstableVersionKeywords || regex.matches(version)
}
