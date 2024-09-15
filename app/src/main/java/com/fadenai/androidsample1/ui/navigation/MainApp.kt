package com.fadenai.androidsample1.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.fadenai.androidsample1.ui.detail.compose.DetailScreen
import com.fadenai.androidsample1.ui.home.compose.HomeScreen

@Composable
fun MainApp() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = ScreensName.HOME
    ) {
        composable(ScreensName.HOME) { HomeScreen(navController = navController) }
        composable(ScreensName.DETAIL_SCREEN) { DetailScreen(navController = navController) }
    }
}