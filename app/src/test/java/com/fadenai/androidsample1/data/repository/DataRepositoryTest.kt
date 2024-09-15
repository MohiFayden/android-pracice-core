package com.fadenai.androidsample1.data.repository

import com.fadenai.androidsample1.data.entity.CourseEntity
import com.fadenai.androidsample1.data.network.CourseJM
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
        coEvery { api.getCourseList() } returns courseJsonList

        val result = repository.getCourseList()

        assertEquals(
            expected = courseEntityList,
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

    private val courseJsonList: List<CourseJM> = listOf(
        CourseJM(
            id = 1,
            title = "Introduction to Machine Learning",
            img = "https://picsum.photos/200/300",
            category = "Data Science",
            instructor = "Andrew Ng",
            rating = 4.8,
            numRatings = 12500,
            enrollment = 150000,
            duration = 12,
            tags = listOf("Machine Learning", "AI", "Data Science")
        ),
        CourseJM(
            id = 2,
            title = "Data Structures and Algorithms",
            img = "https://picsum.photos/200/300",
            category = "Computer Science",
            instructor = "Robert Sedgewick",
            rating = 4.7,
            numRatings = 9800,
            enrollment = 90000,
            duration = 10,
            tags = listOf("Algorithms", "Data Structures", "Programming")
        )
    )

    private val courseEntityList: List<CourseEntity> = listOf(
        CourseEntity(
            id = 1,
            title = "Introduction to Machine Learning",
            img = "https://picsum.photos/200/300",
            category = "Data Science",
            instructor = "Andrew Ng",
            rating = 4.8,
            numRatings = 12500,
            enrollment = 150000,
            duration = 12,
            tags = listOf("Machine Learning", "AI", "Data Science")
        ),
        CourseEntity(
            id = 2,
            title = "Data Structures and Algorithms",
            img = "https://picsum.photos/200/300",
            category = "Computer Science",
            instructor = "Robert Sedgewick",
            rating = 4.7,
            numRatings = 9800,
            enrollment = 90000,
            duration = 10,
            tags = listOf("Algorithms", "Data Structures", "Programming")
        )
    )

}