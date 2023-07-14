plugins {
    id("tweeter.library.config")
    id("tweeter.hilt.config")
}

android {
    namespace = "com.senijoshua.tweeter.libraries.network"
}

dependencies {
    implementation(libs.androidx.ktx)
    testImplementation(libs.junit4)
    androidTestImplementation(libs.espresso)
    androidTestImplementation(libs.android.junit.extension)
}
