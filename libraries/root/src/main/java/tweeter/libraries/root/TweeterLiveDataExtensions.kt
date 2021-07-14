package tweeter.libraries.root

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData

/**
 * Wrapper class for event types which are exposed through a [LiveData] observable.
 *
 * @author Seni Joshua
 */
open class Event<out T>(private val content: T) {
    var hasBeenHandled = false
        private set

    /**
     * Returns the content and prevents its use again.
     */
    fun getContentIfNotHandled(): T? {
        return if (hasBeenHandled) {
            null
        } else {
            hasBeenHandled = true
            content
        }
    }

    /**
     * Returns the content, even if it's already been handled.
     */
    fun peekContent(): T = content
}

/**
 * A [LiveData] extension function similar to [LiveData.observe] that only calls [onChanged]
 * if the value emitted is non-null.
 */
inline fun <T : Any> LiveData<T>.observeNonNull(
    owner: LifecycleOwner,
    crossinline onChanged: (T) -> Unit
) {
    observe(
        owner,
        { t -> t?.let { onChanged(t) } }
    )
}
