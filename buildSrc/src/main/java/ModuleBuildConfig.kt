object AndroidBuildConfig {
    const val applicationId = "com.senijoshua.tweeter"
    const val buildToolsVersion = "30.0.2"
    const val compileSDKVersion = 30
    const val minSdkVersion = 21
    const val targetSDKVersion = 30

    const val versionCode = 1
    const val versionName = "1.0"

    const val supportVectorDrawables = true
    const val viewBinding = true
    const val dataBinding = true
    const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

    const val kotlinJvmTarget = "1.8"
}

object ProjectModules {
    const val APP = ":app"

    object Features {
        const val AUTH = ":features:authentication"
    }

    object Libraries {
        const val ROOT_DI = ":libraries:rootdi"
        const val UTILS = ":libraries:utils"
    }
}
