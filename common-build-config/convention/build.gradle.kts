import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.ksp.gradlePlugin)
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = libs.versions.kotlinJvmTarget.get()
    }
}

gradlePlugin{
    plugins {
        // register your convention plugins here
        register("tweeterApplicationCompose") {
            id = "tweeter.application.compose.config"
            implementationClass = "ComposeAppConfigPlugin"
        }

        register("tweeterLibraryCompose") {
            id = "tweeter.library.compose.config"
            implementationClass = "ComposeLibraryConfigPlugin"
        }

        register("tweeterLibrary") {
            id = "tweeter.library.config"
            implementationClass = "LibraryConfigPlugin"
        }

        register("tweeterFeature") {
            id = "tweeter.feature.config"
            implementationClass = "FeatureConfigPlugin"
        }

        register("tweeterData") {
            id = "tweeter.data.config"
            implementationClass = "DataConfigPlugin"
        }
    }
}
