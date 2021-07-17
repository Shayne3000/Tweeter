package tweeter.features.authentication.login

/**
 * Class that represents the various UI events that occur in the [LoginFragment].
 *
 * @author Seni Joshua
 */
sealed class LoginFragmentEvents {
    object ClickLoginButton : LoginFragmentEvents()
}
