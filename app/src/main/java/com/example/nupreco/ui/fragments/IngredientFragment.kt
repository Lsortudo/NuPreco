package com.example.nupreco.ui.fragments

import android.R.attr.defaultValue
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nupreco.R
import com.example.nupreco.application.IngredientsApplication
import com.example.nupreco.databinding.FragmentIngredientBinding
import com.example.nupreco.models.Ingredient
import com.example.nupreco.ui.adapter.IngredientListAdapter
import com.example.nupreco.viewmodel.IngredientViewModel
import com.example.nupreco.viewmodel.IngredientViewModelFactory


class IngredientFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: IngredientListAdapter
    //private lateinit var newArrayList: ArrayList<Ingredient>


    private val ingredientViewModel: IngredientViewModel by viewModels {
        IngredientViewModelFactory(( /*application*/ context as IngredientsApplication).repository)
    }


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

        //Here get the data coming for another screen
        val bundle = this.arguments
        if (bundle != null) {
            val myCode = bundle.getInt("", defaultValue)
            ingredientViewModel.insert(Ingredient(myCode.toString()))
        }

        this.binding.fabAddIngredient.setOnClickListener{
            findNavController().navigate(R.id.action_newIngredientFragment_to_navigation_dashboard)
        }

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

    override fun onStart() {
        super.onStart()

        ingredientViewModel.allIngredients.observe(this, Observer{ ingredients ->
            ingredients?.let {
                adapter.submitList(it)
            }
        })


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}