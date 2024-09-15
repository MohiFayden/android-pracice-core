package com.fadenai.androidsample1.data.repository

import com.fadenai.androidsample1.data.entity.CourseEntity

interface DataRepository {

    suspend fun getCourseList(): List<CourseEntity>
}