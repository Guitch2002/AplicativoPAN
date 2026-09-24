package com.example.aplicativopan

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aulaid)


        val editEx1 = findViewById<EditText>(R.id.etEx1)
        val btnEx1 = findViewById<Button>(R.id.btnEx1)
        val txtEx1 = findViewById<TextView>(R.id.tvEx1)

        btnEx1.setOnClickListener {
            val num = editEx1.text.toString().toInt()
            val dobro = num * 2
            txtEx1.text = dobro.toString()
        }


        val editEx2 = findViewById<EditText>(R.id.etEx2)
        val btnEx2 = findViewById<Button>(R.id.btnEx2)
        val txtEx2 = findViewById<TextView>(R.id.tvEx2)

        btnEx2.setOnClickListener {
            val idade = editEx2.text.toString().toInt()
            val dias = idade * 365
            txtEx2.text = "Você já viveu aproximadamente " + dias.toString() + " dias"
        }


        val editEx3 = findViewById<EditText>(R.id.etEx3)
        val btnEx3 = findViewById<Button>(R.id.btnEx3)
        val txtEx3 = findViewById<TextView>(R.id.tvEx3)

        btnEx3.setOnClickListener {
            val conta = editEx3.text.toString().toFloat()
            val gorjeta = conta * 0.10f
            txtEx3.text = "Gorjeta: R$ " + String.format("%.2f", gorjeta)
        }


        val editEx4 = findViewById<EditText>(R.id.etEx4)
        val btnEx4 = findViewById<Button>(R.id.btnEx4)
        val txtEx4 = findViewById<TextView>(R.id.tvEx4)

        btnEx4.setOnClickListener {
            val dolar = editEx4.text.toString().toFloat()
            val real = dolar * 5.50f
            txtEx4.text = "R$ " + String.format("%.2f", real)
        }


        val notap1 = findViewById<EditText>(R.id.editNota1)
        val notap2 = findViewById<EditText>(R.id.editNota2)
        val resultado = findViewById<TextView>(R.id.txtResultado)
        val botao = findViewById<Button>(R.id.btnCalcular)

        botao.setOnClickListener {
            resultado.text = "Média é " +
                    ((notap1.text.toString().toFloat()
                            + notap2.text.toString().toFloat()
                            )
                            / 2).toString()
        }


        val editEx6 = findViewById<EditText>(R.id.etEx6)
        val btnEx6 = findViewById<Button>(R.id.btnEx6)
        val txtEx6 = findViewById<TextView>(R.id.tvEx6)

        btnEx6.setOnClickListener {
            val idade = editEx6.text.toString().toInt()
            var categoria = ""

            if (idade < 12) {
                categoria = "Criança"
            } else if (idade >= 12 && idade <= 17) {
                categoria = "Adolescente"
            } else if (idade >= 18 && idade <= 59) {
                categoria = "Adulto"
            } else {
                categoria = "Idoso"
            }

            txtEx6.text = categoria
        }


        val editEx7 = findViewById<EditText>(R.id.etEx7)
        val btnEx7 = findViewById<Button>(R.id.btnEx7)
        val txtEx7 = findViewById<TextView>(R.id.tvEx7)

        btnEx7.setOnClickListener {
            val valorCompra = editEx7.text.toString().toFloat()
            var porcentagem = 0

            if (valorCompra < 100) {
                porcentagem = 0
            } else if (valorCompra >= 100 && valorCompra <= 299.99f) {
                porcentagem = 5
            } else if (valorCompra >= 300 && valorCompra <= 499.99f) {
                porcentagem = 10
            } else {
                porcentagem = 15
            }

            val valorDesconto = valorCompra * (porcentagem / 100.0f)
            val valorFinal = valorCompra - valorDesconto

            txtEx7.text = "Desconto de " + porcentagem.toString() + "% - Total: R$ " + String.format("%.2f", valorFinal)
        }
    }
}