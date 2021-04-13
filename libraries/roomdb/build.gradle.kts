plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
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

dependencies {
    implementation(Dependencies.kotlinStandardLibrary)
    implementation(Dependencies.coreKtx)
    // Room
    implementation(Dependencies.room)
    implementation(Dependencies.roomCoroutinesSupport)
    kapt(Dependencies.roomCompiler)
    // Root DI project
    implementation(project(ProjectModules.Libraries.ROOT_DI))
    // Test Dependencies
    testImplementation(Dependencies.junit)
    testImplementation(Dependencies.junitParams)
    testImplementation(Dependencies.mockitoKotlin)
    androidTestImplementation(Dependencies.androidJunitExtension)
    androidTestImplementation(Dependencies.espresso)
}
