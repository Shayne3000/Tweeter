plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
    id("com.vanniktech.android.junit.jacoco")
}

android {
    compileSdkVersion(AndroidBuildConfig.compileSDKVersion)
    buildToolsVersion(AndroidBuildConfig.buildToolsVersion)

    defaultConfig {
        minSdkVersion(AndroidBuildConfig.minSdkVersion)
        targetSdkVersion(AndroidBuildConfig.targetSDKVersion)

        versionCode = AndroidBuildConfig.versionCode
        versionName = AndroidBuildConfig.versionName
        testInstrumentationRunner = AndroidBuildConfig.testInstrumentationRunner
    }

    buildTypes {
        getByName("debug") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }

        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = AndroidBuildConfig.kotlinJvmTarget
        useIR = true
    }
}

junitJacoco {
    jacocoVersion = "0.8.6"
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

    testImplementation(Dependencies.junit)
    testImplementation(Dependencies.junitParams)
    testImplementation(Dependencies.mockitoKotlin)
    androidTestImplementation(Dependencies.androidJunitExtension)
    androidTestImplementation(Dependencies.espresso)
}
