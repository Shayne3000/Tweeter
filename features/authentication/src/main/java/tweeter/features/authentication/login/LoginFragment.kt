package tweeter.features.authentication.login

import android.os.Bundle
import dagger.android.support.AndroidSupportInjection
import tweeter.features.authentication.R
import tweeter.libraries.root.TweeterFragment
import tweeter.libraries.root.observeEvent
import javax.inject.Inject

class LoginFragment : TweeterFragment(R.layout.fragment_login) {
    @Inject lateinit var viewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidSupportInjection.inject(this)

        viewModel.loginFragmentEvents.observeEvent(this, ::onViewEvent)
    }

    fun onViewEvent(events: LoginFragmentEvents) {
        when (events) {
            is LoginFragmentEvents.ClickLoginButton -> {
                // TODO start a request to login in the viewModel
            }
        }
    }
}
