package com.example.nupreco.models.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.nupreco.models.Ingredient
import com.example.nupreco.models.Recipe

data class RecipeAndIngredient(
    @Embedded val recipe: Recipe,
    /*@Relation(
        parentColumn =
    )*/
    val ingredient: Ingredient,

)
