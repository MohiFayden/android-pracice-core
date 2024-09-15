package com.fadenai.androidsample1.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "course_item")
data class CourseEntity(
    @PrimaryKey val id: Int,
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
