plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-allopen")
    id("kotlin-kapt")
    id("com.vanniktech.android.junit.jacoco")
}

allOpen {
    annotation("tweeter.libraries.utils.annotations.TestOpen")
}

android {
    compileSdkVersion(AndroidBuildConfig.compileSDKVersion)
    buildToolsVersion(AndroidBuildConfig.buildToolsVersion)

    defaultConfig {
        applicationId = AndroidBuildConfig.applicationId
        minSdkVersion(AndroidBuildConfig.minSdkVersion)
        targetSdkVersion(AndroidBuildConfig.targetSDKVersion)

        versionCode = AndroidBuildConfig.versionCode
        versionName = AndroidBuildConfig.versionName
        testInstrumentationRunner = AndroidBuildConfig.testInstrumentationRunner
    }

    buildFeatures {
        viewBinding = true
        dataBinding = false
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
            isTestCoverageEnabled = true
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
    // TODO put this in the UI components module and inject the module here.
    implementation(Dependencies.appCompat)
    implementation(Dependencies.materialComponents)
    implementation(Dependencies.constraintLayout)
    // Dagger
    implementation(Dependencies.dagger)
    implementation(Dependencies.daggerAndroid)
    implementation(Dependencies.daggerAndroidSupport)
    kapt(Dependencies.daggerKaptCompiler)
    kapt(Dependencies.daggerKaptProcessor)
    // root dependency module
    implementation(project(ProjectModules.Libraries.ROOT))
    implementation(project(ProjectModules.Libraries.UTILS))
    implementation(project(ProjectModules.Libraries.NAV))
    // Test Dependencies
    testImplementation(Dependencies.junit)
    testImplementation(Dependencies.junitParams)
    testImplementation(Dependencies.mockitoKotlin)
    androidTestImplementation(Dependencies.androidJunitExtension)
    androidTestImplementation(Dependencies.espresso)
}
