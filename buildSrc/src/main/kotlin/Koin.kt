/**
 * @author haizhuo
 * @introduction Koin是用来替代Dagger的
 */
@SuppressWarnings("SpellCheckingInspection")
object Koin {
    private const val koin_version = "2.1.5"

    val core = "org.koin:koin-core:$koin_version}"
    val android = "org.koin:koin-android:$koin_version"
    val androidxViewModel = "org.koin:koin-androidx-viewmodel:$koin_version"
    val androidScope = "org.koin:koin-android-scope:$$koin_version"
}