package com.fadenai.androidsample1.ui.home.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.fadenai.androidsample1.ui.home.HomeViewModel

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = viewModel()
) {

    LaunchedEffect(Unit) {
        viewModel.loadCourseList()
    }

    HomeScreenUIRender(
        viewState = viewModel.viewState.collectAsStateWithLifecycle()
    ) {
        viewModel.loadCourseList()
    }
}