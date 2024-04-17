package com.example.makby.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.makby.view.screens.CouponScreen
import com.example.makby.view.screens.HomeScreen
import com.example.makby.view.screens.MapScreen
import com.example.makby.view.screens.MenuScreen
import com.example.makby.view.screens.MoreScreen
import com.example.makby.view.screens.Screens
import com.example.makby.viewmodel.CouponViewModel
import com.example.makby.viewmodel.HomeViewModel
import com.example.makby.viewmodel.MapViewModel
import com.example.makby.viewmodel.MenuViewModel
import com.example.makby.viewmodel.MoreViewModel

@Composable
fun BottomNavigationBar() {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            NavigationBar {
                bottomNavigationItems().forEachIndexed { _, navigationItem ->
                    NavigationBarItem(
                        selected = navigationItem.route == currentDestination?.route,
                        label = {
                            Text(stringResource(navigationItem.labelId))
                        },
                        icon = {
                            Icon(
                                painterResource(navigationItem.iconId),
                                contentDescription = stringResource(navigationItem.labelId),
                                modifier = Modifier.size(20.dp)
                            )
                        },
                        onClick = {
                            navController.navigate(navigationItem.route) {
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                    )
                }
            }
        }
    ) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = Screens.Home.route,
            modifier = Modifier.padding(paddingValues = paddingValues)) {
            composable(Screens.Home.route) {
                val viewModel: HomeViewModel = viewModel()
                HomeScreen(navController, viewModel)
            }
            composable(Screens.Coupon.route) {
                val viewModel: CouponViewModel = viewModel()
                CouponScreen(navController, viewModel)
            }
            composable(Screens.Menu.route) {
                val viewModel: MenuViewModel = viewModel()
                MenuScreen(navController, viewModel)
            }
            composable(Screens.Map.route) {
                val viewModel: MapViewModel = viewModel()
                MapScreen(navController, viewModel)
            }
            composable(Screens.More.route) {
                val viewModel: MoreViewModel = viewModel()
                MoreScreen(navController, viewModel)
            }
        }
    }
}