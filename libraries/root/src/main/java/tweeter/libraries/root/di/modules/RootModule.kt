package tweeter.libraries.root.di.modules

import android.app.Application
import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Module
import dagger.Provides
import tweeter.libraries.root.di.RootScope
import tweeter.libraries.root.di.TweeterViewModelFactory
import javax.inject.Provider

/**
 * Root Module that defines application scope dependencies
 *
 * @author Seni Joshua
 */
@Module(includes = [DatabaseModule::class])
class RootModule {

    @RootScope
    @Provides
    fun provideContext(application: Application): Context = application.applicationContext

    /**
     * This designates the [TweeterViewModelFactory] as the [ViewModelProvider.Factory] that would be
     * used for ViewModel creation throughout the app.
     */
    @RootScope
    @Provides
    fun provideViewModelFactory(
        providerMap: Map<Class<out ViewModel>, @JvmSuppressWildcards Provider<ViewModel>>
    ): ViewModelProvider.Factory = TweeterViewModelFactory(providerMap)
}
