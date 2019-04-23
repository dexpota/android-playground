package me.destro.android.navigation

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController
import androidx.navigation.ui.navigateUp
import me.destro.android.navigation.databinding.ActivityNavigationHostBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNavigationHostBinding
    private lateinit var navigationController: NavController
    private var appBarConfiguration = AppBarConfiguration(setOf(R.id.loginFragment, R.id.socialFragment))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_navigation_host)

        navigationController = findNavController(R.id.navigation_host)

        setupActionBarWithNavController(this, navigationController, appBarConfiguration)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navigationController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}
