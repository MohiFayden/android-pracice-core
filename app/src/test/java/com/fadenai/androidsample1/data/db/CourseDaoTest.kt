package com.fadenai.androidsample1.data.db

import androidx.room.Room
import androidx.test.platform.app.InstrumentationRegistry
import com.fadenai.androidsample1.data.entity.CourseEntity
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

//ToDo: Fix issue with this class
class CourseDaoTest {

    private lateinit var database: AppDatabase
    private lateinit var dao: CourseDAO

    @BeforeEach
    fun setup() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext

        database = Room.inMemoryDatabaseBuilder(
//            ApplicationProvider.getApplicationContext(),
            appContext,
            AppDatabase::class.java
        )
            .build()
        dao = database.courseDao()
    }

    @AfterEach
    fun teardown() {
        database.close()
    }

    @Test
    fun insertAndRetrieveCourses() = runTest {
        val course = CourseEntity(
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

        var courses = dao.getAll()
        assertEquals(
            expected = 0,
            actual = courses.size
        )

        dao.insert(course)
        courses = dao.getAll()

        assertEquals(
            expected = 1,
            actual = courses.size
        )

        assertEquals(
            expected = course,
            actual = courses[0]
        )
    }

}