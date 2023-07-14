package com.senijoshua.tweeter.libraries.network.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/**
 * Module that tells hilt how to provide network dependencies.
 *
 * @author Seni Joshua
 */
@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {
    // TODO create singleton/(app)-scoped instances of Retrofit, and OkHttp for provisioning across the whole app.
}
