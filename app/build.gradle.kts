plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.mydiary"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.mydiary"
        minSdk = 27
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

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)



    dependencies {
        implementation ("androidx.room:room-runtime:2.4.2")
        annotationProcessor ("androidx.room:room-compiler:2.4.2")

        implementation ("androidx.lifecycle:lifecycle-viewmodel:2.4.1")
        implementation ("androidx.lifecycle:lifecycle-livedata:2.4.1")

        implementation ("com.google.android.material:material:1.6.1")
        implementation ("androidx.recyclerview:recyclerview:1.2.1")
    }



}

