package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bSaludar = findViewById<Button>(R.id.bSaludar)
        val etNombre = findViewById<EditText>(R.id.etName)
        val cbDev = findViewById<CheckBox>(R.id.cbDeveloper)

        bSaludar.setOnClickListener(View.OnClickListener {
            if(validarDato()){
                if(cbDev.isChecked){
                    Toast.makeText(this, "Bienenido, " + etNombre.text + " se que eres un desarrollador", Toast.LENGTH_LONG).show()
                }else{
                    Toast.makeText(this, "Bienenido, " + etNombre.text, Toast.LENGTH_LONG).show()
                }
            }else{
                Toast.makeText(this, "Escribe tu nombre para saludarte", Toast.LENGTH_SHORT).show()
            }
        })
    }

    fun validarDato(): Boolean {

        val etName = findViewById<EditText>(R.id.etName)
        val nombreUsuario = etName.text

        if(nombreUsuario.isNullOrEmpty()){
            return false
        }
        return  true
    }



}