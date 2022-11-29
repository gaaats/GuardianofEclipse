package com.deuscraft.Turbo

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.deuscraft.Turbo.MainMainClass.Companion.countryCodefrrfrfrfrrf
import com.deuscraft.Turbo.MainMainClass.Companion.geomeogtgt
import com.deuscraft.Turbo.databinding.ActivityMainBinding
import com.facebook.applinks.AppLinkData
import com.orhanobut.hawk.Hawk
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    private lateinit var gtgtgttg: ActivityMainBinding

    fun frgtttg(context: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            context
        ) { appLinkData: AppLinkData? ->
            appLinkData?.let {
                val bgbggbg = appLinkData.targetUri.host.toString()
                Hawk.put(MainMainClass.DEEPLfrfrfrfr, bgbggbg)
            }
            if (appLinkData == null) {
            }
        }
    }

    private suspend fun getDataDev() {

        val yhhyyyh = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://guardianofeclipse.xyz/")
            .build()
            .create(ServiceApi::class.java)
        val frfrrfgr = yhhyyyh.getDataDev().body()?.gyhyhy.toString()
        val appsCheckerfgtt = yhhyyyh.getDataDev().body()?.appsCheckergtgttgtgt.toString()
        val retroDatafrffr = yhhyyyh.getDataDev().body()?.geofgtt.toString()


        Log.d("lolo", "frfrrfgr $frfrrfgr")
        Log.d("lolo", "appsCheckerfgtt $appsCheckerfgtt")
        Log.d("lolo", "retroDatafrffr $retroDatafrffr")


        Hawk.put(MainMainClass.linkfrrrfrffr, frfrrfgr)
        Hawk.put(MainMainClass.appsCheckfrr6, appsCheckerfgtt)
        Hawk.put(MainMainClass.geomeogtgt, retroDatafrffr)

    }


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        gtgtgttg = ActivityMainBinding.inflate(layoutInflater)
        setContentView(gtgtgttg.root)

        frgtttg(this)

        val hyhyhy = Executors.newSingleThreadScheduledExecutor()
        var ffgtgtt: String? = Hawk.get(countryCodefrrfrfrfrrf, null)
        var ge: String? = Hawk.get(geomeogtgt, null)
        hyhyhy.scheduleAtFixedRate({
            if (ffgtgtt != null && ge != null) {
                hyhyhy.shutdown()
                gttgtth()
            } else {
                ffgtgtt = Hawk.get(countryCodefrrfrfrfrrf)
                ge = Hawk.get(geomeogtgt)
            }
        }, 0, 1, TimeUnit.SECONDS)

        GlobalScope.launch(Dispatchers.IO) {
            frfrrfrf
        }
    }




    private suspend fun getDatafrgtt() {
        val retrofitBuilder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://pro.ip-api.com/")
            .build()
            .create(ServiceApi::class.java)
        val retData = retrofitBuilder.getData().body()?.countryCodefgtgt

        Hawk.put(countryCodefrrfrfrfrrf, retData)
    }

    private val frfrrfrf: Job = GlobalScope.launch(Dispatchers.IO) {
        getDatafrgtt()
        getDataDev()
    }

    private fun gttgtth() {
        val frfrgrt = Intent(this@MainActivity, SortOneActivity::class.java)
        Log.d("lolo", "i am goingo to SortOneActivity")
        startActivity(frfrgrt)
        finish()
    }


}