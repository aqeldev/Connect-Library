package org.connecttag.commons.activities

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.runtime.remember
import kotlinx.collections.immutable.toImmutableList
import org.connecttag.commons.compose.extensions.enableEdgeToEdgeSimple
import org.connecttag.commons.compose.screens.FAQScreen
import org.connecttag.commons.compose.theme.AppThemeSurface
import org.connecttag.commons.helpers.APP_FAQ
import org.connecttag.commons.models.FAQItem

class FAQActivity : BaseComposeActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdgeSimple()
        setContent {
            AppThemeSurface {
                val faqItems = remember { intent.getSerializableExtra(APP_FAQ) as ArrayList<FAQItem> }
                FAQScreen(
                    goBack = ::finish,
                    faqItems = faqItems.toImmutableList()
                )
            }
        }
    }
}
