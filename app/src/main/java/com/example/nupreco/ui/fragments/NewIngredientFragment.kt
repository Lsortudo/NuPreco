package com.example.nupreco.ui.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.nupreco.R
import com.example.nupreco.databinding.FragmentNewIngredientBinding
import com.example.nupreco.viewmodel.NewIngredientViewModel

class NewIngredientFragment : Fragment() {
    private var _binding: FragmentNewIngredientBinding? = null
    private val binding get() = _binding!!

    /*companion object {
        fun newInstance() = NewIngredientFragment()
    }*/


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val newIngredientViewModel =
            ViewModelProvider(this).get(NewIngredientViewModel::class.java)

        _binding = FragmentNewIngredientBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val editTextName: TextView = binding.etNameIngredient
        newIngredientViewModel.nameIngredient.observe(viewLifecycleOwner) {
            editTextName.text = it
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}