package tweeter.features.authentication.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import tweeter.features.authentication.AuthenticationActivity
import tweeter.features.authentication.login.LoginFragment

/**
 * Module class that defines dependencies scoped to the Authentication feature module.
 *
 * @author Seni Joshua
 */
@Module(includes = [AuthenticationVmMapModule::class])
class AuthenticationModule {

    /**
     * Module responsible for generating AndroidInjectors for Activities
     * in the Authentication Module to be able to perform injection in said activity.
     */
    @Module
    abstract class AuthenticationActivityModule {
        @ContributesAndroidInjector
        abstract fun bindAuthenticationActivity(): AuthenticationActivity
    }

    /**
     * Module responsible for installing ViewModels in the authentication module into
     * the internal subcomponent that accesses the respective bound fragments.
     */
    @Module
    abstract class AuthenticationFragmentModule {
        @ContributesAndroidInjector(modules = [AuthenticationVmProviderModule::class])
        abstract fun bindLoginFragment(): LoginFragment
    }
}
