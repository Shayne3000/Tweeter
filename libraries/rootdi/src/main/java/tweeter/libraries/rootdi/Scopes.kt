package tweeter.libraries.rootdi

import javax.inject.Scope

/**
 * Custom dagger annotation that denotes application scope
 *
 * @author Seni Joshua
 */
@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class RootScope
