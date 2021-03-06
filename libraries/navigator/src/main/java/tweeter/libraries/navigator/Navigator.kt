package tweeter.libraries.navigator

import android.content.Context
import android.content.Intent

private const val LOGIN_SCREEN_ACTION = "action.goto.login"

/**
 * This is responsible for generating properly formatted implicit
 * intents to start Feature activities.
 *
 * @author Seni Joshua
 */
object Navigator {

    fun goToLoginScreen(context: Context) = internalIntent(context, LOGIN_SCREEN_ACTION)

    /**
     * This function helps to restrict implicit intents to the current package
     * of the context. This is to prevent a chooser dialog from popping up if another app
     * or build flavour defines a similar action.
     *
     * @param context the current context i.e. Feature activity from which one is navigating
     * to another feature.
     * @param routingAction the action string of the destination Feature activity
     */
    private fun internalIntent(context: Context, routingAction: String) {
        Intent(routingAction).setPackage(context.packageName)
    }
}
