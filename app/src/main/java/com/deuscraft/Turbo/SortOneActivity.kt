package com.deuscraft.Turbo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.deuscraft.Turbo.MainMainClass.Companion.MAIN_IDffrrfrrf
import com.deuscraft.Turbo.MainMainClass.Companion.appsCheckfrr6
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.orhanobut.hawk.Hawk
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class SortOneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sort_one)
        checkCountry()
    }

    private fun intALonehyhyy() {
        val ddede = Intent(this@SortOneActivity, GaaaammmyyyActivity::class.java)
        Hawk.put(MainMainClass.geomeogtgt, null)
        Hawk.put(MainMainClass.countryCodefrrfrfrfrrf, null)
        Hawk.put(MainMainClass.appsCheckfrr6, null)
        startActivity(ddede)
        finish()
    }

    private fun ftgthy(): String? {
        val restCheckftgt: String? = Hawk.get(appsCheckfrr6)
        return restCheckftgt
    }

    private fun checkCountry() {

        val check = ftgthy()
        Log.d("lolo", "check $check")

        if (check == "0") {
            intALonehyhyy()

        } else {
            GlobalScope.launch(Dispatchers.Default) {
                gfgtgtt()
            }
            intAfbftgttgtgttt()
        }
    }

    private fun gfgtgtt() {
        val gtgttadInfo = AdvertisingIdClient(applicationContext)
        gtgttadInfo.start()
        val adIdInfofrrrf = gtgttadInfo.info.id
        Log.d("lolo", "AdvertisingIdClient $adIdInfofrrrf")
        Hawk.put(MAIN_IDffrrfrrf, adIdInfofrrrf)
    }

    private fun intAfbftgttgtgttt() {
        Log.d("lolo", "go to SortTvoActivity")
        val hyhyyhyhy = Intent(this@SortOneActivity, SortTvoActivity::class.java)
        startActivity(hyhyyhyhy)
        finish()
    }

}