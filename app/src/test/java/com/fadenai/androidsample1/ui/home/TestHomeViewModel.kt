package com.fadenai.androidsample1.ui.home

import app.cash.turbine.test
import com.fadenai.androidsample1.TestExecutorAndDispatcherExtension
import com.fadenai.androidsample1.data.mock.mockTwoCourseListEntity
import com.fadenai.androidsample1.data.repository.DataRepository
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import kotlin.test.assertEquals


@OptIn(ExperimentalCoroutinesApi::class)
@ExtendWith(TestExecutorAndDispatcherExtension::class)
class TestHomeViewModel {

    private lateinit var viewModel: HomeViewModel
    private val repository: DataRepository = mockk()

    @Test
    fun `emit success event after loading list`() = runTest {
        val courses = mockTwoCourseListEntity.groupBy { it.category }
        coEvery { repository.getCourseList() } returns courses
        viewModel = HomeViewModel(repository)

        viewModel.viewState.test {

            assertEquals(
                expected = HomeViewState.Success(courses),
                actual = awaitItem()
            )
        }

        coVerify(exactly = 1) { repository.getCourseList() }
    }
}