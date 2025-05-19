package com.fadenai.androidsample1.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fadenai.androidsample1.data.repository.DataRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val repo: DataRepository) : ViewModel() {

    private val _viewState: MutableStateFlow<HomeViewState> =
        MutableStateFlow(HomeViewState.Loading)
    val viewState: StateFlow<HomeViewState> = _viewState

    fun loadCourseList() {
        viewModelScope.launch {
            if (_viewState.value !is HomeViewState.Success) {
                _viewState.value = HomeViewState.Loading
                try {
                    val result = repo.getCourseList()
                    _viewState.value = HomeViewState.Success(result)
                } catch (e: Exception) {
                    e.printStackTrace()
                    _viewState.value = HomeViewState.Error
                }
            }
        }
    }
}