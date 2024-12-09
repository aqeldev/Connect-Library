package org.connecttag.commons.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import org.connecttag.commons.extensions.syncGlobalConfig
import org.connecttag.commons.helpers.MyContentProvider

class FossifyBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent?.action == MyContentProvider.ACTION_GLOBAL_CONFIG_UPDATED) {
            context?.syncGlobalConfig()
        }
    }
}
