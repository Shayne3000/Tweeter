package tweeter.features.authentication

import android.os.Bundle
import dagger.android.AndroidInjection
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import tweeter.libraries.root.TweeterActivity
import javax.inject.Inject

/**
 * Activity that holds the nav host within which
 * fragment destinations in the authentication module can be swapped in and out.
 *
 * @author Seni Joshua
 */
class AuthenticationActivity : TweeterActivity(R.layout.activity_authentication), HasAndroidInjector {

    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
    }

    /**
     * Returns the injector that would handle injection in component fragments.
     */
    override fun androidInjector() = androidInjector
}
