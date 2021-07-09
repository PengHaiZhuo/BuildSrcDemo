// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        mavenCentral()
        maven { url=uri("https://jitpack.io") }
        maven { url=uri("https://maven.aliyun.com/repository/central/") }
        maven { url=uri("https://maven.aliyun.com/repository/google/") }
        maven { url=uri("https://maven.aliyun.com/repository/gradle-plugin")}
    }
    dependencies {
        classpath("com.android.tools.build:gradle:${BuildConfig.gradle_version}")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${BuildConfig.kotlin_version}")
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:${AndroidX.navigation_version}")
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects{
    repositories {
        mavenCentral()
        maven { url=uri("https://jitpack.io") }
        maven { url=uri("https://maven.aliyun.com/repository/central/") }
        maven { url=uri("https://maven.aliyun.com/repository/google/") }
        maven { url=uri("https://maven.aliyun.com/repository/gradle-plugin")}
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}