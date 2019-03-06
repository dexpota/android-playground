package me.destro.learning.playground.android.navigation

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import me.destro.learning.playground.android.navigation.databinding.ActivityNavigationHostBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<ActivityNavigationHostBinding>(this, R.layout.activity_navigation_host)
    }
}
