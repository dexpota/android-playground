package me.destro.android.navigation.destinations

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import me.destro.android.navigation.R
import me.destro.android.navigation.databinding.FragmentSocialBinding

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
