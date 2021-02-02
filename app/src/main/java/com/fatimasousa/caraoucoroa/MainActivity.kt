package com.fatimasousa.caraoucoroa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageButton.setOnClickListener {

            val intent = Intent(applicationContext, ResultadoActivity::class.java)
            //gera número randomico
            val numero = Random().nextInt(2)

            //envia numero para a proxima activity
            intent.putExtra("numero", numero)

            startActivity(intent)

        }
    }
}