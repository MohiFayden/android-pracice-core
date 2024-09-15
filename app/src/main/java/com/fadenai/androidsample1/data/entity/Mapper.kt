package com.fadenai.androidsample1.data.entity

import com.fadenai.androidsample1.data.network.CourseJM

fun List<CourseJM>.toCourseEntity(): List<CourseEntity> = map { it.toEntity() }

fun CourseJM.toEntity(): CourseEntity = CourseEntity(
    id = id,
    title = title,
    img = img,
    category = category,
    instructor = instructor,
    rating = rating,
    numRatings = numRatings,
    enrollment = enrollment,
    duration = duration,
    tags = tags
)