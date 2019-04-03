package me.destro.android.databinding.model

// This user implement a one-way data binding, if you change the data of the user it's not reflected on the UI.
data class User(var name : String, var surname : String, var nickname : String?, var hobbies : List<String>?)