package com.party.guam

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform