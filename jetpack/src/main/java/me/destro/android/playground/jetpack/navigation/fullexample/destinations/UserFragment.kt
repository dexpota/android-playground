package me.destro.android.playground.jetpack.navigation.fullexample.destinations

import androidx.databinding.DataBindingUtil
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import me.destro.android.playground.jetpack.MainNavigationDirections
import me.destro.android.playground.jetpack.R
import me.destro.android.playground.jetpack.databinding.FragmentUserBinding

class UserFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentUserBinding>(inflater, R.layout.fragment_user, container, false)

        //binding.logout.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.registration))

        binding.logout.setOnClickListener {
            findNavController().navigate(MainNavigationDirections.actionGlobalLoginNavigation())
        }

        return binding.root
    }


}
