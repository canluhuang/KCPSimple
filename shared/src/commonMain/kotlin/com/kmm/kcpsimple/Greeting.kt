package com.kmm.kcpsimple

import com.kmm.module.SimpleModule

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}! ${SimpleModule.greet()}"
    }
}