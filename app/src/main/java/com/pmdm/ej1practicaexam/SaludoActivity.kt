package com.pmdm.ej1practicaexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pmdm.ej1practicaexam.databinding.ActivitySaludoBinding

class SaludoActivity : AppCompatActivity() {

    lateinit var binding:ActivitySaludoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySaludoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*Coge el valor pasado por el intent(tipo String) y lo guarda en una variable*/
        var texto=intent.getStringExtra("texto")
        /*Actualiza el textView con una cadena con el nombre almacenado en la variable*/
        binding.textView2.setText("Buenas tardes "+texto)

    }
}