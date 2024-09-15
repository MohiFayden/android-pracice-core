package com.fadenai.androidsample1.data.repository

import com.fadenai.androidsample1.data.mock.mockCourseListEntity
import com.fadenai.androidsample1.data.mock.mockCourseListJM
import com.fadenai.androidsample1.data.network.NetworkAPI
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class DataRepositoryTest {

    private lateinit var repository: DataRepository
    private val api: NetworkAPI = mockk()

    @BeforeEach
    fun setup() {
        repository = DataRepositoryImpl(
            api = api,
            dispatcher = Dispatchers.Unconfined
        )
    }

    @Test
    fun `get course list successfully`() = runTest {
        coEvery { api.getCourseList() } returns mockCourseListJM

        val result = repository.getCourseList()

        assertEquals(
            expected = mockCourseListEntity,
            actual = result
        )

        coVerify(exactly = 1) { api.getCourseList() }
    }

    @Test
    fun `get course list when API returns empty list`() = runTest {
        coEvery { api.getCourseList() } returns emptyList()

        val result = repository.getCourseList()

        assertTrue(result.isEmpty())

        coVerify(exactly = 1) { api.getCourseList() }
    }

    @Test
    fun `get course list when API throws exception`() = runTest {
        val runtimeException = RuntimeException(networkErrorMessage)
        coEvery { api.getCourseList() } throws runtimeException

        val thrownException = assertThrows<RuntimeException> {
            repository.getCourseList()
        }

        assertEquals(
            expected = networkErrorMessage,
            actual = thrownException.message
        )

        coVerify(exactly = 1) { api.getCourseList() }
    }

    //-------------------- Data -------------------

    private val networkErrorMessage = "Network error"
}