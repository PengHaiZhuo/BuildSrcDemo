import kotlin.collections.*
plugins {
    id("com.android.application")
    id("kotlin-android") //kotlin("android")
    id("kotlin-kapt")
    id("kotlin-parcelize")
    id("androidx.navigation.safeargs")
    id("dagger.hilt.android.plugin")
}

android{

    compileSdk = BuildConfig.compileSdk
    buildToolsVersion = BuildConfig.buildToolsVersion

    defaultConfig{
        applicationId = BuildConfig.applicationId
        minSdk=BuildConfig.minSdkVersion
        targetSdk = BuildConfig.targetSdkVersion
        versionCode = BuildConfig.versionCode
        versionName = BuildConfig.versionName
        testInstrumentationRunner = BuildConfig.testInstrumentationRunner

        ndk {
            //不配置则默认构建并打包所有可用的ABI
            //same with gradle-> abiFilters 'x86_64','armeabi-v7a','arm64-v8a'
            abiFilters.addAll(arrayListOf("x86_64", "armeabi-v7a", "arm64-v8a"))
        }
    }

    base {
        //打包名称示例：BuildSrc(1.2)-release.apk
        archivesBaseName = "BuildSrc(${BuildConfig.versionName})"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }
    }
    packagingOptions {
        resources.excludes += "META-INF/gradle/incremental.annotation.processors"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        dataBinding = true
        viewBinding = true
    }
    lint {
        isCheckReleaseBuilds =false
        isAbortOnError =false
    }
}

dependencies {
    implementation(fileTree(mapOf("include" to listOf("*.jar"), "dir" to "libs")))
    implementation(AndroidX.appcompat)
    implementation (AndroidX.constraintlayout)
    implementation (AndroidX.cardview)
    implementation (AndroidX.recyclerView)
    implementation (AndroidX.coreKtx)
    implementation (AndroidX.activityKtx)
    implementation(AndroidX.fragmentKtx)
    //material包
    implementation(Google.material)

    testImplementation (Testing.junit)
    androidTestImplementation (Testing.androidJunit)
    androidTestImplementation (Testing.espresso)

    //JetPack navigation
    implementation(AndroidX.Navigation.fragmentKtx)
    implementation(AndroidX.Navigation.uiKtx)
    implementation(AndroidX.Navigation.dynamic)

    //JetPack lifecycle
    implementation(AndroidX.Lifecycle.liveDataKtx)
    implementation(AndroidX.Lifecycle.viewModelKtx)
    implementation(AndroidX.Lifecycle.viewModelSavedState)
    implementation(AndroidX.Lifecycle.commonJava8)
    implementation(AndroidX.Lifecycle.service)
    implementation(AndroidX.Lifecycle.runtimeKtx)

    //Hilt
    implementation(AndroidX.Hilt.common)
    kapt(AndroidX.Hilt.compiler)

    //JetPack Room
    implementation(AndroidX.Room.runtime)
    kapt(AndroidX.Room.compiler)
    implementation(AndroidX.Room.ktx)
    implementation(AndroidX.Room.rxjava3)
    implementation(AndroidX.Room.guava)

    //viewPager
    implementation(AndroidX.ViewPager.viewpager2)
    implementation(AndroidX.ViewPager.viewpager)

    //okhttp
    implementation (ThirdPart.OkHttp.okhttp)
    implementation (ThirdPart.OkHttp.urlConnection)
    implementation (ThirdPart.OkHttp.loggingInterceptor)

    //glide
    implementation (ThirdPart.Glide.glide)
    implementation (ThirdPart.Glide.compiler)
}
