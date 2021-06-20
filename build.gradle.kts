// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:4.2.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${PluginVersion.kotlin}")
        classpath("org.jetbrains.kotlin:kotlin-allopen:${PluginVersion.kotlin}")
    }
}

plugins.apply(AndroidBuildPlugin.gitHooks)
plugins.apply(AndroidBuildPlugin.updateDependenciesPlugin)

// Gradle can't find the BaseExtension for detekt when it's applied in allprojects
plugins.apply(AndroidBuildPlugin.detekt)

allprojects {
    plugins.apply(AndroidBuildPlugin.spotless)

    repositories {
        google()
        jcenter()
        mavenCentral()
    }
}

subprojects {
    // TODO Setup common settings for all feature and library modules
}
