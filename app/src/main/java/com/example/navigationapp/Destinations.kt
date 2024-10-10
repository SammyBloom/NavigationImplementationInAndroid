package com.example.navigationapp

interface Destinations {
    val route: String
}

object Login : Destinations {
    override val route: String = "Login"
}

object Dashboard : Destinations {
    override val route: String = "Dashboard"
}

object Profile : Destinations {
    override val route: String = "Profile"
}

object Settings : Destinations {
    override val route: String = "Settings"
}

object About : Destinations {
    override val route: String = "About"
}