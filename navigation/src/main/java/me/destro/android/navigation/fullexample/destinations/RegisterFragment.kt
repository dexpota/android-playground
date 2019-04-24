package me.destro.android.navigation.fullexample.destinations

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import me.destro.android.navigation.R
import me.destro.android.navigation.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentRegisterBinding>(inflater, R.layout.fragment_register, container, false)

        binding.register.setOnClickListener {
            NavHostFragment.findNavController(this).navigateUp()
        }

        return binding.root
    }
}
