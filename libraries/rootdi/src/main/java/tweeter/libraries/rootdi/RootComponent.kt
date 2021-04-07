package tweeter.libraries.rootdi

import android.app.Application
import android.content.Context
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule
import tweeter.libraries.rootdi.modules.RootModule

/**
 * Parent component that is responsible for injecting dependencies scoped to
 * the application lifetime.
 * It also provides these dependencies to its dependent components through accessor methods.
 *
 * @author Seni Joshua
 */
@Component(
    modules = [
        RootModule::class,
        AndroidInjectionModule::class,
        AndroidSupportInjectionModule::class
    ]
)
interface RootComponent {

    fun initFieldInjection(app: Application)

    fun context(): Context

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
