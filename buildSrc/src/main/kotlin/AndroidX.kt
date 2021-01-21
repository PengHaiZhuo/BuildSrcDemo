
/**
 * @author haizhuo
 * 不带 ktx 后缀的为 java 依赖，核心功能在此库
 * 带 ktx 后缀为 kotlin 依赖，提供很多方便的扩展函数, ktx 默认引入不带 ktx 的库
 * 依赖关系参考 https://juejin.im/post/5e567ee1518825494466a938
 */
@Suppress("SpellCheckingInspection")
object AndroidX {
    /**
     * appcompat中默认引入了很多库(比如fragment库、core库、annotation库等)，如果想使用其中某个库的更新版本，可以单独引用
     */
    const val appcompat = "androidx.appcompat:appcompat:1.2.0"
    const val constraintlayout = "androidx.constraintlayout:constraintlayout:1.1.3"
    const val cardview = "androidx.cardview:cardview:1.0.0"
    const val recyclerView = "androidx.recyclerview:recyclerview:1.2.0-alpha03"
    const val vectordrawable = "androidx.vectordrawable:vectordrawable:1.1.0"

    const val legacySupportV4 = "androidx.legacy:legacy-support-v4:1.0.0"

    const val coreKtx = "androidx.core:core-ktx:1.3.1"
    const val activityKtx = "androidx.activity:activity-ktx:1.2.0-alpha04"

    const val multidex = "androidx.multidex:multidex:2.0.1"

    object ViewPager{
        const val viewpager = "androidx.viewpager:viewpager:1.0.0"
        const val viewpager2 = "androidx.viewpager2:viewpager2:1.0.0"
    }

    object Paging {
        private const val paging_version = "2.1.2"
        const val runtime = "androidx.paging:paging-runtime:$paging_version"
        const val runtimeKtx = "androidx.paging:paging-runtime-ktx:$paging_version"

        // optional - RxJava support
        const val rxjava2 = "androidx.paging:paging-rxjava2:$paging_version"
        const val rxjava2Ktx = "androidx.paging:paging-rxjava2-ktx:$paging_version"

        // alternatively - without Android dependencies for testing
        const val testingCommon = "androidx.paging:paging-common:$paging_version"
        const val testingCommonKtx = "androidx.paging:paging-common-ktx:$paging_version"
    }


    object Fragment {
        private const val fragment_version = "1.3.0-alpha05"
        const val fragment = "androidx.fragment:fragment:$fragment_version"
        const val ktx = "androidx.fragment:fragment-ktx:$fragment_version"
        //Testing fragment
        const val testing = "androidx.fragment:fragment-testing:$fragment_version"
    }

    object Lifecycle {
        private const val lifecycle_version = "2.2.0"

        @Deprecated("lifecycle-extensions 已弃用,不要使用 ViewModelProviders.of 的方式")
        const val extensions = "androidx.lifecycle:lifecycle-extensions:$lifecycle_version"

        const val livedata = "androidx.lifecycle:lifecycle-livedata:$lifecycle_version"
        const val liveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version"

        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel:$lifecycle_version"
        const val viewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
        const val viewModelSavedState = "androidx.lifecycle:lifecycle-viewmodel-savedstate:$lifecycle_version"

        const val commonJava8 = "androidx.lifecycle:lifecycle-common-java8:$lifecycle_version"
        const val service = "androidx.lifecycle:lifecycle-service:$lifecycle_version"
        const val runtime = "androidx.navigation:navigation-runtime:$lifecycle_version"
    }


    object Navigation {
        private const val navigation_version = "2.3.0"

        // 无需直接引用
        const val runtime = "androidx.navigation:navigation-runtime:$navigation_version"

        const val fragment = "androidx.navigation:navigation-fragment:$navigation_version"
        const val fragmentKtx = "androidx.navigation:navigation-fragment-ktx:$navigation_version"

        const val ui = "androidx.navigation:navigation-ui:$navigation_version"
        const val uiKtx = "androidx.navigation:navigation-ui-ktx:$navigation_version"

        // Dynamic Feature Module Support
        const val dynamic = "androidx.navigation:navigation-dynamic-features-fragment:$navigation_version"

        // Testing Navigation
        const val testing = "androidx.navigation:navigation-testing:$navigation_version"
    }


    object Room {
        private const val room_version = "2.2.5"

        const val runtime = "androidx.room:room-runtime:$room_version"

        // for java use annotationProcessor , for kotlin use kapt
        const val compiler = "androidx.room:room-compiler:$room_version"

        // optional - Kotlin Extensions and Coroutines support for Room
        const val ktx = "androidx.room:room-ktx:$room_version"

        // optional - RxJava support for Room
        const val rxjava2 = "androidx.room:room-rxjava2:$room_version"

        // optional - Guava support for Room, including Optional and ListenableFuture
        const val guava = "androidx.room:room-guava:$room_version"

        //Testing Room
        const val testing = "androidx.room:room-testing:$room_version"
    }
}