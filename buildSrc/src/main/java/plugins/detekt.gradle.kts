package plugins
import io.gitlab.arturbosch.detekt.DetektPlugin
import io.gitlab.arturbosch.detekt.extensions.DetektExtension

apply<DetektPlugin>()

configure<DetektExtension> {
    config = files("$rootDir/detekt-config.yml")
    reports {
        // observe findings in your browser with structure and code snippets
        html {
            enabled = true
            destination = project.file("build/reports/detekt/report.xml")
        }

        // checkstyle like format mainly for integrations like CircleCI
        xml {
            enabled = true
            destination = project.file("build/reports/detekt/report.html")
        }
    }
}
