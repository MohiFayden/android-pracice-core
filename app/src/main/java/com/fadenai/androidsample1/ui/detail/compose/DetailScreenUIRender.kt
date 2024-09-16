package com.fadenai.androidsample1.ui.detail.compose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.fadenai.androidsample1.ui.composecommon.ErrorScreen
import com.fadenai.androidsample1.ui.composecommon.LoadingProgressFullScreen
import com.fadenai.androidsample1.ui.detail.DetailViewState

@Composable
fun DetailScreenUIRender(
    viewState: State<DetailViewState>
) {

    when (val state = viewState.value) {
        DetailViewState.Error -> ErrorScreen { }
        DetailViewState.Loading -> LoadingProgressFullScreen()
        is DetailViewState.Success -> {
            Box(
                modifier = Modifier
                    .fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = state.course.title
                )
            }
        }
    }
}