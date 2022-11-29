package com.deuscraft.Turbo

import android.app.Application
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk

class MainMainClass:Application() {
    companion object {
        const val oneSfrgtftrgt = "ae2ba49b-c348-4cf3-9ae6-dcf241a3b89c"
        var appsCheckfrr6 = "appsChecker"
        var geomeogtgt = "geo"
        var C1gttggtgt: String? = "c11"
        var linkfrrrfrffr = "link"
        var MAIN_IDffrrfrrf: String? = "mainid"
        var DEEPLfrfrfrfr: String? = "d11"
        var countryCodefrrfrfrfrrf: String? = "countryCode"
    }

    override fun onCreate() {
        super.onCreate()
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)

        OneSignal.initWithContext(this)
        OneSignal.setAppId(oneSfrgtftrgt)
        Hawk.init(this).build()
    }
}
