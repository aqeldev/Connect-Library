package org.connecttag.commons.samples

import com.github.ajalt.reprint.core.Reprint
import org.connecttag.commons.MainApplication

class App : MainApplication() {
    override fun onCreate() {
        super.onCreate()
        Reprint.initialize(this)
    }
}
