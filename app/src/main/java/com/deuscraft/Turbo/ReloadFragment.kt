package com.deuscraft.Turbo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.deuscraft.Turbo.databinding.FragmentReloadBinding
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.delay


class ReloadFragment : Fragment() {
    private var hyhhy: FragmentReloadBinding? = null
    private val hyhyjiki get() = hyhhy ?: throw RuntimeException("FragmentReloadBinding = null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        hyhhy = FragmentReloadBinding.inflate(inflater, container, false)
        return hyhyjiki.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            lifecycleScope.launchWhenCreated {
                delay(1500)
                findNavController().navigate(R.id.action_reloadFragment_to_gaaaamyFragment)
            }


        } catch (e: Exception) {
            vfvvf()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    override fun onPause() {
        onDestroy()
        super.onPause()
    }

    override fun onDestroy() {
        hyhhy = null
        super.onDestroy()
    }

    private fun vfvvf() {
        Snackbar.make(
            hyhyjiki.root,
            "Some error...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

}