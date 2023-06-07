import io.gitlab.arturbosch.detekt.DetektPlugin
import io.gitlab.arturbosch.detekt.extensions.DetektExtension

apply<DetektPlugin>()

configure<DetektExtension> {
    config = files("$rootDir/tools/detekt/config.yml")
}

tasks.named("detekt").configure {
    reports {
        // Enable/Disable Markdown report
        md.required.set(true)
        md.outputLocation.set((project.file("build/reports/detekt/detekt.md")))
    }
}
