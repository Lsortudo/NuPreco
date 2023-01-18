package com.example.nupreco.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.nupreco.R
import com.example.nupreco.models.Ingredient

class IngredientListAdapter :
    ListAdapter<Ingredient, IngredientListAdapter.IngredientViewHolder>(IngredientsComparator()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IngredientViewHolder {
        return IngredientViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: IngredientViewHolder, position: Int) {
        val current = getItem(position)
        holder.bind(current.name)
    }

    class IngredientViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val ingredientItemView: TextView = itemView.findViewById(R.id.etNameIngredient)

        fun bind(text: String?) {
            ingredientItemView.text = text
        }

        companion object {
            fun create(parent: ViewGroup): IngredientViewHolder {
                val view: View = LayoutInflater.from(parent.context)
                    .inflate(R.layout.ingredient_item, parent, false)
                return IngredientViewHolder(view)

            }
        }
    }

    class IngredientsComparator : DiffUtil.ItemCallback<Ingredient>() {

        override fun areItemsTheSame(oldItem: Ingredient, newItem: Ingredient): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: Ingredient, newItem: Ingredient): Boolean {
            return oldItem.id == newItem.id
        }

    }

}



