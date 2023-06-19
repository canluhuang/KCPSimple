package com.kmm.kcpsimple

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform