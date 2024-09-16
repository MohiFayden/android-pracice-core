package com.fadenai.androidsample1.ui.detail.compose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavHostController
import com.fadenai.androidsample1.ui.composecommon.DefaultTopBar
import com.fadenai.androidsample1.ui.detail.DetailViewModel

@Composable
fun DetailScreen(
    navController: NavHostController,
    courseId: Int,
    viewModel: DetailViewModel = hiltViewModel()
) {

    LaunchedEffect(Unit) {
        viewModel.getCourse(courseId)
    }

    Scaffold(
        topBar = {
            DefaultTopBar(title = "Detail") {
                navController.popBackStack()
            }
        }
    ) { contentPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(contentPadding),
            contentAlignment = Alignment.Center
        ) {
            DetailScreenUIRender(viewModel.viewState.collectAsStateWithLifecycle())
        }
    }
}
