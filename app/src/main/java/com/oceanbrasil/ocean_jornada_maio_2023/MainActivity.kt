package com.oceanbrasil.ocean_jornada_maio_2023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        val btEnviar = findViewById<Button>(R.id.btEnviar)
        val etNome = findViewById<EditText>(R.id.etNome)

        btEnviar .setOnClickListener {
            if (etNome.text.isEmpty()){
                etNome .error = "Digite o nome"
            } else {
                tvResultado.text = etNome.text
            }
        }
    }
}