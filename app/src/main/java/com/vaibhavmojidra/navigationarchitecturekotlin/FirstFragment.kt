package com.vaibhavmojidra.navigationarchitecturekotlin

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.vaibhavmojidra.navigationarchitecturekotlin.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_first, container, false)
        binding.submit.setOnClickListener{
            val tt=binding.textBox.text.toString()
            if(!TextUtils.isEmpty(tt)){
                val buddle= bundleOf("Text" to tt)
                it.findNavController().navigate(R.id.action_firstFragment_to_secondFragment,buddle)
            }else{
                Toast.makeText(activity,"Enter some text",Toast.LENGTH_LONG).show()
            }

        }
        return binding.root
    }


}