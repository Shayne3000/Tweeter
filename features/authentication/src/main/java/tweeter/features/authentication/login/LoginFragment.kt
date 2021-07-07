package tweeter.features.authentication.login

import android.os.Bundle
import dagger.android.support.AndroidSupportInjection
import tweeter.features.authentication.R
import tweeter.libraries.root.TweeterFragment

class LoginFragment : TweeterFragment(R.layout.fragment_login) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidSupportInjection.inject(this)
    }
}
