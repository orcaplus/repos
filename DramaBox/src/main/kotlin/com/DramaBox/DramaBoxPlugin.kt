package com.DramaBox

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

@CloudstreamPlugin
class DramaBoxPlugin : Plugin() {
    override fun load(context: android.content.Context) {
        registerMainAPI(DramaBox())
    }
}
