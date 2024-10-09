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