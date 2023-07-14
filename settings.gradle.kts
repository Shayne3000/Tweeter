@file:Suppress("UnstableApiUsage")

pluginManagement {
    includeBuild("common-build-config")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Tweeter"
include(":app")
include(":features:authentication")
include(":data:tweets")
include(":libraries:ui")
include(":libraries:network")

