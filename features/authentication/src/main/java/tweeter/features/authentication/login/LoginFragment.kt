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
        viewModel.loginFragmentState.observe(this, this::onViewStateChanged)
    }

    fun onViewEvent(events: LoginFragmentEvents) {
        // perform logic or UI actions
        when (events) {
            is LoginFragmentEvents.ClickLoginButton -> {
                // TODO start a request to login in the viewModel
            }
        }
    }

    fun onViewStateChanged(state: LoginFragmentState) {
        // perform UI actions when the fragment's state changes
        when (state) {
            is LoginFragmentState.Loading -> {
                // TODO show the progress bar as we assume
                //  we'd have clicked the login button to start the request
            }

            is LoginFragmentState.Authenticated -> {
                // TODO send the navcontroller to the viewmodel to start
            }

            is LoginFragmentState.Error -> {
                // TODO note that an error's occured but in the viewModel
                //  fire an event for showing the snackbar
            }
        }
    }
}
