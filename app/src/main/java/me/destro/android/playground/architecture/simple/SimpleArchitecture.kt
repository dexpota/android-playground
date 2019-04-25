package me.destro.android.playground.architecture.simple

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;
import me.destro.playground.android.R

import kotlinx.android.synthetic.main.activity_simple_architecture.*

class SimpleArchitecture : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_architecture)
    }

}
