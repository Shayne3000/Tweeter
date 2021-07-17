package tweeter.libraries.root

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData

/**
 * Wrapper class for event types which are exposed through a [LiveData] observable.
 *
 * @author Seni Joshua
 */
open class Event<out T>(private val event: T) {
    var hasBeenHandled = false
        private set

    /**
     * Returns the content and prevents its use again.
     */
    fun getEventIfNotHandled(): T? {
        return if (hasBeenHandled) {
            null
        } else {
            hasBeenHandled = true
            event
        }
    }

    /**
     * Returns the content, even if it's already been handled.
     */
    fun peekEvent(): T = event
}

/**
 * A [LiveData] extension function that calls the [onEventUnhandled] function only
 * if the [Event] has not been handled.
 */
inline fun <T : Any> LiveData<Event<T>>.observeEvent(
    owner: LifecycleOwner,
    crossinline onEventUnhandled: (T) -> Unit
) {
    observe(
        owner,
        {
            it?.getEventIfNotHandled()?.let(onEventUnhandled)
        }
    )
}

/**
 * A [LiveData] extension function similar to [LiveData.observe] that only calls [onChanged]
 * if the value/data emitted is non-null.
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
