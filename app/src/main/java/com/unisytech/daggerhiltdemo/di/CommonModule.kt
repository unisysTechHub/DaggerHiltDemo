package com.unisytech.daggerhiltdemo.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ViewComponent
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Qualifier
import javax.inject.Singleton

/**
 * Created by ramesh on 16/02/21.
 */
@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class Param1

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class Param2

@Module
@InstallIn(ActivityComponent::class)
class CommonModule {

    @Param1
    @Provides
    fun param1() : Test1 {
        return  Test1()
    }

    @Param2
    @Provides
    fun param2() : Test1 {
        return  Test1()
    }

}
@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class Param3

@Module
@InstallIn(ActivityComponent::class)
class CommonModule1 {
    @Param3
    @Provides
    fun param1() : Test1 {
        return  Test1()
    }




}

