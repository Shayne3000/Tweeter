package tweeter.features.authentication.di

import androidx.lifecycle.ViewModel
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import tweeter.features.authentication.login.LoginViewModel
import tweeter.libraries.root.di.ViewModelKey

/**
 * This module is responsible for associating a dagger Provider to
 * the LoginViewModel type in dagger's generated map.
 *
 * @author Seni Joshua
 */
@Module
class LoginVmMapModule {

    @Provides
    @IntoMap
    @ViewModelKey(LoginViewModel::class)
    fun loginViewModelProviderMapper(): ViewModel = LoginViewModel()
}
