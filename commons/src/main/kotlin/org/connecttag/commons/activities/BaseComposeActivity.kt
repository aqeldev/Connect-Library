package org.connecttag.commons.activities

import androidx.activity.ComponentActivity
import org.connecttag.commons.helpers.REQUEST_APP_UNLOCK

abstract class BaseComposeActivity : ComponentActivity() {

    override fun onResume() {
        super.onResume()
        maybeLaunchAppUnlockActivity(REQUEST_APP_UNLOCK)
    }
}
