package com.example.contador1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var contador1 = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


     btnIncrementar.setOnClickListener {
         contador1++
         tvContador.text = "$contador1"


     }
        btnDecrementar.setOnClickListener {
            contador1--
            tvContador.text = "$contador1"
        }
    }
}