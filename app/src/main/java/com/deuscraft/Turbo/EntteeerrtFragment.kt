package com.deuscraft.Turbo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.deuscraft.Turbo.databinding.FragmentEntteeerrtBinding
import com.google.android.material.snackbar.Snackbar

class EntteeerrtFragment : Fragment() {



    private fun gthyhuyjuju() {
        Snackbar.make(
            gtgyhujuju.root,
            "Some error...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    private var bgbbggb: FragmentEntteeerrtBinding? = null
    private val gtgyhujuju get() = bgbbggb ?: throw RuntimeException("FragmentEntteeerrtBinding = null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bgbbggb = FragmentEntteeerrtBinding.inflate(inflater, container, false)
        return gtgyhujuju.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            gtgyhujuju.btnPlayGame.setOnClickListener {
                findNavController().navigate(R.id.action_entteeerrtFragment_to_gaaaamyFragment)
            }

        } catch (e: Exception) {
            gthyhuyjuju()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        bgbbggb = null
        super.onDestroy()
    }

}