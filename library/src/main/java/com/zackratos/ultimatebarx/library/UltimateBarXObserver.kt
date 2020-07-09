package com.zackratos.ultimatebarx.library

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent

/**
 * @Author   : zhangwenchao
 * @Date     : 2020/6/28  12:47 PM
 * @email    : zhangwenchao@soulapp.cn
 * @Describe :
 */
internal class UltimateBarXObserver: LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy(owner: LifecycleOwner) {
        UltimateBarXManager.getInstance().removeAllData(owner)
    }
}