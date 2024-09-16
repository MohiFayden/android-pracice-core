package com.fadenai.androidsample1.data.repository

import com.fadenai.androidsample1.data.db.CourseDAO
import com.fadenai.androidsample1.data.di.IoDispatcher
import com.fadenai.androidsample1.data.entity.CourseEntity
import com.fadenai.androidsample1.data.entity.toCourseEntity
import com.fadenai.androidsample1.data.network.NetworkAPI
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject

class DataRepositoryImpl @Inject constructor(
    private val api: NetworkAPI,
    private val courseDAO: CourseDAO,
    @IoDispatcher private val dispatcher: CoroutineDispatcher
) : DataRepository {

    override suspend fun getCourseList(): Map<String, List<CourseEntity>> =
        withContext(dispatcher) {
            val courses = api.getCourseList().toCourseEntity()
            courseDAO.deleteAll()
            courseDAO.insertAll(courses)
            courses.groupBy { it.category }
        }

    override suspend fun getCourse(id: Int): CourseEntity = withContext(dispatcher) {
        courseDAO.getCourse(id)
    }
}