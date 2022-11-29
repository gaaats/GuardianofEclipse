package com.deuscraft.Turbo

import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.deuscraft.Turbo.databinding.FragmentGaaaamyBinding
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class GaaaamyFragment : Fragment() {
    private var gtgtgtgt: FragmentGaaaamyBinding? = null
    private val nhnhjj
        get() = gtgtgtgt ?: throw RuntimeException("FragmentGaaaamyBinding = null")

    private fun makeError() {
        Snackbar.make(
            nhnhjj.root,
            "There is some error, try again",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    val nhjhjjj by lazy {
        listOf(
            ContextCompat.getDrawable(requireActivity(), R.drawable.dog),
            ContextCompat.getDrawable(requireActivity(), R.drawable.dag),
        )
    }

    val variant1fr = listOf(0, 2, 3)
    val variant2ggt = listOf(2, 3, 5)
    val variant3gtgt = listOf(1, 4, 5)
    val variant4gt = listOf(0, 4, 5)
    val variant5gtgt = listOf(0, 3, 5)

    val gtgtgt = listOf(
        variant1fr,
        variant2ggt,
        variant3gtgt,
        variant4gt,
        variant5gtgt,
    ).shuffled()

    var hyhyhy = true
    var yhyhy = true

    val bgbggb by lazy {
        listOf(
            nhnhjj.imgElem1Back,
            nhnhjj.imgElem2Back,
            nhnhjj.imgElem3Back,
            nhnhjj.imgElem4Back,
            nhnhjj.imgElem5Back,
            nhnhjj.imgElem6Back
        )
    }





    private fun createAnimatorSetFront(): AnimatorSet {
        return AnimatorInflater.loadAnimator(
            requireContext().applicationContext,
            R.animator.front_animator
        ) as AnimatorSet
    }

    private fun createAnimatorSetBack(): AnimatorSet {
        return AnimatorInflater.loadAnimator(
            requireContext().applicationContext,
            R.animator.back_animator
        ) as AnimatorSet
    }

    private val frontAnim1gtgt by lazy {
        createAnimatorSetFront()
    }
    private val ggtt by lazy {
        createAnimatorSetFront()
    }
    private val nhnhnnhnh by lazy {
        createAnimatorSetFront()
    }
    private val hhhhhhhhhhh by lazy {
        createAnimatorSetFront()
    }
    private val jjjjjuku by lazy {
        createAnimatorSetFront()
    }
    private val kkkkikii by lazy {
        createAnimatorSetFront()
    }


    private val nnnnnhjuujuu by lazy {
        createAnimatorSetBack()
    }

    private val njmmkkk by lazy {
        createAnimatorSetBack()
    }

    private val jujuujujuj by lazy {
        createAnimatorSetBack()
    }
    private val nhjujjuujuj by lazy {
        createAnimatorSetBack()
    }
    private val mnjmjhjkkkk by lazy {
        createAnimatorSetBack()
    }
    private val vfgjjukilko by lazy {
        createAnimatorSetBack()
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            nhnhjj.root.background.alpha = 195
            val bgbbgbg = gtgtgt.random()
            Log.d("lolo", "currentVariant ${bgbbgbg} ")

            for (element in 0..5) {
                if (bgbbgbg.contains(element)) {
                    Log.d("lolo", "currentVariant.contains OK ")
                    bgbggb[element].contentDescription = "ok"
                    val imaaaage = ContextCompat.getDrawable(requireActivity(), R.drawable.dog1)
                    bgbggb[element].setImageDrawable(imaaaage)
                } else {
                    Log.d("lolo", "currentVariant.contains FALSE")
                    bgbggb[element].contentDescription = "false"
                    bgbggb[element].setImageDrawable(nhjhjjj.random())
                }
            }


            if (yhyhy) {
                lifecycleScope.launch {
                    thhthtthtf()
                    bgbgbgffff()
                    vffffggg()
                    sdefdfvfvf()
                    hyujkooppp()
                    vbgmjkloo()

                    delay(2000)

                    bgbgbgnhh()
                    njukukkjjj()
                    xsdvghgh()
                    vfrrthy()
                    bghjj()
                    launchAnimationIsBackElem6()
                }


            }


            val bbgbgbgbg = requireContext().applicationContext.resources.displayMetrics.density
            nhnhjj.imgElem1.cameraDistance = 8000 * bbgbgbgbg
            nhnhjj.imgElem1Back.cameraDistance = 8000 * bbgbgbgbg


            nhnhjj.btnImgExitInfo.setOnClickListener {
                requireActivity().onBackPressed()
            }

            nhnhjj.imgElem1.setOnClickListener {
                thhthtthtf()
                lifecycleScope.launch {
                    if (nhnhjj.imgElem1Back.contentDescription == "ok") {
                        nhnhjj.imgElem1.isEnabled = false
                        delay(900)
                        nhnhjj.imgElem1.visibility = View.INVISIBLE
                        bgbgbgnhh()
                        nhnhjj.imgElem1Back.contentDescription = "done"
                        if (bgbhhhh()) tgtgtgtgt()
                    } else {
                        delay(2000)
                        bgbgbgnhh()
                    }
                }
            }
            nhnhjj.imgElem2.setOnClickListener {
                bgbgbgffff()
                lifecycleScope.launch {
                    if (nhnhjj.imgElem2Back.contentDescription == "ok") {
                        nhnhjj.imgElem2.isEnabled = false
                        delay(900)
                        nhnhjj.imgElem2.visibility = View.INVISIBLE
                        njukukkjjj()
                        nhnhjj.imgElem2Back.contentDescription = "done"
                        if (bgbhhhh()) tgtgtgtgt()

                    } else {
                        delay(2000)
                        njukukkjjj()
                    }
                }

            }

            nhnhjj.imgElem3.setOnClickListener {
                vffffggg()
                lifecycleScope.launch {
                    if (nhnhjj.imgElem3Back.contentDescription == "ok") {
                        nhnhjj.imgElem3.isEnabled = false
                        delay(900)
                        nhnhjj.imgElem3.visibility = View.INVISIBLE
                        xsdvghgh()
                        nhnhjj.imgElem3Back.contentDescription = "done"

                        if (bgbhhhh()) tgtgtgtgt()
                    } else {
                        delay(2000)

                        xsdvghgh()
                    }
                }

            }

            nhnhjj.imgElem4.setOnClickListener {
                sdefdfvfvf()
                lifecycleScope.launch {
                    if (nhnhjj.imgElem4Back.contentDescription == "ok") {
                        nhnhjj.imgElem4.isEnabled = false
                        delay(900)
                        nhnhjj.imgElem4.visibility = View.INVISIBLE
                        vfrrthy()
                        nhnhjj.imgElem4Back.contentDescription = "done"

                        if (bgbhhhh()) tgtgtgtgt()
                    } else {
                        delay(2000)

                        vfrrthy()
                    }
                }

            }

            nhnhjj.imgElem5.setOnClickListener {
                hyujkooppp()
                lifecycleScope.launch {
                    if (nhnhjj.imgElem5Back.contentDescription == "ok") {
                        nhnhjj.imgElem5.isEnabled = false
                        delay(900)
                        nhnhjj.imgElem5.visibility = View.INVISIBLE
                        bghjj()
                        nhnhjj.imgElem5Back.contentDescription = "done"

                        if (bgbhhhh()) tgtgtgtgt()
                    } else {
                        delay(2000)

                        bghjj()
                    }
                }

            }

            nhnhjj.imgElem6.setOnClickListener {
                vbgmjkloo()
                lifecycleScope.launch {
                    if (nhnhjj.imgElem6Back.contentDescription == "ok") {
                        nhnhjj.imgElem6.isEnabled = false
                        delay(900)
                        nhnhjj.imgElem6.visibility = View.INVISIBLE
                        launchAnimationIsBackElem6()
                        nhnhjj.imgElem6Back.contentDescription = "done"

                        if (bgbhhhh()) tgtgtgtgt()
                    } else {
                        delay(2000)
                        launchAnimationIsBackElem6()
                    }
                }
            }


        } catch (e: Exception) {
            makeError()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    private fun iniOnClickListener(view: View, funIsFront: Unit, funForBack: Unit) {
        val byhhgfdcvv = view as ImageView
        funIsFront
        lifecycleScope.launch {
            if (byhhgfdcvv.contentDescription == "ok") {
                view.isEnabled = false
                delay(1000)
                view.visibility = View.INVISIBLE
                funForBack
            } else {
                funForBack
            }
        }
        if (bgbhhhh()) {
            tgtgtgtgt()

        }
    }

    private fun tgtgtgtgt() {
        findNavController().navigate(R.id.action_gaaaamyFragment_to_reloadFragment)
    }

    private fun gythhyhy(elemFront: ImageView) = elemFront.visibility == View.INVISIBLE

    private fun bgbhhhh(): Boolean {
        var counttteeer = 0
        for (i in bgbggb) {
            if (i.contentDescription == "done") {
                counttteeer++
            }
        }
        return counttteeer == 3

    }

    override fun onPause() {
        onDestroy()
        super.onPause()
    }

    private fun bgbgbgnhh() {
        rfrfrr56(
            frontAnim1gtgt,
            nnnnnhjuujuu,
            nhnhjj.imgElem1,
            nhnhjj.imgElem1Back
        )
    }

    private fun njukukkjjj() {
        rfrfrr56(
            ggtt,
            njmmkkk,
            nhnhjj.imgElem2,
            nhnhjj.imgElem2Back
        )
    }

    private fun vfrrthy() {
        rfrfrr56(
            hhhhhhhhhhh,
            nhjujjuujuj,
            nhnhjj.imgElem4,
            nhnhjj.imgElem4Back
        )
    }

    private fun bghjj() {
        rfrfrr56(
            jjjjjuku,
            mnjmjhjkkkk,
            nhnhjj.imgElem5,
            nhnhjj.imgElem5Back
        )
    }

    private fun xsdvghgh() {
        rfrfrr56(
            nhnhnnhnh,
            jujuujujuj,
            nhnhjj.imgElem3,
            nhnhjj.imgElem3Back
        )
    }



    private fun launchAnimationIsBackElem6() {
        rfrfrr56(
            kkkkikii,
            vfgjjukilko,
            nhnhjj.imgElem6,
            nhnhjj.imgElem6Back
        )
    }


    private fun thhthtthtf() {
        bvbvbbvvbvbvb(
            frontAnim1gtgt, nnnnnhjuujuu, nhnhjj.imgElem1, nhnhjj.imgElem1Back
        )
    }

    private fun bgbgbgffff() {
        bvbvbbvvbvbvb(
            ggtt, njmmkkk, nhnhjj.imgElem2, nhnhjj.imgElem2Back
        )
    }

    private fun vffffggg() {
        bvbvbbvvbvbvb(
            nhnhnnhnh, jujuujujuj, nhnhjj.imgElem3, nhnhjj.imgElem3Back
        )
    }

    private fun sdefdfvfvf() {
        bvbvbbvvbvbvb(
            hhhhhhhhhhh, nhjujjuujuj, nhnhjj.imgElem4, nhnhjj.imgElem4Back
        )
    }

    private fun hyujkooppp() {
        bvbvbbvvbvbvb(
            jjjjjuku, mnjmjhjkkkk, nhnhjj.imgElem5, nhnhjj.imgElem5Back
        )
    }

    private fun vbgmjkloo() {
        bvbvbbvvbvbvb(
            kkkkikii, vfgjjukilko, nhnhjj.imgElem6, nhnhjj.imgElem6Back
        )
    }

    private fun rfrfrr56(
        frontAnim: AnimatorSet,
        backAnim: AnimatorSet,
        elemFront: ImageView,
        elemBack: ImageView
    ) {
        frontAnim.setTarget(elemBack)
        backAnim.setTarget(elemFront)
        frontAnim.start()
        backAnim.start()
    }


    private fun bvbvbbvvbvbvb(
        frontAnim: AnimatorSet,
        backAnim: AnimatorSet,
        elemFront: ImageView,
        elemBack: ImageView
    ) {
        frontAnim.setTarget(elemFront)
        backAnim.setTarget(elemBack)
        frontAnim.start()
        backAnim.start()
    }




    override fun onDestroy() {
        gtgtgtgt = null
        super.onDestroy()
    }




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        gtgtgtgt = FragmentGaaaamyBinding.inflate(inflater, container, false)
        return nhnhjj.root
    }
}