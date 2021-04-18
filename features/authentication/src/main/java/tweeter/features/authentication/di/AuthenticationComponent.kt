package tweeter.features.authentication.di

import dagger.Component
import tweeter.libraries.rootdi.FeatureScope
import tweeter.libraries.root.di.RootComponent

/**
 * Component responsible for injecting dependencies scoped to the authentication module.
 *
 * @author Seni Joshua
 */
@FeatureScope
@Component(modules = [AuthenticationModule::class], dependencies = [RootComponent::class])
interface AuthenticationComponent
