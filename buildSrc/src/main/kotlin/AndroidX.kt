/**
 * @author haizhuo
 * ·不带 ktx 后缀的为 java 依赖，核心功能在此库
 * ·带 ktx 后缀为 kotlin 依赖，提供很多方便的扩展函数, ktx 默认引入不带 ktx 的库
 * 依赖关系参考 https://juejin.im/post/5e567ee1518825494466a938
 * 版本查看参考 https://androidx.tech/artifacts/appcompat/appcompat/
 */
@Suppress("SpellCheckingInspection")
object AndroidX {
    /**
     * appcompat中默认引入了很多库(比如fragment库、core库、annotation库等)，如果想使用其中某个库的更新版本，可以单独引用
     */
    const val appcompat = "androidx.appcompat:appcompat:1.3.0"

    //约束布局
    const val constraintlayout = "androidx.constraintlayout:constraintlayout:2.0.4"

    //卡片控件
    const val cardview = "androidx.cardview:cardview:1.0.0"

    //recyclerView
    const val recyclerView = "androidx.recyclerview:recyclerview:1.2.1"

    //swiperefreshlayout
    const val swiperefreshlayout = "androidx.swiperefreshlayout:swiperefreshlayout:1.1.0"

    //core包+ktx扩展函数
    const val coreKtx = "androidx.core:core-ktx:1.6.0"

    //activity+ktx扩展函数
    const val activityKtx = "androidx.activity:activity-ktx:1.2.3"

    object ViewPager {
        //viewpager
        const val viewpager = "androidx.viewpager:viewpager:1.0.0"

        //viewpager2
        const val viewpager2 = "androidx.viewpager2:viewpager2:1.0.0"
    }

    object Paging {
        private const val paging_version = "3.0.0"
        const val runtime = "androidx.paging:paging-runtime:$paging_version"
        const val runtimeKtx = "androidx.paging:paging-runtime-ktx:$paging_version"

        // optional - RxJava2 support
        const val rxjava2 = "androidx.paging:paging-rxjava2:$paging_version"
        const val rxjava2Ktx = "androidx.paging:paging-rxjava2-ktx:$paging_version"

        // optional - RxJava3 support
        const val rxjava3 = "androidx.paging:paging-rxjava3:$paging_version"

        // optional - Guava ListenableFuture support
        const val guava = "androidx.paging:paging-guava:$paging_version"

        // alternatively - without Android dependencies for tests
        const val testingCommon = "androidx.paging:paging-common:$paging_version"
        const val testingCommonKtx = "androidx.paging:paging-common-ktx:$paging_version"

        // optional - Jetpack Compose integration
        const val compose = "androidx.paging:paging-compose:1.0.0-alpha10"
    }


    object Fragment {
        private const val fragment_version = "1.3.5"

        //const val fragment = "androidx.fragment:fragment:$fragment_version"
        const val ktx = "androidx.fragment:fragment-ktx:$fragment_version"

        //Testing fragment
        const val testing = "androidx.fragment:fragment-testing:$fragment_version"
    }

    object Hilt{
        private const val hilt_version = "2.3.0"
        const val common = "androidx.hilt:hilt-common:$hilt_version"
        const val commonKtx = "androidx.hilt:hilt-common-ktx:$hilt_version"
    }

    object Lifecycle {
        private const val lifecycle_version = "2.3.0"

        @Deprecated("lifecycle-extensions 已弃用,不要使用 ViewModelProviders.of 的方式")
        const val extensions = "androidx.lifecycle:lifecycle-extensions:$lifecycle_version"

        //const val livedata = "androidx.lifecycle:lifecycle-livedata:$lifecycle_version"
        const val liveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version"

        //const val viewModel = "androidx.lifecycle:lifecycle-viewmodel:$lifecycle_version"
        const val viewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"

        //Saved state module for ViewModel
        const val viewModelSavedState =
            "androidx.lifecycle:lifecycle-viewmodel-savedstate:$lifecycle_version"

        //Annotation processor 注释处理器
        //use kapt,not implementation
        const val compiler ="androidx.lifecycle:lifecycle-compiler:$lifecycle_version"

        // if using Java8, use the following instead of lifecycle-compiler
        //提供了DefaultLifecycleObserver接口
        const val commonJava8 =
            "androidx.lifecycle:lifecycle-common-java8:$lifecycle_version"

        //helpers for implementing LifecycleOwner in a Service
        const val service = "androidx.lifecycle:lifecycle-service:$lifecycle_version"

        //ProcessLifecycleOwner provides a lifecycle for the whole application process
        const val process ="androidx.lifecycle:lifecycle-process:$lifecycle_version"
    }


    object Navigation {
        private const val navigation_version = "2.3.5"

        // 无需直接引用
        const val runtime = "androidx.navigation:navigation-runtime:$navigation_version"

        //const val fragment = "androidx.navigation:navigation-fragment:$navigation_version"
        const val fragmentKtx = "androidx.navigation:navigation-fragment-ktx:$navigation_version"

        //const val ui = "androidx.navigation:navigation-ui:$navigation_version"
        const val uiKtx = "androidx.navigation:navigation-ui-ktx:$navigation_version"

        const val safeArgs = "androidx.navigation:navigation-safe-args-generator:$navigation_version"

        // Dynamic Feature Module Support
        const val dynamic =
            "androidx.navigation:navigation-dynamic-features-fragment:$navigation_version"

        // Testing Navigation
        const val testing = "androidx.navigation:navigation-testing:$navigation_version"
    }


    object Room {
        private const val room_version = "2.3.0"

        const val runtime = "androidx.room:room-runtime:$room_version"

        // for java use annotationProcessor , for kotlin use kapt
        const val compiler = "androidx.room:room-compiler:$room_version"

        // optional - Kotlin Extensions and Coroutines support for Room
        const val ktx = "androidx.room:room-ktx:$room_version"

        // optional - RxJava support for Room
        const val rxjava2 = "androidx.room:room-rxjava2:$room_version"
        const val rxjava3 = "androidx.room:room-rxjava3:$room_version"

        // optional - Guava support for Room, including Optional and ListenableFuture
        const val guava = "androidx.room:room-guava:$room_version"

        //Testing Room
        const val testing = "androidx.room:room-testing:$room_version"
    }


    //com.android.support:support-v4的androidx映射版本，关于其他支持库查看{https://developer.android.com/topic/libraries/support-library/packages}
    //关于映射关系查看{https://developer.android.com/jetpack/androidx/migrate/artifact-mappings}
    const val legacySupportV4 = "androidx.legacy:legacy-support-v4:1.0.0"

    //vectordrawable
    //sdk包下graphics.drawable下有一个VectorDrawable类，对于较高的版本不需要引入此库来支持基于XML矢量图形创建可绘制对象。
    const val vectordrawable = "androidx.vectordrawable:vectordrawable:1.1.0"

    /**
    multidex分包
    @description:提供了MultiDexApplication，它允许您在Android 4.4和更早的设备上使用不安全的multidex形式。
    21或更高版本默认启用multidex并且您不需要导入multidex库和设置配置文件。
     */
    const val multidex = "androidx.multidex:multidex:2.0.1"
}