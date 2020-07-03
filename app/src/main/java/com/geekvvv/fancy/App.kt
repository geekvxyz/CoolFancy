package com.geekvvv.fancy

import android.app.Application
import okhttp3.OkHttpClient
import rxhttp.wrapper.param.RxHttp

class App : Application() {


    override fun onCreate() {
        super.onCreate()
        RxHttpManager.init(this)
    }
}