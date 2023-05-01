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

gradlePlugin{
    plugins {
        // register your convention plugins here
        register("tweeterLibrary") {
            id = "tweeter.library.config"
            implementationClass = "LibraryConfigPlugin"
        }
    }
}
