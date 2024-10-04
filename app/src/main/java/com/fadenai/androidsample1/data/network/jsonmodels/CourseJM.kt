package com.fadenai.androidsample1.data.network.jsonmodels

data class CourseJM(
    val id: Int,
    val title: String,
    val img: String,
    val category: String,
    val instructor: String,
    val rating: Double,
    val numRatings: Int,
    val enrollment: Int,
    val duration: Int,
    val tags: List<String>
)