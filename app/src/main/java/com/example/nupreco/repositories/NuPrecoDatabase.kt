package com.example.nupreco.repositories

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.nupreco.models.Ingredient
import com.example.nupreco.models.Recipe
import com.example.nupreco.utils.DATABASE_NAME

@Database(entities = [Ingredient::class, Recipe::class], version = 1)
abstract class NuPrecoDatabase : RoomDatabase() {

    abstract fun nuPrecoDao(): NuPrecoDao

    companion object {

        @Volatile
        private var INSTANCE: NuPrecoDatabase? = null

        fun getInstance(context: Context): NuPrecoDatabase =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: buildDatabase(context).also { INSTANCE = it }
            }

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                NuPrecoDatabase::class.java, DATABASE_NAME
            ).build()


    }


}