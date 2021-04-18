package com.senijoshua.tweeter

import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import tweeter.libraries.rootdi.DaggerRootComponent
import tweeter.libraries.root.di.RootComponent
import javax.inject.Inject

/**
 * [Application] subclass that is responsible for initialising app-wide components and paradigms.
 *
 * The [HasAndroidInjector] interface allows one to inject dependencies into
 * Android framework classes like Activity, Fragments, etc.
 * @author Seni Joshua
 */
class TweeterAppConfig : Application(), HasAndroidInjector {
    @Inject lateinit var dispatchAndroidInjector: DispatchingAndroidInjector<Any>

    override fun onCreate() {
        super.onCreate()
        appInstance = this
        rootComponent = DaggerRootComponent.builder().application(appInstance).build()
        rootComponent.initFieldInjection(appInstance)
    }

    /**
     * Returns the injected Android Injector from Dagger as the injector for
     * performing injection in Android framework classes within the app
     */
    override fun androidInjector(): AndroidInjector<Any> = dispatchAndroidInjector

    companion object {
        lateinit var appInstance: Application
        lateinit var rootComponent: RootComponent
    }
}
