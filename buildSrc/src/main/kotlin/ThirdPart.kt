
/**
 * @author haizhuo
 * @desciption 第三方依赖包
 */
object ThirdPart {
    //顶部SnackBar
    const val  topSnackBar="com.github.PengHaiZhuo:TSnackBar:1.1.1"

    //网路请求库retrofit
    val retrofit=Retrofit
    object Retrofit{
        private const val retrofit_version = "2.8.1"
        const val retrofit = "com.squareup.retrofit2:retrofit:$retrofit_version"
        const val convertGson = "com.squareup.retrofit2:converter-gson:$retrofit_version"
        const val adapterRxjava = "com.squareup.retrofit2:adapter-rxjava2:$retrofit_version"
    }

    //okhttp
    object OkHttp{
        private const val okhttp_version = "4.8.0"
        const val okhttp= "com.squareup.okhttp3:okhttp:$okhttp_version"
        const val urlConnection = "com.squareup.okhttp3:okhttp-urlconnection:$okhttp_version"
        const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:$okhttp_version"
    }

    //rxjava
    const val rxjava2="io.reactivex.rxjava2:rxjava:2.2.14"
    const val rxandroid="io.reactivex.rxjava2:rxandroid:2.1.1"

    //图片加载框架
    object Glide {
        private const val glide_version = "4.11.0"
        const val glide = "com.github.bumptech.glide:glide:$glide_version"
        const val compiler = "com.github.bumptech.glide:compiler:$glide_version"
    }
}