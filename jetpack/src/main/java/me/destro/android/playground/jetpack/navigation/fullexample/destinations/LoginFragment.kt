package me.destro.android.playground.jetpack.navigation.fullexample.destinations

import androidx.databinding.DataBindingUtil
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import me.destro.android.playground.jetpack.LoginNavigationDirections
import me.destro.android.playground.jetpack.R
import me.destro.android.playground.jetpack.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentLoginBinding>(inflater, R.layout.fragment_login, container, false)

        binding.login.setOnClickListener {
            findNavController().navigate(LoginNavigationDirections.actionGlobalSocialFragment())
        }
        binding.register.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.registerFragment))

        return binding.root
    }
}
