package com.example

import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescription
import net.mamoe.mirai.console.plugin.jvm.KotlinPlugin
import net.mamoe.mirai.utils.info

object Demo : KotlinPlugin(
    JvmPluginDescription(
        id = "com.example.test",
        name = "Demo",
        version = "0.1.0",
    ) {
        author("ganti")
    }
) {
    override fun onEnable() {
        logger.info { "Plugin loaded" }
    }
}