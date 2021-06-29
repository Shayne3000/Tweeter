plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
    id("kotlin-allopen")
}

allOpen {
    annotation("tweeter.libraries.utils.annotations.TestOpen")
}

dependencies {
    implementation(Dependencies.kotlinStandardLibrary)
    implementation(Dependencies.coreKtx)
    // Dagger
    implementation(Dependencies.dagger)
    implementation(Dependencies.daggerAndroid)
    implementation(Dependencies.daggerAndroidSupport)
    kapt(Dependencies.daggerKaptCompiler)
    kapt(Dependencies.daggerKaptProcessor)
    // Room
    implementation(Dependencies.room)
    implementation(Dependencies.roomCoroutinesSupport)
    kapt(Dependencies.roomCompiler)
    implementation(project(ProjectModules.Libraries.UTILS))
    // Test Dependencies
    testImplementation(Dependencies.junit)
    testImplementation(Dependencies.junitParams)
    testImplementation(Dependencies.mockitoKotlin)
    androidTestImplementation(Dependencies.androidJunitExtension)
    androidTestImplementation(Dependencies.espresso)
}
