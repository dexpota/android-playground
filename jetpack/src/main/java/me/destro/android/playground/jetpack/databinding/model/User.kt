package me.destro.android.playground.jetpack.databinding.model

import java.util.*

// This user implement a one-way data binding, if you change the data of the user it's not reflected on the UI.
data class User(val id: Int, var name : String, var surname : String, var nickname : String?, val lastLogin: Date, var hobbies : List<String>?)