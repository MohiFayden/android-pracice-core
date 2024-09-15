package com.fadenai.androidsample1.data.repository

import com.fadenai.androidsample1.data.di.IoDispatcher
import com.fadenai.androidsample1.data.entity.CourseEntity
import com.fadenai.androidsample1.data.entity.toCourseEntity
import com.fadenai.androidsample1.data.network.NetworkAPI
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject

class DataRepositoryImpl @Inject constructor(
    private val api: NetworkAPI,
    @IoDispatcher private val dispatcher: CoroutineDispatcher
) : DataRepository {

    override suspend fun getCourseList(): List<CourseEntity> = withContext(dispatcher) {
        api.getCourseList().toCourseEntity()
    }
}