package com.fadenai.androidsample1.ui.detail.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
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
        is DetailViewState.Success -> DetailScreenContent(state.course)
    }
}