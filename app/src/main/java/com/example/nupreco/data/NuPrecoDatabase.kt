package com.example.nupreco.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.nupreco.models.Ingredient
import com.example.nupreco.utils.DATABASE_NAME

@Database(entities = [Ingredient::class], version = 1)
abstract class NuPrecoDatabase : RoomDatabase() {

    abstract fun nuPrecoDao(): NuPrecoDao

    companion object {

        @Volatile
        private var INSTANCE: NuPrecoDatabase? = null

        fun getDatabase(context: Context): NuPrecoDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    /* context = */ context.applicationContext,
                    /* klass = */ NuPrecoDatabase::class.java,
                    /* name = */ DATABASE_NAME
                ).fallbackToDestructiveMigration().build()
                INSTANCE = instance
                instance
            }
        }
    }
}