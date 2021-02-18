package com.unisytech.daggerhiltdemo

import android.app.Application
import com.unisytech.daggerhiltdemo.di.UserAuthInfo
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

/**
 * Created by ramesh on 16/02/21.
 */
@HiltAndroidApp
class daggerHiltDemoApp : Application() {

    override fun onCreate() {
        super.onCreate()
    }
}