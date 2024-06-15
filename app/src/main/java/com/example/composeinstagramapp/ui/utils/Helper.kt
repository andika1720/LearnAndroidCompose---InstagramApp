package com.example.composeinstagramapp.ui.utils

import com.example.composeinstagramapp.ui.navigation.Screen

fun String?.showBottomBar(): Boolean{
    return this in setOf(
        Screen.Home.route,
        Screen.Search.route,
        Screen.Reels.route,
        Screen.AddPosting.route,
        Screen.Profile.route
    )
}