package com.fadenai.androidsample1.data.network

import retrofit2.http.GET

interface NetworkAPI {

    @GET("course_list")
    suspend fun getCourseList(): List<CourseJM>
}