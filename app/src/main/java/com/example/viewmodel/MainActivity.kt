package com.example.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var txtContador: EditText
    lateinit var btnDados: Button
    lateinit var btnMostrar: Button

    lateinit var mViewModel:MainViewModel

    var contador:Int = 0

    /* onCreate cria toda a estrutura de um projeto.
    * vai iniciar o layout e todas as dependências que ele precisa */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //logar(valor = "onCreate")

        initDados()
        //initContador()
        initClick()
        //validaContador()
    }

    /*Importação dos itens que vão estar na tela */

    private fun initDados(){
        mViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        txtContador = findViewById(R.id.txtContador)
        btnDados = findViewById(R.id.btnDados)
        btnMostrar = findViewById(R.id.btnMostrar)
        mViewModel.mContador.observe(this, Observer { valor -> txtContador.setText(valor)})
    }

    override fun onStart() {
        //logar(valor = "onStart")

        super.onStart()
    }

    /* onResume toda a activity está criada e o layout está funcionando*/
    override fun onResume() {
        //logar(valor = "onResume")

        super.onResume()
    }

    override fun onPause() {
        //logar(valor = "onPause")

        super.onPause()
    }

    override fun onStop() {
        //logar(valor = "onStop")

        super.onStop()
    }

    /* O onDestroy significa que realmente a Activity está sendo finalizada.*/
    override fun onDestroy() {
        super.onDestroy()
    }

    /*Função para fazer o log da LifeCicle

    private fun logar(tag:String = "Ciclo de Vida", valor:String){
        Log.d(tag,valor)
    }*/

    /*Função que inicia o contador na tela*/

    /*private fun initContador(){
        txtContador.setText(contador.toString())
    }*/

    private fun initClick(){
        btnDados.setOnClickListener{
            //contador++
            //validaContador()
            //initContador()
            mViewModel.Contador()
        }
        btnMostrar.setOnClickListener{
            Toast.makeText(applicationContext, "Valor do contador é  :${mViewModel.mContador.value}",Toast.LENGTH_SHORT).show()
        }
    }


    /*Exemplo de função para finalizar uma Activity (destroy)
    private fun finalizarApp(){
        finish()
    }*/
}