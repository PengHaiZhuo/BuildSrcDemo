
/**
 * @author haizhuo
 * @desciption 第三方依赖包
 */
object ThirdPart {
    /*******************************网络请求S***********************************/
    //网路请求库retrofit
    object Retrofit {
        private const val retrofit_version = "2.9.0"
        const val retrofit = "com.squareup.retrofit2:retrofit:$retrofit_version"

        //gson转换器
        const val convertGson = "com.squareup.retrofit2:converter-gson:$retrofit_version"

        //scalars转换器
        const val convertScalars = "com.squareup.retrofit2:converter-scalars:2.9.0"
        const val adapterRxjava = "com.squareup.retrofit2:adapter-rxjava2:$retrofit_version"
    }

    //okhttp
    object OkHttp {
        private const val okhttp_version = "4.8.0"
        const val okhttp = "com.squareup.okhttp3:okhttp:$okhttp_version"
        const val urlConnection = "com.squareup.okhttp3:okhttp-urlconnection:$okhttp_version"
        const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:$okhttp_version"
    }

    //用于持久化cookie
    //const val persistentCookieJar = "com.github.franmontiel:PersistentCookieJar:v1.0.1"

    //用于动态替换BaseUrl
    //const val retrofit_url_manager = "me.jessyan:retrofit-url-manager:1.4.0"

    //监听上传下载进度
    //const val progressmanager = "me.jessyan:progressmanager:1.5.0"

    /*******************************网络请求E***********************************/

    /*******************************图片S***********************************/
    //图片加载框架
    object Glide {
        private const val glide_version = "4.11.0"
        const val glide = "com.github.bumptech.glide:glide:$glide_version"
        const val compiler = "com.github.bumptech.glide:compiler:$glide_version"
    }
    /*******************************图片E***********************************/

    /*******************************窗口、控件和相关工具***********************************/
    //顶部SnackBar
    const val topSnackBar = "com.github.PengHaiZhuo:TSnackBar:1.1.1"

    //插入即用的dialog
    //项目地址：https://github.com/afollestad/material-dialogs
    object MaterialDialogs {
        private const val version = "3.3.0"
        const val core = "com.afollestad.material-dialogs:core:$version"
        const val input = "com.afollestad.material-dialogs:input:$version"
        const val color = "com.afollestad.material-dialogs:color:$version"
        const val files = "com.afollestad.material-dialogs:files:$version"
        const val datetime = "com.afollestad.material-dialogs:datetime:$version"
        const val bottomsheets = "com.afollestad.material-dialogs:bottomsheets:$version"
        const val lifecycle = "com.afollestad.material-dialogs:lifecycle:$version"
    }

    //轮播图
    const val bannerVp = "com.github.zhpanvip:BannerViewPager:3.1.5"

    //状态栏
    //const val immersionbar = "com.gyf.immersionbar:immersionbar:3.0.0"
    const val immersionbarKtx = "com.gyf.immersionbar:immersionbar-ktx:3.0.0"

    //上下拉刷新
    const val refreshLayoutKernel = "com.scwang.smart:refresh-layout-kernel:2.0.1"
    const val refreshHeader = "com.scwang.smart:refresh-header-classics:2.0.1"

    //RecycleView适配器工具
    const val baseRecycleViewHelper = "com.github.CymChad:BaseRecyclerViewAdapterHelper:3.0.4"

    //带侧滑菜单的列表
    const val xRecycleView = "com.yanzhenjie.recyclerview:x:1.3.2"

    //好用的指示器indicator
    const val magicIndicator = "com.github.hackware1993:MagicIndicator:1.7.0"

    //屏幕适配方案
    const val autoSize = "me.jessyan:autosize:1.2.1"

    //界面ui状态管理
    const val loadSir = "com.kingja.loadsir:loadsir:1.3.8"

    //通过标签直接写shape
    const val backgroundLibrary ="com.noober.background:core:1.6.5"
    /*******************************窗口、控件和相关工具***********************************/

    /*******************************依赖注入***********************************/
    object DI {
        object Koin {
            private const val koin_version = "2.1.5"

            val core = "org.koin:koin-core:$koin_version}"
            val android = "org.koin:koin-android:$koin_version"
            val androidxViewModel = "org.koin:koin-androidx-viewmodel:$koin_version"
            val androidScope = "org.koin:koin-android-scope:$$koin_version"
        }

        object Dagger{
            //tip:可搭配Hilt使用
            private const val dagger_version = "2.37"
            val dagger ="com.google.dagger:dagger:$dagger_version"
            //use annotationProcessor ,not implementation
            val compiler ="com.google.dagger:dagger-compiler::$dagger_version"
        }
    }
    /*******************************依赖注入***********************************/

    //常用的工具类
    const val utilcodex = "com.blankj:utilcodex:1.26.0"

    //微信开源项目，替代SP
    const val mmkv = "com.tencent:mmkv:1.0.22"

    //rxjava3配合RxAndroid
    const val rxjava3 = "io.reactivex.rxjava3:rxjava:3.0.13"
    const val rxandroid = "io.reactivex.rxjava3:rxandroid:3.0.0"

    //用于解决数据倒灌等问题的LiveData
    const val unPeekLivedata = "com.kunminx.arch:unpeek-livedata:6.0.0-beta1"

    //启动优化异步加载
    //const val anchors="com.effective.android:anchors:1.1.1"
}