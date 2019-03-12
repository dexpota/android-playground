package me.destro.learning.playground.android.navigation.destinations

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import me.destro.learning.playground.android.navigation.R
import me.destro.learning.playground.android.navigation.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentLoginBinding>(inflater, R.layout.fragment_login, container, false)

        binding.login.setOnClickListener {
            val navController = NavHostFragment.findNavController(this)
            navController.navigate(R.id.subgraph)
        }

        binding.register.setOnClickListener {
            val navController = NavHostFragment.findNavController(this)
            navController.navigate(R.id.registerFragment)
        }

        return binding.root
    }
}
