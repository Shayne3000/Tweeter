package tweeter.libraries.root

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import tweeter.libraries.utils.annotations.TestOpen

/**
 * Root Activity class that holds common configurations for all Activities
 * such as the Toolbar etc.
 *
 * @author Seni Joshua
 */
@TestOpen
class TweeterActivity(@LayoutRes layoutId: Int) : AppCompatActivity(layoutId) {
    override fun onCreate(savedInstanceState: Bundle?) {
        // Todo Set the theme for all activities/app here
        super.onCreate(savedInstanceState)
    }
}
