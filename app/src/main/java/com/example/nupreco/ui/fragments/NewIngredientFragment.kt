package com.example.nupreco.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.nupreco.databinding.FragmentNewIngredientBinding

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
        /*val newIngredientViewModel =
            ViewModelProvider(this).get(NewIngredientViewModel::class.java)*/

        _binding = FragmentNewIngredientBinding.inflate(inflater, container, false)
        val root: View = binding.root

        //val editTextName: TextView = binding.etNameIngredient
        /*newIngredientViewModel.nameIngredient.observe(viewLifecycleOwner) {
            editTextName.text = it
        }*/

        return root
    }

    override fun onStart() {
        super.onStart()

        this.binding.btSaveIngredient.setOnClickListener {

            val fragment = Fragment()
            val bundle = Bundle()
            bundle.putString("code", "sds")
            fragment.setArguments(bundle)

            //bundle.putInt(key, value)
            //fragment.arguments = bundle

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}