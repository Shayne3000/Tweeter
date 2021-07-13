package tweeter.libraries.root.di

import android.app.Application
import android.content.Context
import androidx.lifecycle.ViewModelProvider
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule
import tweeter.libraries.root.database.dao.UserDao
import tweeter.libraries.root.di.modules.RootModule

/**
 * Parent component that is responsible for injecting dependencies scoped to
 * the application lifetime.
 * It also provides these dependencies to its dependent components through accessor methods.
 *
 * @author Seni Joshua
 */
@RootScope
@Component(
    modules = [
        RootModule::class,
        AndroidInjectionModule::class,
        AndroidSupportInjectionModule::class
    ]
)
interface RootComponent {

    fun initFieldInjection(app: Application)

    /**
     * This getter method facilitates access to the [Context] dependency for Components
     * dependent on the [RootComponent] for injection
     */
    fun context(): Context

    /**
     * This getter method facilitates access to the [UserDao] dependency for Components
     * dependent on the [RootComponent] for injection
     */
    fun userDao(): UserDao

    /**
     * This getter method facilitates access to the [TweeterViewModelFactory]
     * dependency for Components dependent on the [RootComponent] for injection
     */
    fun viewModelFactory(): ViewModelProvider.Factory

    /**
     * Custom builder for binding an instance of the app to this component.
     */
    @Component.Builder
    interface Builder {
        fun build(): RootComponent

        /**
         * Binds the app instance to this component making it the
         * base component for injecting dependencies in this app.
         */
        @BindsInstance
        fun application(app: Application): Builder
    }
}
