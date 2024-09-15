package com.fadenai.androidsample1.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.fadenai.androidsample1.data.entity.CourseEntity

@Database(entities = [CourseEntity::class], version = 1)
@TypeConverters(ListTypeConverters::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun courseDao(): CourseDAO
}