allprojects {
    repositories {
        mavenCentral()
        google()
        maven(url = "https://jitpack.io")
    }
}
buildscript {

    repositories {
        google()
        mavenCentral()
        maven(url = "https://maven.fabric.io/public")
    }
    dependencies {
        classpath ("com.android.tools.build:gradle:4.0.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.10")
    }
}
