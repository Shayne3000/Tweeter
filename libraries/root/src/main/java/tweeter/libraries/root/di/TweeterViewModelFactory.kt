package tweeter.libraries.root.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.ClassCastException
import javax.inject.Provider

/**
 * Factory class responsible for retrieving the ViewModel instance
 * bound to a provider from the dagger-generated map of providers
 * to viewmodel types given its class name.
 *
 * @author Seni Joshua
 */
class TweeterViewModelFactory(
    private val providerMap: Map<Class<out ViewModel>, Provider<ViewModel>>
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return requireNotNull(getProvider(modelClass).get()) {
            "Provider for $modelClass returned null"
        }
    }

    @Suppress("UNCHECKED_CAST")
    private fun <T : ViewModel> getProvider(viewModelClass: Class<T>): Provider<T> =
        try {
            requireNotNull(providerMap[viewModelClass] as Provider<T>) {
                "No ViewModel provider is associated with the key $viewModelClass"
            }
        } catch (e: ClassCastException) {
            error("Wrong provider type registered for ViewModel type $viewModelClass")
        }
}
