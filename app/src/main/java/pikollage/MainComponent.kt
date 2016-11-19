package pikollage.sample

import javax.inject.Singleton

import dagger.Component

/**
 * Created by andrew on 11/8/16.
 */
@Singleton
@Component(modules = arrayOf(AppModule::class))
interface MainComponent {
    fun inject(fragment: MainFragment)
}