package com.example.composeinstagramapp.ui.navigation

import androidx.compose.ui.graphics.vector.ImageVector

data class NavigationItem (
    val title: String,
    val unselectedIcon: ImageVector,
    val selectedIcon: ImageVector,
    val screen: Screen
)