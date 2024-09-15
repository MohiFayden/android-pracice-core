package com.fadenai.androidsample1.ui.home.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import com.fadenai.androidsample1.data.mock.mockCourseListEntity
import com.fadenai.androidsample1.ui.composecommon.ErrorScreen
import com.fadenai.androidsample1.ui.composecommon.LoadingProgressFullScreen
import com.fadenai.androidsample1.ui.home.HomeViewState
import com.fadenai.androidsample1.ui.theme.AppTheme

@Composable
fun HomeScreenUIRender(
    viewState: State<HomeViewState>,
    onItemClicked: (id: Int) -> Unit,
    retryLoadList: () -> Unit
) {
    when (val state = viewState.value) {
        HomeViewState.Error -> ErrorScreen(retry = retryLoadList)
        HomeViewState.Loading -> LoadingProgressFullScreen()
        is HomeViewState.Success -> HomeScreenContent(state.courses, onItemClicked)
    }
}

//---------- Preview -------------

@Preview(showBackground = true)
@Composable
private fun PreviewHomeScreenUIRenderLoading() {
    AppTheme {
        val viewState = remember { mutableStateOf(HomeViewState.Loading) }
        HomeScreenUIRender(viewState = viewState, {}) { }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewHomeScreenUIRenderError() {
    AppTheme {
        val viewState = remember { mutableStateOf(HomeViewState.Error) }
        HomeScreenUIRender(viewState = viewState, {}) { }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewHomeScreenUIRenderSuccess() {
    AppTheme {
        val viewState = remember {
            mutableStateOf(HomeViewState.Success(courses = mockCourseListEntity.groupBy { it.category }))
        }

        HomeScreenUIRender(viewState = viewState, {}) { }
    }
}