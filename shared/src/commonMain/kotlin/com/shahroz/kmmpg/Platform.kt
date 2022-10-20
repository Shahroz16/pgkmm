package com.shahroz.kmmpg

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform