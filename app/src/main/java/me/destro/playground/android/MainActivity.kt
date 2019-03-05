package me.destro.playground.android

import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import me.destro.playground.android.databinding.ActivityMainBinding
import me.destro.playground.android.navigation.NavigationHostActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        binding.googleNavigation.setOnClickListener {
            val intent = Intent(this, NavigationHostActivity::class.java)
            startActivity(intent)
        }

    }
}