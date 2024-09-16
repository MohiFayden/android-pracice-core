package com.fadenai.androidsample1.ui.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fadenai.androidsample1.data.repository.DataRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(
    private val repository: DataRepository
) : ViewModel() {

    private val _viewState: MutableStateFlow<DetailViewState> =
        MutableStateFlow(DetailViewState.Loading)
    val viewState: StateFlow<DetailViewState> = _viewState

    fun getCourse(id: Int) {
        viewModelScope.launch {
            try {
                val course = repository.getCourse(id)
                _viewState.value = DetailViewState.Success(course)

            } catch (e: Exception) {
                e.printStackTrace()
                _viewState.value = DetailViewState.Error
            }
        }
    }
}