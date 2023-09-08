package com.example.sprint

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.sprint.databinding.FragTelaCadastroBinding

class FragTelaCadastro:Fragment() {

    private var binding:FragTelaCadastroBinding?=null
    private  val _binding get()=binding!!
    private  val viewModel:ModelUsuario by activityViewModels()

    public override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragTelaCadastroBinding.inflate(inflater,container,false)
        return _binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding.BtnCadastrar.setOnClickListener{
            AtualizarNome()
            AtualizarTelefone()
            AtualizarEmail()
        }
    }

    fun AtualizarNome()
    {
        viewModel.setNome(_binding.editTextTextPersonName2.text.toString())
    }
    fun AtualizarEmail()
    {
        viewModel.setEmail(_binding.editTextTextEmailAddress.text.toString())
    }
    fun AtualizarTelefone()
    {
        viewModel.setTelefone(_binding.editTextPhone.text.toString())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding=null
    }
}