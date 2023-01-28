package com.example.nupreco.repositories

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.nupreco.models.Ingredient
import com.example.nupreco.models.Recipe
import com.example.nupreco.utils.DATABASE_NAME
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Database(entities = [Ingredient::class, Recipe::class], version = 1)
abstract class NuPrecoDatabase : RoomDatabase() {

    abstract fun nuPrecoDao(): NuPrecoDao

    companion object {

        @Volatile
        private var INSTANCE: NuPrecoDatabase? = null

        fun getDatabase(scope: CoroutineScope, context: Context): NuPrecoDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    /* context = */ context.applicationContext,
                    /* klass = */ NuPrecoDatabase::class.java,
                    /* name = */ DATABASE_NAME
                ).addCallback(NuPrecoDatabaseCallback(scope)).build()
                INSTANCE = instance
                instance
            }
        }
    }

    private class NuPrecoDatabaseCallback(private val scope: CoroutineScope) : RoomDatabase.Callback() {

        override fun onCreate(db: SupportSQLiteDatabase) {
            super.onCreate(db)
            INSTANCE?.let { database ->
                scope.launch {
                    populateDatabase(database.nuPrecoDao())
                }
            }
        }

        suspend fun populateDatabase(nuPrecoDao: NuPrecoDao) {

            var ingredient = Ingredient("Hello")
            nuPrecoDao.insertIngredient(ingredient)
            ingredient = Ingredient("World!")
            nuPrecoDao.insertIngredient(ingredient)

        }
    }

    // OLD
    /*companion object {

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


    }*/


}