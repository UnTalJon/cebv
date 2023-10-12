package com.tec.cevb.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.tec.cevb.screens.BookMarksScreen
import com.tec.cevb.screens.HomeScreen
import com.tec.cevb.screens.MappingScreen
import com.tec.cevb.screens.SettingsScreen

@Composable
fun CebvNavHost(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = TopLevelDestination.HOME.name
    ) {
        composable(TopLevelDestination.HOME.name) {
            HomeScreen()
        }
        composable(TopLevelDestination.BOOKMARKS.name) {
            BookMarksScreen()
        }
        composable(TopLevelDestination.MAPPING.name) {
            MappingScreen()
        }
        composable(TopLevelDestination.SETTINGS.name) {
            SettingsScreen()
        }
    }
}