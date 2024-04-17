package com.example.makby.view.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.makby.viewmodel.MoreViewModel

@Composable
fun MoreScreen(navController: NavController, mVm: MoreViewModel) {
    Text(text = "More", fontSize = 100.sp)
}