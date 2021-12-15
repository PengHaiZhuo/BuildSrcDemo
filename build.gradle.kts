// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven("https://jitpack.io") //maven { setUrl("https://jitpack.io") }
    }
    dependencies {
        classpath("${Gradle.plugin}")
        classpath("${Kotlin.plugin}")
        classpath("${AndroidX.Navigation.safeArgsGradlePlugin}")
        classpath("${AndroidX.Hilt.gradlePlugin}")
    }
}

allprojects{
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven("https://jitpack.io")
//        maven { url=uri("https://maven.aliyun.com/repository/central/") }
//        maven { url=uri("https://maven.aliyun.com/repository/google/") }
//        maven { url=uri("https://maven.aliyun.com/repository/gradle-plugin")}
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}