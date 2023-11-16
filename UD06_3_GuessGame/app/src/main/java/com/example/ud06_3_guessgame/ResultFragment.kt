package com.example.ud06_3_guessgame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import com.example.ud06_3_guessgame.databinding.FragmentGameBinding
import com.example.ud06_3_guessgame.databinding.FragmentResultBinding

class ResultFragment : Fragment() {

    private var _binding: FragmentResultBinding?=null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentResultBinding.inflate(inflater,container,false)
        val view = binding.root
        val gameModel:GameViewModel by viewModels()
        binding.btnNewGame.setOnClickListener {
            Toast.makeText(activity,gameModel.secretWord,Toast.LENGTH_LONG)
        }
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}