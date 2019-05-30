package me.destro.android.playground

import android.content.Intent
import androidx.databinding.DataBindingUtil
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import me.destro.android.common.ExampleAdapter
import me.destro.android.common.ExampleItem
import me.destro.android.playground.permissions.PermissionsActivity
import me.destro.android.playground.reactivex.ObservableErrors
import me.destro.playground.android.databinding.ActivityMainBinding
import me.destro.playground.android.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        val adapter = ExampleAdapter()

        adapter.exampleItems = listOf(
            ExampleItem("RxBinding", "Test of rx binding", ObservableErrors::class.java),
            ExampleItem("Permissions", "Permission", PermissionsActivity::class.java),
            ExampleItem("Architectures", "Architecture", PermissionsActivity::class.java),
            ExampleItem("data-binding", "data-binding", me.destro.android.playground.jetpack.databinding.MainActivity::class.java)
        )

        adapter.setOnItemClickedListener { example ->
            val intent = Intent(this, example.activity)
            startActivity(intent)
        }

        binding.rvExamples.adapter = adapter

    }
}