package tweeter.libraries.root

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import tweeter.libraries.utils.annotations.TestOpen

/**
 * Root Fragment class that holds common configurations for all Fragments
 * such as the Toolbar and anything else etc.
 *
 * @author Seni Joshua
 */
@TestOpen
class TweeterFragment(@LayoutRes layoutId: Int) : Fragment(layoutId) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}
