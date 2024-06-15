package com.example.composeinstagramapp.ui.utils

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalAbsoluteTonalElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.composeinstagramapp.data.DummyData

@Composable
fun BottomBar(
    modifier: Modifier = Modifier,
    navHostController: NavHostController
) {
    val navBackStack by navHostController.currentBackStackEntryAsState()
    val currentRoute = navBackStack?.destination?.route
    val navigationItems = DummyData.bottomBarIcon

    AnimatedVisibility(visible = currentRoute.showBottomBar()) {
        NavigationBar(modifier = modifier) {
            navigationItems.map {item->
                NavigationBarItem(
                    selected = currentRoute == item.screen.route,
                    onClick = {
                        navHostController.navigate(item.screen.route){
                            popUpTo(navHostController.graph.findStartDestination().id) {
                                saveState = true
                            }
                            restoreState = true
                            launchSingleTop = true

                        }
                    },
                    icon = {
                        Icon(imageVector = if(currentRoute == item.screen.route) item.selectedIcon else item.unselectedIcon, contentDescription = "${item.title} icon")
                    },
                    colors = NavigationBarItemDefaults.colors(
                        indicatorColor = MaterialTheme.colorScheme.surfaceColorAtElevation(
                            LocalAbsoluteTonalElevation.current
                        ),
                    )
                )
            }
        }
    }
}