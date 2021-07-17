package tweeter.features.authentication.login

/**
 * Class that represents the various states of the [LoginFragment].
 *
 * @author Seni Joshua
 */
sealed class LoginFragmentState {
    /**
     * Login request has been triggered and the View is in a [Loading] state.
     */
    object Loading : LoginFragmentState()

    /**
     * Login request was successful and the View is in an [Authenticated] state.
     */
    object Authenticated : LoginFragmentState()

    /**
     * Login fails and the View is in an [Error] state.
     */
    object Error : LoginFragmentState()

    /**
     * Check if the view is in a [Loading] state.
     */
    fun isLoading() = this is Loading

    /**
     * Check if the view is in an [Authenticated] state.
     */
    fun isAuthenticated() = this is Authenticated

    /**
     * Check if the view is in an [Error] state.
     */
    fun isError() = this is Error
}
