package tweeter.features.authentication.login

import android.os.Bundle
import dagger.android.support.AndroidSupportInjection
import tweeter.features.authentication.R
import tweeter.libraries.root.TweeterFragment
import javax.inject.Inject

class LoginFragment : TweeterFragment(R.layout.fragment_login) {
    @Inject lateinit var viewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidSupportInjection.inject(this)

        viewModel.loginFragmentEvents.observe(
            this,
            {
                it.getContentIfNotHandled()?.let { event -> onViewEvent(event) }
            }
        )
    }

    fun onViewEvent(events: LoginFragmentEvents) {
    }
}
