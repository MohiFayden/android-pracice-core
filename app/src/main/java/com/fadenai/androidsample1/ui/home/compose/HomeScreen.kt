package com.fadenai.androidsample1.ui.home.compose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavHostController
import com.fadenai.androidsample1.ui.detail.compose.DefaultTopBar
import com.fadenai.androidsample1.ui.home.HomeViewModel
import com.fadenai.androidsample1.ui.navigation.ScreensName

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = hiltViewModel(),
    navController: NavHostController
) {

    // Calling load here will result in loading the list again after navigating back from detail
//    LaunchedEffect(Unit) {
//        viewModel.loadCourseList()
//    }

    Scaffold(
        topBar = {
            DefaultTopBar("Explore")
        }
    ) { contentPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(contentPadding)
        ) {
            HomeScreenUIRender(
                viewState = viewModel.viewState.collectAsStateWithLifecycle(),
                onItemClicked = {
                    navController.navigate(ScreensName.DETAIL_SCREEN)
                }
            ) {
                viewModel.loadCourseList()
            }
        }
    }


}