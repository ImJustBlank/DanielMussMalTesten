plugins {
    id("com.android.library")
    //alias(libs.plugins.android.application)
    //id("com.android.library") apply false
}

android {
    namespace = "org.godotengine.plugin.android.androidplugintutorial"
    compileSdk = 35

    defaultConfig {
        minSdk = 24
        targetSdk = 35
        buildConfigField("String", "GODOT_PLUGIN_NAME", "\"HelloWorld\"")
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        buildConfig = true
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            buildConfigField("String", "pluginPackageName", "\"org.godotengine.plugin.androidplugintutorial\"")
            buildConfigField("String", "pluginName", "\"HelloWorld\"")

        }

        debug{
            buildConfigField("String", "pluginPackageName", "\"org.godotengine.plugin.androidplugintutorial\"")
            buildConfigField("String", "pluginName", "\"HelloWorld\"")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation("org.godotengine:godot:4.2.2.stable")
}