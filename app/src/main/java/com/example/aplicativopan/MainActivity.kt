package com.example.aplicativopan

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class  MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aulaid)

        val notap1 = findViewById<EditText>(R.id.editNota1)
        val notap2 = findViewById<EditText>(R.id.editNota2)
        val resultado = findViewById<TextView>(R.id.txtResultado)
        val botao = findViewById<Button>(R.id.btnCalcular)


        botao.setOnClickListener {
            resultado.text = "Média é " +
                                ((notap1.text.toString().toFloat()
                                + notap2.text.toString().toFloat()
                                )
                                /2 ).toString()


        }
    }
}
