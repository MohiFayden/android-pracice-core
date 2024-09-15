package com.fadenai.androidsample1.ui.home

import com.fadenai.androidsample1.data.entity.CourseEntity

sealed interface HomeViewState {

    data object Loading : HomeViewState

    data object Error : HomeViewState

    data class Success(val courses: Map<String, List<CourseEntity>>) : HomeViewState
}