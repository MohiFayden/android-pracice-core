plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.hilt)
    kotlin("kapt")
}

android {
    namespace = "com.fadenai.androidsample1"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.fadenai.androidsample1"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

//        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        testInstrumentationRunner = "de.mannodermaus.junit5.AndroidJUnit5Builder"

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
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}

dependencies {

    // Android
    implementation(libs.androidx.core.ktx)
    implementation(libs.material)
    implementation(libs.activityKtx)

    // Compose
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.androidx.constraintlayout.compose)
    implementation(libs.coil.compose)
    implementation(libs.androidx.runtime.livedata)
    implementation(libs.androidx.lifecycle.compose.viewModel)
    implementation(libs.androidx.navigation.compose)
    implementation(libs.androidx.hilt.navigation.compose)

    debugImplementation(libs.androidx.ui.tooling)

    // Lifecycle
    implementation(libs.liveData)
    implementation(libs.viewModel)

    // Room
    implementation(libs.room)
    implementation(libs.room.ktx)
    kapt(libs.room.compiler)
    implementation(libs.android.database.sqlcipher)

    // Hilt
    implementation(libs.google.dagger.hilt)
    kapt(libs.google.dagger.hilt.compiler)

    // Network
    implementation(libs.retrofit)
    implementation(libs.converter.gson)

    implementation(libs.okhttp)
    implementation(libs.logging.interceptor)

    // Rx
    implementation(libs.reactivex.rxAndroid)
    implementation(libs.reactivex.rxJava)
    implementation(libs.reactivex.rxKotlin)

    // Test
//    testImplementation(libs.junit)
    testImplementation(libs.androidx.test.core)
    testImplementation(libs.junit.jupiter)
    testRuntimeOnly(libs.junit.jupiter.engin)
    testImplementation(libs.mockk)
    testImplementation(libs.androidx.arch.test)
    testImplementation(libs.coroutines.test)
    testImplementation(libs.turbine)
    testImplementation(kotlin("test"))
    testImplementation(libs.androidx.room.testing)

    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)


    // ToDo: trying to run the CourseDaoTest to test Room DB
//    androidTestImplementation(libs.androidx.test.core)
//    androidTestImplementation(libs.junit.jupiter)
//    androidTestRuntimeOnly(libs.junit.jupiter.engin)
//    androidTestImplementation(libs.coroutines.test)
//    androidTestImplementation(kotlin("test"))

    // JUnit 5 API and dependencies
//    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
//    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")

   // JUnit 5 for instrumented Android tests
//    androidTestImplementation("de.mannodermaus.junit5:android-test-core:1.3.0")
//    androidTestRuntimeOnly("de.mannodermaus.junit5:android-test-runner:1.3.0")
}