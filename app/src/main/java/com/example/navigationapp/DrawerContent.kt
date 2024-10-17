package com.example.navigationapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DrawerContent(
    menus: Array<DrawerMenu>,
    onMenuClick: (String) -> Unit
) {
    Column(modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),
            contentAlignment = Alignment.Center) {
            Image(
                modifier = Modifier.size(150.dp),
                imageVector = Icons.Default.AccountCircle,
                contentScale = ContentScale.Crop,
                contentDescription = "Profile Picture"
            )
        }
        Spacer(modifier = Modifier.height(12.dp))
        menus.forEach { menu ->
            NavigationDrawerItem(
                label = {Text(text = menu.title)},
                icon = {Icon(imageVector = menu.icon, contentDescription = menu.title)},
                selected = false,
                onClick = {
                    onMenuClick(menu.route)
                }
            )
        }
    }
}

//@Preview(showSystemUi = true, showBackground = true)
//@Composable
//fun DrawerContentPreview() {
//    DrawerContent(
//        menus = arrayOf(
//            DrawerMenu("Dashboard", Icons.Default.AccountCircle, "dashboard"),
//            DrawerMenu("Profile", Icons.Default.AccountCircle, "profile"),
//            DrawerMenu("Settings", Icons.Default.AccountCircle, "settings")
//        )
//    ) {}
//}