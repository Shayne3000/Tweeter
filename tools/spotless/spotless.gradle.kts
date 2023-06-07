//import com.diffplug.gradle.spotless.SpotlessExtension
//import com.diffplug.gradle.spotless.SpotlessPlugin
//
//apply<SpotlessPlugin>()

apply(plugin = "com.diffplug.spotless")

configure<SpotlessExtension> {
    // Formatting rules for kotlin
    kotlin {
        target("**/*.kt")
        targetExclude("**/build/**/*.kt")
        ktlint("0.45.2").userData(mapOf("android" to "true"))
    }

    // Formatting rules for .kts files which are primarily gradle scripts
    format("kts") {
        target("**/*.kts")
        targetExclude("**/build/**/*.kts")
    }

    // Rules for xml files such as the AndroidManifest.xml file.
    format("xml") {
        target("**/*.xml")
        targetExclude("**/build/**/*.xml")
    }
}
