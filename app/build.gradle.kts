plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    id("kotlin-kapt")
}

android {
    namespace = "com.training.alqurannur"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.training.alqurannur"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
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
        jvmTarget = "1.8"
    }
    buildFeatures {
        dataBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // Retrofit for networking
implementation ("com.squareup.retrofit2:retrofit:2.9.0")
implementation ("com.squareup.retrofit2:converter-gson:2.9.0")

// OkHttp for logging (optional)
implementation ("com.squareup.okhttp3:logging-interceptor:4.10.0")

// Kotlin Coroutines for asynchronous programming
implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")

// Android Lifecycle components
implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.6.2")
implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")

// Activity KTX for easier activity operations
implementation ("androidx.activity:activity-ktx:1.8.0")

    implementation ("androidx.recyclerview:recyclerview:1.2.1")


}