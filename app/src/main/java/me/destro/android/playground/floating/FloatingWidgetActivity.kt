package me.destro.android.playground.floating

import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import me.destro.android.playground.floating.services.FloatingViewService
import me.destro.playground.android.R
import me.destro.playground.android.databinding.ActivityFloatingWidgetBinding


class FloatingWidgetActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFloatingWidgetBinding

    companion object {
        private const val CODE_DRAW_OVER_OTHER_APP_PERMISSION = 2084
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_floating_widget)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && !Settings.canDrawOverlays(this)) {
            val intent = Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION, Uri.parse("package:$packageName"))
            startActivityForResult(intent, CODE_DRAW_OVER_OTHER_APP_PERMISSION)
        }else {
            bindFloatingButton()
        }
    }

    private fun bindFloatingButton() {
        binding.floating.setOnClickListener {
            startService(Intent(this@FloatingWidgetActivity, FloatingViewService::class.java))
            finish()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == CODE_DRAW_OVER_OTHER_APP_PERMISSION && resultCode == RESULT_OK) {
            bindFloatingButton()
        } else {
            super.onActivityResult(requestCode, resultCode, data)
        }
    }

}
