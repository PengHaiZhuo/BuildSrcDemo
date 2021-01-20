plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    kotlin("android.extensions")
    id("kotlin-android")
}

android{

    compileSdkVersion(BuildConfig.compileSdkVersion)

    defaultConfig{
        applicationId = "com.phz.haizhuojetpack_mvvm_practice"
        minSdkVersion(BuildConfig.minSdkVersion)
        targetSdkVersion(BuildConfig.targetSdkVersion)
        versionCode = BuildConfig.versionCode
        versionName = BuildConfig.versionName
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        multiDexEnabled = true
    }

    buildTypes {
        getByName("release") {
            consumerProguardFiles("proguard-rules.pro")
        }
    }
    packagingOptions {
        exclude("META-INF/gradle/incremental.annotation.processors")
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        dataBinding = true
        viewBinding = true
    }
    lintOptions {
        isCheckReleaseBuilds =false
        isAbortOnError =false
    }
}

dependencies {
    implementation(fileTree(mapOf("include" to listOf("*.jar"), "dir" to "libs")))
    implementation(BuildConfig.kt.stdlib)
    implementation(AndroidX.appcompat)
    implementation (AndroidX.constraintlayout)
    implementation (AndroidX.cardview)
    implementation (AndroidX.recyclerView)
    implementation (AndroidX.vectordrawable)
    implementation (AndroidX.legacySupportV4)
    implementation (AndroidX.coreKtx)
    implementation (AndroidX.activityKtx)
    //dex分包
    implementation (AndroidX.multidex)
    //material包
    implementation(Google.material)

    testImplementation (Testing.junit)
    androidTestImplementation (Testing.androidJunit)
    androidTestImplementation (Testing.espresso)

    //JetPack navigation
    implementation(AndroidX.navigation.dynamic)
    implementation(AndroidX.navigation.fragmentKtx)
    implementation(AndroidX.navigation.uiKtx)
    implementation(AndroidX.navigation.dynamic)

    //JetPack lifecycle
    implementation(AndroidX.lifecycle.liveDataKtx)
    implementation(AndroidX.lifecycle.viewModelKtx)
    implementation(AndroidX.lifecycle.viewModelSavedState)
    implementation(AndroidX.lifecycle.commonJava8)
    implementation(AndroidX.lifecycle.service)
    implementation(AndroidX.lifecycle.runtime)

    //JetPack Room
    implementation(AndroidX.room.runtime)
    implementation(AndroidX.room.compiler)
    implementation(AndroidX.room.ktx)
    implementation(AndroidX.room.rxjava2)
    implementation(AndroidX.room.guava)

    implementation(Google.guava_conflict)

    //viewPager
    implementation(AndroidX.viewpager.viewpager2)

    //paging
    implementation(AndroidX.paging.runtimeKtx)
    implementation(AndroidX.paging.rxjava2Ktx)

    //顶部SnackBar
    implementation (ThirdPart.topSnackBar)

    //retrofit2
    implementation (ThirdPart.retrofit.retrofit)
    implementation (ThirdPart.retrofit.convertGson)
    implementation (ThirdPart.retrofit.adapterRxjava)

    //okhttp
    implementation (ThirdPart.okhttp.okhttp)
    implementation (ThirdPart.okhttp.urlConnection)
    implementation (ThirdPart.okhttp.loggingInterceptor)

    //rxjava
    implementation (ThirdPart.rxjava2)
    implementation (ThirdPart.rxandroid)

    //glide
    implementation (ThirdPart.glide.glide)
    implementation (ThirdPart.glide.compiler)
}
