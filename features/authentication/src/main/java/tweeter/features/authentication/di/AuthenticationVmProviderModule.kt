package tweeter.features.authentication.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Module
import dagger.Provides
import tweeter.features.authentication.login.LoginFragment
import tweeter.features.authentication.login.LoginViewModel

/**
 * Module class responsible for provisioning instances of the ViewModels in the
 * Authentication Module for injection into their respective bound fragments.
 *
 * @author Seni Joshua
 */
@Module
class AuthenticationVmProviderModule {

    @Provides
    fun provideLoginViewModel(
        target: LoginFragment,
        factory: ViewModelProvider.Factory
    ): ViewModel = ViewModelProvider(target, factory).get(LoginViewModel::class.java)
}
