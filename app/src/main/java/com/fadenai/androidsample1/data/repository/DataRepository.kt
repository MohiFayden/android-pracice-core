package com.fadenai.androidsample1.data.repository

import com.fadenai.androidsample1.data.entity.CourseEntity

interface DataRepository {

    suspend fun getCourseList(): Map<String, List<CourseEntity>>

    suspend fun getCourse(id: Int): CourseEntity
}