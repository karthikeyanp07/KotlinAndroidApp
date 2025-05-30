plugins {
    alias(libs.plugins.android)
    alias(libs.plugins.kotlin)
    id("com.google.dagger.hilt.android")
    kotlin("kapt")
}

android {
    namespace = "com.sample.android"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.sample.android"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }

    kapt {
        correctErrorTypes = true
    }
}

dependencies {
    implementation(libs.coreKtx)
    implementation(libs.activityKtx)
    implementation(libs.lifecycleRuntimeKtx)
    implementation(libs.appcompat)

    // Retrofit & Coroutines
    implementation(libs.retrofit)
    implementation(libs.retrofitConverterGson)
    implementation(libs.coroutinesCore)
    implementation(libs.coroutinesAndroid)

    // Lifecycle
    implementation(libs.lifecycleLivedataKtx)
    implementation(libs.lifecycleViewmodelKtx)

    // RecyclerView
    implementation(libs.recyclerview)

    // Hilt
    implementation(libs.hiltAndroid)
    kapt(libs.hiltCompiler)

    // Glide
    implementation(libs.glide)

    // Testing
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidxJunit)
    androidTestImplementation(libs.espressoCore)
}