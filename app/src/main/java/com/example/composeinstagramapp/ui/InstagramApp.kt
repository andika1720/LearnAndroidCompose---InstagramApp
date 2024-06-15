package com.example.composeinstagramapp.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composeinstagramapp.ui.navigation.Screen
import com.example.composeinstagramapp.ui.screen.AddPostingScreen
import com.example.composeinstagramapp.ui.screen.HomeScreen
import com.example.composeinstagramapp.ui.screen.ProfileScreen
import com.example.composeinstagramapp.ui.screen.ReelsScreen
import com.example.composeinstagramapp.ui.screen.SearchScreen
import com.example.composeinstagramapp.ui.utils.BottomBar

@Composable
fun InstagramApp(
    modifier: Modifier = Modifier,
    navHostController: NavHostController = rememberNavController()
) {
    Scaffold(
        bottomBar = {
            BottomBar(navHostController= navHostController)
        }
    ) { paddingValues ->
        NavHost(
            navController = navHostController,
            startDestination = Screen.Home.route,
            modifier = modifier.padding(paddingValues)
        ){
            composable(Screen.Home.route){
                HomeScreen()
            }
            composable(Screen.Search.route){
                SearchScreen()
            }
            composable(Screen.AddPosting.route){
                AddPostingScreen()
            }
            composable(Screen.Reels.route){
                ReelsScreen()
            }
            composable(Screen.Profile.route){
                ProfileScreen()
            }

        }
    }


}