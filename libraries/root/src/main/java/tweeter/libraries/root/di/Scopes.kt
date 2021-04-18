package tweeter.libraries.root.di

import javax.inject.Scope

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
