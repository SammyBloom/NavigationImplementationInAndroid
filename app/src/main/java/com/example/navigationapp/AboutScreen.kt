package com.example.navigationapp

import androidx.compose.material3.DrawerState
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.rememberDrawerState
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun AboutScreen(drawerState: DrawerState) {
    Scaffold(
        topBar = { TopAppBar(
            drawerState = drawerState,
            title = "About"
        ) }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = " About Screen ")
        }
    }
}

@Preview
@Composable
fun AboutScreenPreview() {
    AboutScreen(drawerState = rememberDrawerState(initialValue = DrawerValue.Closed))
}