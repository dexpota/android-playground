package me.destro.android.playground

import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import me.destro.playground.android.databinding.ActivityMainBinding
import me.destro.android.playground.reactivex.ObservableErrors
import me.destro.playground.android.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this,
            R.layout.activity_main
        )

        binding.alertDialog.setOnClickListener {
            val alertDialog = AlertDialog.Builder(this)
                .setTitle("Titolo")
                .setMessage("Messaggio")
                .setPositiveButton("Ok", null)
                .setNegativeButton("No", null)
                .setNeutralButton("Neutral", null)
                .show()
        }

        binding.observableErrors.setOnClickListener {
            val intent = Intent(this, ObservableErrors::class.java)
            startActivity(intent)
        }
    }
}