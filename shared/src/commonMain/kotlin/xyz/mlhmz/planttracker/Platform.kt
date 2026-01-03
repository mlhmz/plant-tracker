package xyz.mlhmz.planttracker

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform