package com.nekiol.br.conversordemoeda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.Toast
import com.nekiol.br.conversordemoeda.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonDolar.setOnClickListener {
            escrever(4.82)
        }

        binding.buttonEuro.setOnClickListener {
            escrever(5.22)
        }

        binding.buttonPeso.setOnClickListener {
            escrever(0.019)
        }
    }

    private fun escrever(taxa: Double) {
        val reais = binding.editReais.text.toString().trim()

        if (!reais.isEmpty()) {
            val resultado = reais.toDouble() * taxa
            Toast.makeText(applicationContext, "${resultado}$", Toast.LENGTH_SHORT).show()
        }else
            Toast.makeText(applicationContext, "Insira um Valor", Toast.LENGTH_SHORT).show()
    }
}
