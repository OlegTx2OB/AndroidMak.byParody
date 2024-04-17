package com.example.makby.view.screens

sealed class Screens(val route: String) {
    object Home : Screens("home_route")
    object Coupon : Screens("coupon_route")
    object Menu : Screens("menu_route")
    object Map : Screens("map_route")
    object More : Screens("more_route")
}