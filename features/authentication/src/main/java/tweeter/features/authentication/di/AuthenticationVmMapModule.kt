package tweeter.features.authentication.di

import androidx.lifecycle.ViewModel
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import tweeter.features.authentication.login.LoginViewModel
import tweeter.libraries.root.di.ViewModelKey

/**
 * This module is responsible for associating Dagger Providers in dagger's generated map
 * to the ViewModel types in the Authentication Module.
 *
 * @author Seni Joshua
 */
@Module
class AuthenticationVmMapModule {

    @Provides
    @IntoMap
    @ViewModelKey(LoginViewModel::class)
    fun loginViewModelProviderMapper(): ViewModel = LoginViewModel()
}
