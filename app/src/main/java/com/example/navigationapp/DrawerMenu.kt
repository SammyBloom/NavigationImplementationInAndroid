package com.example.navigationapp

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

data class DrawerMenu(
    val icon: ImageVector,
    val title: String,
    val route: String) {
}

val menus = arrayOf(
    DrawerMenu(Icons.Default.Person, "Profile", Profile.route),
    DrawerMenu(Icons.Default.Settings, "Settings", Settings.route),
    DrawerMenu(Icons.Default.Info, "About", About.route)
)