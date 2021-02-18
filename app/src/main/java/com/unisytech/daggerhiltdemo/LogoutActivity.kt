package com.unisytech.daggerhiltdemo;

import android.os.Bundle;
import android.os.PersistableBundle
import android.util.Log

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.unisytech.daggerhiltdemo.di.UserAuthInfo
import dagger.hilt.android.AndroidEntryPoint

import javax.inject.Inject;

@AndroidEntryPoint
public class LogoutActivity : AppCompatActivity() {
    @Inject
    lateinit var userAuthInfo: UserAuthInfo

    //private AppBarConfiguration appBarConfiguration;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logout)
        userAuthInfo.navgraph.add("Logout Activity")

        userAuthInfo.navgraph.forEach { Log.d("@Dagger", it) }
    }

}