package com.fadenai.androidsample1.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
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
        composable(
            route = "${ScreensName.DETAIL}/{id}",
            arguments = listOf(navArgument("id") { type = NavType.IntType })
        ) { backStackEntry ->
            val id = backStackEntry.arguments?.getInt("id") ?: 0
            DetailScreen(navController = navController, courseId = id)
        }
    }
}