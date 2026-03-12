package com.FlickReels

import android.content.Context
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

@CloudstreamPlugin
class FlickReelsPlugin : Plugin() {
    override fun load(context: Context) {
        Flickreels.context = context
        registerMainAPI(FlickReels())
    }
}
