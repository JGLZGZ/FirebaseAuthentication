plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    // HILT
    alias(libs.plugins.hilt)
    // KSP
    alias(libs.plugins.ksp)
}

android {
    namespace = "com.estholon.analytics"
    compileSdk = 36

    defaultConfig {
        minSdk = 28

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    kotlin{
        jvmToolchain(17)
    }
}

dependencies {

    // PROJECTS
    implementation(project(":core"))

    // FIREBASE
    implementation(libs.firebase.analytics)

    // HILT
    implementation(libs.hilt.android)
    ksp(libs.hilt.compiler)

    // TEST
    testImplementation(libs.junit)
    testImplementation(libs.mockk)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.mockk.android)

}