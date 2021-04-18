package tweeter.libraries.root.di.modules

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import tweeter.libraries.root.database.TweeterDatabase
import tweeter.libraries.root.di.RootScope

/**
 * Root Module that defines the [TweeterDatabase] dependencies
 *
 * @author Seni Joshua
 */
@Module
class DatabaseModule {

    @RootScope
    @Provides
    fun provideTweeterDatabase(context: Context) =
        Room.databaseBuilder(context, TweeterDatabase::class.java, TweeterDatabase.DATABASE_NAME)
            .build()


    /**
     * This allows one to retrieve data from and persist data to the User entity
     * from anywhere in the app.
     */
    @RootScope
    @Provides
    fun provideUserDao(database: TweeterDatabase) = database.userDao()
}