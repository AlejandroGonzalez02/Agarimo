package com.example.agarimo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.ktx.Firebase

class Rexistro : AppCompatActivity() {
    /*
    private lateinit var auth:FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rexistro)

        //Analytics Event
        val analytics =FirebaseAnalytics.getInstance(this)
        val bundle=Bundle()
        bundle.putString("message","Integracion de Firebase completa")
        analytics.logEvent("InitScreen",bundle)

        //Setup
        setup()
    }

    private fun setup() {
        title = "Autentificación"


        botonRexistro.setOnClickListener{
            if (emailEditText.text.isNotEmpty() && passwordEditText.text,isNotEmpty()){
            FirebaseAuth.getInstance().createUserWithEmailAndPassword(
                emailEditText.text.toString(),
                passwordEditText.text.toString()).addOnCompleteListener{
                    if(it.isSuccessful){

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

    private fun showMaps(email: String, provider: ProviderType){

        val homeIntent= Intent{,MapsActivity::class.java}.apply{
            PutExtra{"email",email}
            PutExtra{"provider",provider.name}
        }
        startActivity(homeIntent)
    }*/
}