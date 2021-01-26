object Versions {
    // Dependencies
    const val kotlin = "1.4.21"
    const val coreKTX = "1.3.2"
    const val appCompat = "1.2.0"
    const val material = "1.2.1"
    const val constraint = "2.0.4"

    // Test Dependencies
    const val junit = "4.13.1"
    const val androidJunit = "1.1.2"
    const val espresso = "3.3.0"
}

object AndroidBuildConfig {
    const val applicationId = "com.senijoshua.tweeter"
    const val buildToolsVersion = "30.0.2"
    const val compileSDKVersion = 30
    const val minSdkVersion = 21
    const val targetSDKVersion = 30

    const val versionCode = 1
    const val versionName = "1.0"

    const val supportVectorDrawables = true
    const val viewBinding = true
    const val dataBinding = true
    const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

    const val kotlin
}

object Dependencies {
    // Project Dependencies
    const val kotlinStandardLibrary = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKTX}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val materialComponents = "com.google.android.material:material:${Versions.material}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraint}"

    // Test Dependencies
    const val junit = "junit:junit:${Versions.junit}"
    const val androidJunitExtension = "androidx.test.ext:junit:${Versions.androidJunit}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
}
