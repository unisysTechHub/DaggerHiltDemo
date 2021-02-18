package com.unisytech.daggerhiltdemo.di

import android.content.Context
import android.util.Log
import android.widget.TextView
import androidx.hilt.lifecycle.ViewModelInject
import dagger.hilt.InstallIn
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityRetainedScoped
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.android.scopes.ViewScoped
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by ramesh on 16/02/21.
 */
@ActivityScoped
class UserAuthInfo @Inject() constructor(@ApplicationContext context: Context) {
    var navgraph  = mutableListOf<String>()


    init {
        Log.d("@Dagger", Companion.TAG)
    }

    companion object {
        private const val TAG = "UserAuthInfo"
    }
}

class ScopeTest @Inject constructor( @Param3  var test1 : Test1){
    var userAuthInfo = test1

}