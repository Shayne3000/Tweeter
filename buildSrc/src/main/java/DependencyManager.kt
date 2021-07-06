object DependencyVersion {
    const val coreKTX = "1.5.0"
    const val appCompat = "1.3.0"
    const val material = "1.3.0"
    const val constraint = "2.0.4"
    const val dagger = "2.37"
    const val room = "2.3.0"
    const val navigation = "2.3.5"
    const val lifecycleVersion = "2.3.1"
    const val archVersion = "2.1.0"

    const val junit = "4.13.2"
    const val junitParams = "1.1.1"
    const val mockitoKotlin = "3.2.0"
    const val androidJunit = "1.1.2"
    const val espresso = "3.3.0"
}

object Dependencies {
    // Project Dependencies
    const val kotlinStandardLibrary = "org.jetbrains.kotlin:kotlin-stdlib:${PluginVersion.kotlin}"
    const val coreKtx = "androidx.core:core-ktx:${DependencyVersion.coreKTX}"
    const val appCompat = "androidx.appcompat:appcompat:${DependencyVersion.appCompat}"
    const val materialComponents =
        "com.google.android.material:material:${DependencyVersion.material}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${DependencyVersion.constraint}"

    // Dagger
    const val dagger = "com.google.dagger:dagger:${DependencyVersion.dagger}"
    const val daggerAndroid = "com.google.dagger:dagger-android:${DependencyVersion.dagger}"
    const val daggerAndroidSupport =
        "com.google.dagger:dagger-android-support:${DependencyVersion.dagger}"
    const val daggerKaptCompiler = "com.google.dagger:dagger-compiler:${DependencyVersion.dagger}"
    const val daggerKaptProcessor =
        "com.google.dagger:dagger-android-processor:${DependencyVersion.dagger}"

    // Navigation Component
    const val navigationFrag =
        "androidx.navigation:navigation-fragment-ktx:${DependencyVersion.navigation}"
    const val navigationUI = "androidx.navigation:navigation-ui-ktx:${DependencyVersion.navigation}"
    const val navigationTest =
        "androidx.navigation:navigation-testing:${DependencyVersion.navigation}"

    //ViewModel & LiveData
    const val viewModel =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${DependencyVersion.lifecycleVersion}"
    const val liveData =
        "androidx.lifecycle:lifecycle-livedata-ktx:${DependencyVersion.lifecycleVersion}"
    const val viewModelSavedState =
        "androidx.lifecycle:lifecycle-viewmodel-savedstate:${DependencyVersion.lifecycleVersion}"
    const val viewModelTestHelpers =
        "androidx.arch.core:core-testing:${DependencyVersion.archVersion}"

    // Room
    const val room = "androidx.room:room-runtime:${DependencyVersion.room}"
    const val roomCompiler = "androidx.room:room-compiler:${DependencyVersion.room}"
    const val roomCoroutinesSupport = "androidx.room:room-ktx:${DependencyVersion.room}"
    const val roomTestHelpers = "androidx.room:room-testing:${DependencyVersion.room}"

    // Test Dependencies
    const val junit = "junit:junit:${DependencyVersion.junit}"
    const val junitParams = "pl.pragmatists:JUnitParams:${DependencyVersion.junitParams}"
    const val mockitoKotlin = "org.mockito.kotlin:mockito-kotlin:${DependencyVersion.mockitoKotlin}"
    const val androidJunitExtension = "androidx.test.ext:junit:${DependencyVersion.androidJunit}"
    const val espresso = "androidx.test.espresso:espresso-core:${DependencyVersion.espresso}"
}
