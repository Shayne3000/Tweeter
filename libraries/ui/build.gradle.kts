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
    implementation(Dependencies.appCompat)
    implementation(Dependencies.materialComponents)
    implementation(Dependencies.constraintLayout)
    implementation(project(ProjectModules.Libraries.UTILS))
    androidTestImplementation(Dependencies.androidJunitExtension)
    androidTestImplementation(Dependencies.espresso)
}
