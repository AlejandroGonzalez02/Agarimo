package com.example.agarimo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.google.android.gms.maps.GoogleMap
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.ktx.Firebase

class Rexistro : AppCompatActivity() {

    private val TAG="RealTime"
    private lateinit var database: DatabaseReference
    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        //IDEAZA
        Thread.sleep(2000)
        setTheme(R.style.Theme_Agarimo)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rexistro)

        val mAuth: FirebaseAuth = FirebaseAuth.getInstance()
        val mDatabase: DatabaseReference = FirebaseDatabase.getInstance().getReference()

        //Botones
        val botonRexistro: Button = findViewById(R.id.botonRexitro)
        val botonInicio: Button= findViewById(R.id.botonInicio)
        val emailEditText: TextView= findViewById(R.id.emailEditText)
        val passwordEditText: TextView= findViewById(R.id.passwordEditText)
        //Analytics Event

        //Rexistro
        botonRexistro.setOnClickListener{
            if (emailEditText.text.isNotEmpty() && passwordEditText.text.isNotEmpty()){
            mAuth.createUserWithEmailAndPassword(
                emailEditText.text.toString(),
                passwordEditText.text.toString()).addOnCompleteListener{
                    if(it.isSuccessful){
                        showMaps()
                    }else{
                        showAlert()
                    }
            }
            }
        }
        //Inicio
        botonInicio.setOnClickListener{
            if (emailEditText.text.isNotEmpty() && passwordEditText.text.isNotEmpty()){
                mAuth.signInWithEmailAndPassword(
                    emailEditText.text.toString(),
                    passwordEditText.text.toString()).addOnCompleteListener{
                    if(it.isSuccessful){
                        showMaps()
                    }else{
                        showAlert()
                    }
                }
            }
        }
    }

    private fun showAlert(){

        val builder=AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("Se ha producido un error de autentificacion de usuario")
        builder.setPositiveButton("Aceptar",null)
        val dialog:AlertDialog=builder.create()
        dialog.show()
    }

    private fun showMaps(){
        val mapIntent= Intent(this,MapsActivity::class.java)
        startActivity(mapIntent)
    }
}