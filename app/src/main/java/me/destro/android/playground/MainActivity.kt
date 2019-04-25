package me.destro.android.playground

import android.content.Intent
import androidx.databinding.DataBindingUtil
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
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
            AlertDialog.Builder(this)
                .setTitle(getString(R.string.dialog_generic_title))
                .setMessage(getString(R.string.dialog_generic_message))
                .setPositiveButton(getString(R.string.dialog_generic_positive), null)
                .setNegativeButton(getString(R.string.dialog_generic_negative), null)
                .setNeutralButton(getString(R.string.dialog_generic_neutral), null)
                .show()
        }

        binding.observableErrors.setOnClickListener {
            val intent = Intent(this, ObservableErrors::class.java)
            startActivity(intent)
        }
    }
}