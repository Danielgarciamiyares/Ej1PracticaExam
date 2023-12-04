package com.pmdm.ej1practicaexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.view.menu.MenuView.ItemView
import com.pmdm.ej1practicaexam.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*Al pulsar el boton de guardar te manda a otra pantalla(actividad) y le pasa un valor a esa pantalla*/
        binding.btnGuardar.setOnClickListener{
            /*combiar entre activities*/
            val intent =Intent(this,SaludoActivity::class.java)
                .apply {
                /*mete en Extra el texto que haya en el editText*/
                putExtra("texto",binding.editText?.text.toString())
           }
            startActivity(intent)
        }

        /*Al pulsar el boton de enviar abre un menu para compartir los datos de un editText */
        binding.btnEnviar.setOnClickListener{
            /*Hacer un menu para compartir los datos de un editText*/
            val sendIntent:Intent=Intent().apply{
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT,binding.editText.text.toString())
                type="text/plain"
            }
            val shareIntent=Intent.createChooser(sendIntent,null)
            startActivity(shareIntent)
        }
    }


}