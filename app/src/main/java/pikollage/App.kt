package pikollage.sample

import android.support.multidex.MultiDexApplication

class App : MultiDexApplication() {
    companion object {
        lateinit var mainComponent: MainComponent
    }
    override fun onCreate() {
        super.onCreate()

        mainComponent = DaggerMainComponent.builder()
                .appModule(AppModule(this))
                .build()
    }

}
