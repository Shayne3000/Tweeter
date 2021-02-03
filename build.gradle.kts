// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:4.1.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${PluginVersion.kotlin}")
        classpath("org.jetbrains.kotlin:kotlin-allopen:${PluginVersion.kotlin}")
    }
}

plugins.apply(AndroidBuildPlugin.updateDependenciesPlugin)
plugins.apply(AndroidBuildPlugin.spotless)

allprojects {
    repositories {
        google()
        jcenter()
    }
}
