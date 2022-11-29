package com.deuscraft.Turbo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.deuscraft.Turbo.MainMainClass.Companion.C1gttggtgt
import com.deuscraft.Turbo.MainMainClass.Companion.DEEPLfrfrfrfr
import com.deuscraft.Turbo.MainMainClass.Companion.appsCheckfrr6
import com.deuscraft.Turbo.MainMainClass.Companion.countryCodefrrfrfrfrrf
import com.deuscraft.Turbo.MainMainClass.Companion.geomeogtgt
import com.deuscraft.Turbo.databinding.ActivitySortTvoBinding
import com.orhanobut.hawk.Hawk
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class SortTvoActivity : AppCompatActivity() {
    lateinit var bindAsffrffrr: ActivitySortTvoBinding

    private fun intLONEfrfrrf() {
        Log.d("lolo", "go to GaaaammmyyyActivity from SortTvoActivity")
        val gtggtgt = Intent(this@SortTvoActivity, GaaaammmyyyActivity::class.java)
        Hawk.put(geomeogtgt, null)
        Hawk.put(countryCodefrrfrfrfrrf, null)
        Hawk.put(appsCheckfrr6, null)
        startActivity(gtggtgt)
        finish()
    }

    private fun intWEdrfrrf() {
        Log.d("lolo", "go to BrovserActivity from SortTvoActivity")
        val bhnhnhh = Intent(this@SortTvoActivity, BrovserActivity::class.java)
        Hawk.put(geomeogtgt, null)
        Hawk.put(countryCodefrrfrfrfrrf, null)
        Hawk.put(appsCheckfrr6, null)
        startActivity(bhnhnhh)
        finish()
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        bindAsffrffrr = ActivitySortTvoBinding.inflate(layoutInflater)
        setContentView(bindAsffrffrr.root)

        val appsChfrffrrf: String? = Hawk.get(appsCheckfrr6, "null")

        if (appsChfrffrrf == "1") {
            AppsFlyerLib.getInstance()
                .init("hpGXtgJJcTGTTkKhADffJc", ghyhyju, applicationContext)
            AppsFlyerLib.getInstance().start(this)
        }

        hyhyhhy()

    }

    private val ghyhyju = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val dataGotten = data?.get("campaign").toString()
            Hawk.put(C1gttggtgt, dataGotten)
        }
        override fun onConversionDataFail(p0: String?) {}
        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {}
        override fun onAttributionFailure(p0: String?) {}
    }


    private fun hyhyhhy() {

        val ftgtgttg: String = Hawk.get(geomeogtgt)
        val countyCfrfrrfrfgttgt: String = Hawk.get(countryCodefrrfrfrfrrf, "null")

        val deeplinkgtgttggtgtgt: String? = Hawk.get(DEEPLfrfrfrfr, "null")
        val appsChfrfgtggtgtgt: String? = Hawk.get(appsCheckfrr6, "null")
        var namingfrfrrrgtggt: String? = Hawk.get(C1gttggtgt)

        if (appsChfrfgtggtgtgt == "1") {

            Log.d("lolo", "appsChfrfgtg $appsChfrfgtggtgtgt")



            val gtgtgttg = Executors.newSingleThreadScheduledExecutor()
            gtgtgttg.scheduleAtFixedRate({
                if (namingfrfrrrgtggt != null) {
                    Log.d("lolo", "namingfrfrrr $namingfrfrrrgtggt")
                    Log.d("lolo", "deeplinkgtgttg $deeplinkgtgttggtgtgt")

                    if (namingfrfrrrgtggt!!.contains("tdb2") || ftgtgttg.contains(countyCfrfrrfrfgttgt) || deeplinkgtgttggtgtgt!!.contains("tdb2")) {
                        gtgtgttg.shutdown()
                        intWEdrfrrf()
                        Log.d("lolo", "namingfrfrrr $namingfrfrrrgtggt")
                        Log.d("lolo", "deeplinkgtgttg $deeplinkgtgttggtgtgt")
                    } else {
                        gtgtgttg.shutdown()
                        intLONEfrfrrf()

                        Log.d("lolo", "namingfrfrrr $namingfrfrrrgtggt")
                        Log.d("lolo", "deeplinkgtgttg $deeplinkgtgttggtgtgt")
                    }
                } else {
                    namingfrfrrrgtggt = Hawk.get(C1gttggtgt)

                    Log.d("lolo", "namingfrfrrr $namingfrfrrrgtggt")
                    Log.d("lolo", "deeplinkgtgttg $deeplinkgtgttggtgtgt")
                }
            }, 0, 1, TimeUnit.SECONDS)
        }  else if (ftgtgttg.contains(countyCfrfrrfrfgttgt)) {

            Log.d("lolo", "namingfrfrrr $namingfrfrrrgtggt")
            Log.d("lolo", "deeplinkgtgttg $deeplinkgtgttggtgtgt")
            intWEdrfrrf()
        } else {

            Log.d("lolo", "namingfrfrrr $namingfrfrrrgtggt")
            Log.d("lolo", "deeplinkgtgttg $deeplinkgtgttggtgtgt")
            intLONEfrfrrf()
        }

    }


}