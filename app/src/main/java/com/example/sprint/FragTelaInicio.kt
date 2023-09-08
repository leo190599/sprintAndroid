package com.example.sprint

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.sprint.databinding.FragTelaInicioBinding

class FragTelaInicio:Fragment() {

    private var binding:FragTelaInicioBinding?=null
    private  val _binding get()=binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding=FragTelaInicioBinding.inflate(inflater,container,false)
        return _binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding.BtnCadastro.setOnClickListener{
            findNavController().navigate(R.id.action_fragTelaInicio2_to_fragTelaCadastro4)
        }
        _binding.BtnConsulta.setOnClickListener{
            findNavController().navigate(R.id.action_fragTelaInicio2_to_fragTelaConsulta)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding=null
    }
}