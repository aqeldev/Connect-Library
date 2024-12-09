package org.connecttag.commons

import android.app.Application
import androidx.lifecycle.ProcessLifecycleOwner
import org.connecttag.commons.extensions.appLockManager
import org.connecttag.commons.extensions.checkUseEnglish

open class MainApplication : Application() {

    open val isAppLockFeatureAvailable = false

    override fun onCreate() {
        super.onCreate()
        checkUseEnglish()
        setupAppLockManager()
    }

    private fun setupAppLockManager() {
        if (isAppLockFeatureAvailable) {
            ProcessLifecycleOwner.get().lifecycle.addObserver(appLockManager)
        }
    }
}
