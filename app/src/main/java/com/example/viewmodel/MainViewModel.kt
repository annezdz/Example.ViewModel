package com.example.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    /* Toda vez que implementar um valor na variável mContador na ViewModel, a Activity vai saber
    * que isso aconteceu e vamos tomar uma ação com relação a isso*/
    var mContador = MutableLiveData<String>().apply {value = contador.toString()}

    private var contador:Int = 0


    /*Função incremental */
    private fun setMContador(){
        mContador.value = contador.toString()
    }

    private fun validaContador(){
        contador++
        if(contador > 5) contador = 0
    }

    fun Contador(){
        validaContador()
    }


}
