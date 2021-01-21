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
    implementation(BuildConfig.Kotlin.stdlib)
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
    implementation(AndroidX.Navigation.dynamic)
    implementation(AndroidX.Navigation.fragmentKtx)
    implementation(AndroidX.Navigation.uiKtx)
    implementation(AndroidX.Navigation.dynamic)

    //JetPack lifecycle
    implementation(AndroidX.Lifecycle.liveDataKtx)
    implementation(AndroidX.Lifecycle.viewModelKtx)
    implementation(AndroidX.Lifecycle.viewModelSavedState)
    implementation(AndroidX.Lifecycle.commonJava8)
    implementation(AndroidX.Lifecycle.service)
    implementation(AndroidX.Lifecycle.runtime)

    //JetPack Room
    implementation(AndroidX.Room.runtime)
    implementation(AndroidX.Room.compiler)
    implementation(AndroidX.Room.ktx)
    implementation(AndroidX.Room.rxjava2)
    implementation(AndroidX.Room.guava)

    implementation(Google.guava_conflict)

    //viewPager
    implementation(AndroidX.ViewPager.viewpager2)

    //paging
    implementation(AndroidX.Paging.runtimeKtx)
    implementation(AndroidX.Paging.rxjava2Ktx)

    //顶部SnackBar
    implementation (ThirdPart.topSnackBar)

    //retrofit2
    implementation (ThirdPart.retrofit.retrofit)
    implementation (ThirdPart.retrofit.convertGson)
    implementation (ThirdPart.retrofit.adapterRxjava)

    //okhttp
    implementation (ThirdPart.OkHttp.okhttp)
    implementation (ThirdPart.OkHttp.urlConnection)
    implementation (ThirdPart.OkHttp.loggingInterceptor)

    //rxjava
    implementation (ThirdPart.rxjava2)
    implementation (ThirdPart.rxandroid)

    //glide
    implementation (ThirdPart.Glide.glide)
    implementation (ThirdPart.Glide.compiler)
}
