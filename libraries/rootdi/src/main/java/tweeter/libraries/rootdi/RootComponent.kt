package tweeter.libraries.rootdi

import android.app.Application
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

    fun initFieldInjection()

    @Component.Builder
    interface Builder {
        fun build(): RootComponent

        /**
         * Binds the instance of the application to this component
         * designating it as the parent component for injecting dependencies
         * in this app.
         */
        @BindsInstance
        fun application(app: Application): Builder
    }
}
