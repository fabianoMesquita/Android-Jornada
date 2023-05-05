package com.oceanbrasil.ocean_jornada_maio_2023

import android.content.Intent
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

        //Abrir nova tela
        val btAbrirNovaTela = findViewById<Button>(R.id.btAbrirNovaTela)

        btAbrirNovaTela .setOnClickListener {
            //Cria um intent para abrir nova tela
            val abrirNovaTelaIntent = Intent(this, ResultadoActivity::class.java)

            val nomeDigitado = etNome.text.toString()

            abrirNovaTelaIntent.putExtra("NOME_DIGITADO", nomeDigitado)

            //Registra a intent no Android
            startActivity(abrirNovaTelaIntent)
        }
    }
}