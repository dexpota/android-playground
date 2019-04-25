package me.destro.android.navigation

import android.content.Intent
import androidx.databinding.DataBindingUtil
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.destro.android.navigation.databinding.ActivityExamplesBinding
import me.destro.android.navigation.fullexample.FullExampleActivity
import me.destro.android.navigation.databinding.ActivityNavigationHostBinding

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
