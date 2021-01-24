object Versions {
    // Android Build Config

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
