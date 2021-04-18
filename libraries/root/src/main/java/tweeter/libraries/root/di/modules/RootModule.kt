package tweeter.libraries.root.di.modules

import android.app.Application
import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import tweeter.libraries.root.database.TweeterDatabase
import tweeter.libraries.root.di.RootScope

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
}
