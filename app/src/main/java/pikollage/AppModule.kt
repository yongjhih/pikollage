package pikollage

import android.app.Application
import android.content.Context
import com.facebook.drawee.backends.pipeline.Fresco

import javax.inject.Singleton

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class AppModule(var mApplication: Application) {

    @Provides
    @Singleton
    fun provideApplication(): Application {
        return mApplication
    }

    @Provides @Named("Fresco")
    @Singleton
    fun provideFresco(context: Context): Context { // TODO Move to ImageLoaderModule
        Fresco.initialize(context)
        return context
    }
}
