package com.unisytech.daggerhiltdemo.di

import android.content.Context
import android.util.Log
import android.widget.LinearLayout
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

/**
 * Created by ramesh on 16/02/21.
 */

class CustomView @Inject() constructor(@ApplicationContext context: Context) {
    var navgraph : Array<String> = Array(10){it.toString()}


    init {
        Log.d("@Dagger", Companion.TAG)
    }

    companion object {
        private const val TAG = "UserAuthInfo"
    }
}