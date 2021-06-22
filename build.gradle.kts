allprojects {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
    }
}

buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.10")
        classpath("com.android.tools.build:gradle:4.0.1")
    }
}
