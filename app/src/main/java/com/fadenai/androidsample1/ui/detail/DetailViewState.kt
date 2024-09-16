package com.fadenai.androidsample1.ui.detail

import com.fadenai.androidsample1.data.entity.CourseEntity

sealed interface DetailViewState {

    data object Loading : DetailViewState

    data object Error : DetailViewState

    data class Success(val course: CourseEntity) : DetailViewState
}