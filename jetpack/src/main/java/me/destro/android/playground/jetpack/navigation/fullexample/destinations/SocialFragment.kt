package me.destro.android.playground.jetpack.navigation.fullexample.destinations

import androidx.databinding.DataBindingUtil
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import me.destro.android.playground.jetpack.R
import me.destro.android.playground.jetpack.databinding.FragmentSocialBinding

class SocialFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentSocialBinding>(inflater, R.layout.fragment_social, container, false)

        binding.user.setOnClickListener {
            val navController = NavHostFragment.findNavController(this)
            navController.navigate(R.id.userFragment    )
        }

        return binding.root
    }
}
