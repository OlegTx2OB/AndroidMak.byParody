package com.example.makby.view.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.makby.viewmodel.HomeViewModel


@Composable
fun HomeScreen(mNavController: NavController, mVm: HomeViewModel) {
    Text(text = "Home", fontSize = 100.sp)
}