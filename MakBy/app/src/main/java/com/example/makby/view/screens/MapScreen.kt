package com.example.makby.view.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.makby.viewmodel.MapViewModel


@Composable
fun MapScreen(navController: NavController, mVm: MapViewModel) {
    Text(text = "Map", fontSize = 100.sp)
}