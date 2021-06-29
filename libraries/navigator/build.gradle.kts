plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
    id("com.vanniktech.android.junit.jacoco")
}

junitJacoco {
    jacocoVersion = "0.8.6"
}

dependencies {
    implementation(Dependencies.kotlinStandardLibrary)
    implementation(Dependencies.coreKtx)
    implementation(Dependencies.appCompat)
    implementation(Dependencies.materialComponents)
    testImplementation(Dependencies.junit)
    testImplementation(Dependencies.junitParams)
    testImplementation(Dependencies.mockitoKotlin)
    androidTestImplementation(Dependencies.androidJunitExtension)
    androidTestImplementation(Dependencies.espresso)
}
