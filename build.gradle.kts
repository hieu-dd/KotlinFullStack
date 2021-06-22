allprojects {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
    }
}

buildscript {
    val kotlin_version by extra("1.5.10")
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
