package org.connecttag.commons.compose.extensions

import android.app.Activity
import android.content.Context
import org.connecttag.commons.R
import org.connecttag.commons.extensions.baseConfig
import org.connecttag.commons.extensions.redirectToRateUs
import org.connecttag.commons.extensions.toast
import org.connecttag.commons.helpers.BaseConfig

val Context.config: BaseConfig get() = BaseConfig.newInstance(applicationContext)

fun Activity.rateStarsRedirectAndThankYou(stars: Int) {
    if (stars == 5) {
        redirectToRateUs()
    }
    toast(R.string.thank_you)
    baseConfig.wasAppRated = true
}
