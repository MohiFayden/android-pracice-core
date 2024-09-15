package com.fadenai.androidsample1.data.db

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken


class ListTypeConverters {

    @TypeConverter
    fun fromStringList(items: List<String>): String = Gson().toJson(items)

    @TypeConverter
    fun toStringList(str: String): List<String> {
        val listType = object : TypeToken<List<String>>() {}.type
        return Gson().fromJson(str, listType)
    }
}