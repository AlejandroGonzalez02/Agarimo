package com.example.agarimo

import android.app.Activity
import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.ktx.Firebase
import android.widget.Toast
import com.google.firebase.auth.FirebaseUser
//import com.google.firebase.auth.ktx.auth

class Crontrasinal: Activity() {
    /*
    //Declaración do auth
    private lateinit var auth: FirebaseAuth

    public override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        auth = Firebase.auth

    }

    //iniciar comprobar o usuario
    public override fun onStart(){
        super.onStart()
        val currentUser=auth.currentUser
        if(currentUser !=null){
            reload();
            }
    }

    //
    private fun crearConta(correo:String, contrasinal: String){
        auth.creaciondeUsuario(correo,contrasinal).
        addOnCompleteListener(this){ task ->
            if(task.isSuccessful){
                //Inicio de sesión correcto, actualice la interfaz de usuario con la información del usuario que inició sesión
                Log.d(TAG, "")
                val usuario=auth.currentUser
                updateUI(usuario)
            }
            else{
                //Se houbo problemas enviar mensaxe ao usuario
                Log.w(TAG, "Entrada do correo fallido",task.exception)
                Toast.makeText(baseContext,"Follou a entrada", Toast.LENGTH_SHORT).show()
                updateUI(null)
            }

        }

    }

    private fun updateUI(user:FirebaseUser?){}
    private fun reload(){}
    companion object{
        private const val TAG="EmailPassword"
    }*/


}