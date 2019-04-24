package me.destro.android.navigation

import android.content.Intent
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController
import androidx.navigation.ui.navigateUp
import me.destro.android.navigation.databinding.ActivityNavigationHostBinding
import me.destro.android.navigation.fullexample.FullExampleActivity
import me.destro.android.navigation.databinding.ActivityExamplesBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNavigationHostBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityExamplesBinding>(this, R.layout.activity_examples)


        binding.basic.root.setOnClickListener { view ->
            val intent = Intent(this, FullExampleActivity::class.java)
            startActivity(intent)
        }

        binding.basic.title.text = "Full example"
        binding.basic.description.text = "Description"
    }

}
