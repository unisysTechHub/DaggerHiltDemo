package com.unisytech.daggerhiltdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.unisytech.daggerhiltdemo.di.*
//import com.unisytech.daggerhiltdemo.di.DaggerAppGraph
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
   @Inject lateinit var userAuthInfo: UserAuthInfo
   @Inject lateinit var scopeTest : ScopeTest
    //@Inject lateinit var param1 : String
    @Param1 @Inject lateinit var test1 : Test1
    @Param2 @Inject lateinit var test2 : Test1
    @Inject lateinit var customView: CustomView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    //  var appGraph =  DaggerAppGraph.builder().build()
      //  appGraph.inject(this)
   //  var appGraph = DaggerAppGraph.builder().build()
      //  appGraph.userAuthInfo().navgraph.plus("MainActivity")
       // Log.d("@Dagger",appGraph.userAuthInfo().navgraph.size.toString())
       // appGraph.userAuthInfo().navgraph[0] = "My activity"
        userAuthInfo.navgraph.add("My Activity")
        Log.d("@Dagger", customView.toString())

        userAuthInfo.navgraph.forEach { Log.d("@Dagger", it) }

        Log.d("@Dagger",test1.name)
        Log.d("@Dagger",test2.name)
        Log.d("@Dagger", "end of oncreate")
       // Log.d("@Dagger", scopeTest.userAuthInfo.navgraph[0])
//      var intent=  Intent(this,LogoutActivity::class.java)
//        startActivity(intent)

      //  Log.d("@Dagger",customView.id.toString())
       // Log.d("@Dagger",param1.toString())

    }
}