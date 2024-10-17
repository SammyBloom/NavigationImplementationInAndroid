package com.example.navigationapp

import android.R.attr.navigationIcon
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(drawerState: DrawerState?, title: String) {
    val coroutineScope = rememberCoroutineScope()
    CenterAlignedTopAppBar(
        navigationIcon = {
            if (drawerState != null) {
                IconButton(
                    onClick = {
                        coroutineScope.launch {
                            drawerState.open()
                        }
                    }
                ) {
                    Icon(
                        Icons.Default.Menu,
                        contentDescription = "Navigation drawer opener",
                        modifier = Modifier.size(23.dp))
                }
            }
        },

        title = { Text(text = title) },

//        navigationIcon = {
//            if (drawerState != null) {
//                IconButton(
//                    onClick = {
//                       /*TO DO*/
//                    }
//                ) {
//                    Icon(
//                        Icons.Default.ShoppingCart,
//                        contentDescription = "Shopping cart opener",
//                        modifier = Modifier.size(23.dp))
//                }
//            }
//        }
    )
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun TopAppBarPreview() {
    TopAppBar(
        drawerState = rememberDrawerState(initialValue = DrawerValue.Closed),
        title = "Title"
    )
}