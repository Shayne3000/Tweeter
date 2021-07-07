package tweeter.features.authentication.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * [ViewModel] for storing and managing data related to the [LoginFragment].
 *
 * @author Seni Joshua
 */
class LoginViewModel : ViewModel() {
    val _state: MutableLiveData<String>? = null
    val state: LiveData<String>? = _state

    fun loginUser(): LiveData<String>? = null
}
