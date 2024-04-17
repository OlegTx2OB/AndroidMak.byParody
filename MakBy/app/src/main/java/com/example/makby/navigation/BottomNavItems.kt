package com.example.makby.navigation

import com.example.makby.R
import com.example.makby.view.screens.Screens

data class BottomNavigationItem(
    val labelId : Int,
    val iconId : Int,
    val route : String,
)
fun bottomNavigationItems() : List<BottomNavigationItem> {
    return listOf(
        BottomNavigationItem(
            labelId = R.string.home,
            iconId = R.drawable.ic_home,
            route = Screens.Home.route
        ),
        BottomNavigationItem(
            labelId = R.string.coupons,
            iconId = R.drawable.ic_coupon,
            route = Screens.Coupon.route
        ),
        BottomNavigationItem(
            labelId = R.string.menu,
            iconId = R.drawable.ic_burger,
            route = Screens.Menu.route
        ),
        BottomNavigationItem(
            labelId = R.string.restaurants,
            iconId = R.drawable.ic_map,
            route = Screens.Map.route
        ),
        BottomNavigationItem(
            labelId = R.string.more,
            iconId = R.drawable.ic_more,
            route = Screens.More.route
        ),
    )
}