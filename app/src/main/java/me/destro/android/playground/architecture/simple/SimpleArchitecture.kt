package me.destro.android.playground.architecture.simple

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import me.destro.playground.android.R

import kotlinx.android.synthetic.main.activity_simple_architecture.*

class SimpleArchitecture : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_architecture)
    }

}
