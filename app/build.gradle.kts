plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.androidunittesting"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.androidunittesting"
        minSdk = 26
        targetSdk = 35
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
// Dependensi utama aplikasi
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)

    // Unit testing dependencies (lokal JVM)
    testImplementation(libs.junit)

    // Instrumented testing dependencies (pada perangkat)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}