package com.example.sprint

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.sprint.databinding.FragTelaConsultaBinding

class FragTelaConsulta:Fragment() {

    private var binding:FragTelaConsultaBinding?=null
    private val _binding get()=binding!!
    private val viewModel:ModelUsuario by activityViewModels()

    public override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragTelaConsultaBinding.inflate(inflater,container,false)
        return _binding.root
    }

    public override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding.TextoNome.text=viewModel.getNome()
        _binding.TextoEmail.text=viewModel.getEmail()
        _binding.TextoTelefone.text=viewModel.getTelefone()
    }
}