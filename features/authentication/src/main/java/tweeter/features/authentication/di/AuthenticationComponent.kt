package tweeter.features.authentication.di

import dagger.Component
import tweeter.features.authentication.di.AuthenticationModule
import tweeter.libraries.rootdi.RootComponent

/**
 * Component responsible for injecting dependencies scoped to the authentication module.
 *
 * @author Seni Joshua
 */
@Component(modules = [AuthenticationModule::class], dependencies = [RootComponent::class])
interface AuthenticationComponent {
}