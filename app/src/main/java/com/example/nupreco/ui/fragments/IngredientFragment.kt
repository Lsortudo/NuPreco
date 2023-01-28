package com.example.nupreco.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nupreco.databinding.FragmentIngredientBinding
import com.example.nupreco.ui.adapter.IngredientListAdapter
import com.example.nupreco.viewmodel.IngredientViewModel

class IngredientFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: IngredientListAdapter
    //private lateinit var newArrayList: ArrayList<Ingredient>


    private var _binding: FragmentIngredientBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        /*val ingredientViewModel =
            ViewModelProvider(this).get(IngredientViewModel::class.java)*/

        _binding = FragmentIngredientBinding.inflate(inflater, container, false)
        val root: View = binding.root

        this.recyclerView = this.binding.recyclerviewIngredient
        this.adapter = IngredientListAdapter()
        this.recyclerView.adapter = this.adapter
        this.recyclerView.layoutManager = LinearLayoutManager(context)

        /*val textView: TextView = binding.textDashboard
        ingredientViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }*/

        /*recyclerView = binding.recyclerviewIngredient
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.setHasFixedSize(true)
        adapter = IngredientListAdapter()
        recyclerView.adapter = adapter
*/
        return root
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}