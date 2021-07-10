package tweeter.features.authentication.di

import dagger.Module

/**
 * Module class that defines dependencies scoped to the Authentication feature module.
 *
 * @author Seni Joshua
 */
@Module(includes = [LoginVmMapModule::class])
class AuthenticationModule
