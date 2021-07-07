package tweeter.libraries.root.di

import androidx.lifecycle.ViewModel
import dagger.MapKey
import javax.inject.Scope
import kotlin.reflect.KClass

/**
 * Custom dagger annotation that denotes application scope
 *
 * @author Seni Joshua
 */
@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class RootScope

/**
 * Custom dagger annotation that denotes feature module scope
 *
 * @author Seni Joshua
 */
@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class FeatureScope

/**
 * Custom Dagger annotation that is used to associate
 * dagger providers with ViewModel types.
 *
 * @author Seni Joshua
 */
@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER
)
@Retention(AnnotationRetention.RUNTIME)
@MapKey
annotation class ViewModelKey(val value: KClass<out ViewModel>)
