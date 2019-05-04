package me.destro.android.playground.dialogs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import me.destro.playground.android.R
import me.destro.playground.android.databinding.ActivityDialogBinding

class DialogActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDialogBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_dialog)

        binding.dialog.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle(getString(R.string.dialog_generic_title))
                .setMessage(getString(R.string.dialog_generic_message))
                .setPositiveButton(getString(R.string.dialog_generic_positive), null)
                .setNegativeButton(getString(R.string.dialog_generic_negative), null)
                .setNeutralButton(getString(R.string.dialog_generic_neutral), null)
                .show()
        }

    }
}
