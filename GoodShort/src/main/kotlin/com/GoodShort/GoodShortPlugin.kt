package com.GoodShort

import android.content.Context
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

@CloudstreamPlugin
class GoodShortPlugin : Plugin() {
    override fun load(context: Context) {
        Goodshort.context = context
        registerMainAPI(GoodShort())
    }
}
