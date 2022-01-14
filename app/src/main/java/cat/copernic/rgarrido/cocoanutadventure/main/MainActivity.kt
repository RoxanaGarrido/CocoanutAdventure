package cat.copernic.rgarrido.cocoanutadventure.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cat.copernic.rgarrido.cocoanutadventure.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        //Deshabilitar función atrás, excepto si se está en la pantalla de settings
    }

    /*
    Crear un método statico progressbar para llamar en todos los tittles
     */
}