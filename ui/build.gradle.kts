plugins {
    id("android-library")
    id("kotlin-android")
    id("kotlin-kapt")
}

android {
    kapt { generateStubs = true }

    compileSdkVersion(30)

    defaultConfig {
        minSdkVersion(21)
        targetSdkVersion(30)
        vectorDrawables.useSupportLibrary = true
        multiDexEnabled = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    packagingOptions {
        exclude("META-INF/spring.tooling")
        exclude("META-INF/NOTICE.md")
        exclude("META-INF/spring.handlers")
        exclude("META-INF/spring-configuration-metadata.json")
        exclude("META-INF/additional-spring-configuration-metadata.json")
        exclude("META-INF/spring.factories")
        exclude("META-INF/spring.schemas")
        exclude("META-INF/license.txt")
        exclude("META-INF/notice.txt")
        exclude("META-INF/LICENSE.md")
        exclude("META-INF/AL2.0")
        exclude("META-INF/LGPL2.1")
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.3.2")
    implementation("com.google.android.material:material:1.3.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.3.1")
    implementation("androidx.activity:activity-compose:1.3.0-alpha06")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.2")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
    implementation("androidx.appcompat:appcompat:1.3.0-rc01")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions.freeCompilerArgs += "-Xopt-in=org.mylibrary.OptInAnnotation"
}