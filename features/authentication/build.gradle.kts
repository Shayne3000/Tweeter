plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
    id("kotlin-allopen")
    id("com.vanniktech.android.junit.jacoco")
    id("androidx.navigation.safeargs.kotlin")
}

allOpen {
    annotation("tweeter.libraries.utils.annotations.TestOpen")
}

junitJacoco {
    jacocoVersion = "0.8.6"
}

dependencies {
    implementation(Dependencies.kotlinStandardLibrary)
    implementation(Dependencies.coreKtx)
    implementation(Dependencies.appCompat)
    implementation(Dependencies.materialComponents)
    implementation(Dependencies.constraintLayout)
    // ViewModel & LiveData
    implementation(Dependencies.viewModel)
    implementation(Dependencies.liveData)
    implementation(Dependencies.viewModelSavedState)
    kapt(Dependencies.lifeCycleCompiler)
    // Navigation Component
    implementation(Dependencies.navigationFrag)
    implementation(Dependencies.navigationUI)
    // Dagger
    implementation(Dependencies.dagger)
    implementation(Dependencies.daggerAndroid)
    implementation(Dependencies.daggerAndroidSupport)
    kapt(Dependencies.daggerKaptCompiler)
    kapt(Dependencies.daggerKaptProcessor)
    // library modules
    implementation(project(ProjectModules.Libraries.ROOT))
    implementation(project(ProjectModules.Libraries.UI))
    implementation(project(ProjectModules.Libraries.UTILS))
    // Test Dependencies
    testImplementation(Dependencies.viewModelTestHelpers)
    testImplementation(Dependencies.junit)
    testImplementation(Dependencies.junitParams)
    testImplementation(Dependencies.mockitoKotlin)
    androidTestImplementation(Dependencies.androidJunitExtension)
    androidTestImplementation(Dependencies.espresso)
}
