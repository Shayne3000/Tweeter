package tweeter.libraries.rootdi.modules

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import tweeter.libraries.rootdi.RootScope

/**
 * Root Module that defines application scope dependencies
 * @author Seni Joshua
 */
@Module
class RootModule {

    @Provides
    @RootScope
    fun provideContext(application: Application): Context = application.applicationContext
}
