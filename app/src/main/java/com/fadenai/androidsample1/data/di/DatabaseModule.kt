package com.fadenai.androidsample1.data.di

import android.content.Context
import androidx.room.Room
import com.fadenai.androidsample1.data.db.AppDatabase
import com.fadenai.androidsample1.data.db.CourseDAO
import com.fadenai.androidsample1.data.db.ListTypeConverters
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import net.sqlcipher.database.SQLiteDatabase
import net.sqlcipher.database.SupportFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideDataBase(@ApplicationContext context: Context): AppDatabase {

        // Android Keystore can be used to generate and encrypt the secureKey
        val secureKey = "this_is_the_secure_key"
        val passphrase: ByteArray = SQLiteDatabase.getBytes(secureKey.toCharArray())
        val factory = SupportFactory(passphrase)

        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "app_database"
        )
            .openHelperFactory(factory)
            .addTypeConverter(ListTypeConverters::class.java)
            .build()
    }

    @Provides
    fun courseDao(db: AppDatabase): CourseDAO = db.courseDao()

}