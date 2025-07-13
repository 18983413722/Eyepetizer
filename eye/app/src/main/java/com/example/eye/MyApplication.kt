package com.example.eye

import android.app.Application
import com.alibaba.android.arouter.BuildConfig
import com.alibaba.android.arouter.launcher.ARouter

/**
 *description:能看小说的app
 * author 王以飞
 * email 1206897770@qq.com
 * date 2025-2-18
 */
class MyApplication : Application() {
    lateinit var context :MyApplication
    override fun onCreate() {
        super.onCreate()
        context = this
        if (BuildConfig.DEBUG){
            ARouter.openLog()
            ARouter.openDebug()
        }
        ARouter.init(context)
    }
}