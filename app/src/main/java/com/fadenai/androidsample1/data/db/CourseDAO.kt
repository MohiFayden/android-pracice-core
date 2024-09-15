package com.fadenai.androidsample1.data.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.fadenai.androidsample1.data.entity.CourseEntity

@Dao
interface CourseDAO {

    @Query("SELECT * FROM course_item")
    suspend fun getAll(): List<CourseEntity>

    @Insert
    suspend fun insertAll(courses: List<CourseEntity>)

    @Insert
    suspend fun insert(course: CourseEntity)

    @Delete
    suspend fun delete(course: CourseEntity)

    @Update
    suspend fun update(course: CourseEntity)

    @Query("DELETE FROM course_item")
    suspend fun deleteAll()
}