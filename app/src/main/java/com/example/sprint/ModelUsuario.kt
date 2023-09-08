package com.example.sprint

import androidx.lifecycle.ViewModel

class ModelUsuario: ViewModel(){
    private var nome:String?="nome a alterar"
    private var telefone:String?="00000000"
    private var email:String?="email a preencher"


    public  fun setNome(nome:String)
    {
        this.nome=nome
    }
    public  fun setTelefone(telefone:String)
    {
        this.telefone=telefone
    }
    public  fun setEmail(email:String)
    {
        this.email=email
    }
    public fun getNome():String?
    {
        return nome
    }
    public  fun getTelefone():String?
    {
        return telefone
    }
    public  fun getEmail():String?
    {
        return email
    }
}