package tweeter.features.authentication.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import tweeter.libraries.root.Event

/**
 * [ViewModel] for storing and managing data related to the [LoginFragment].
 *
 * @author Seni Joshua
 */
class LoginViewModel : ViewModel() {
    private val _loginFragmentEvents = MutableLiveData<Event<LoginFragmentEvents>>()

    val loginFragmentEvents: LiveData<Event<LoginFragmentEvents>>
        get() = _loginFragmentEvents

    private val _loginFragmentState = MutableLiveData<LoginFragmentState>()

    val loginFragmentState: LiveData<LoginFragmentState>
        get() = _loginFragmentState

    fun loginUser(): LiveData<String>? = null
}
