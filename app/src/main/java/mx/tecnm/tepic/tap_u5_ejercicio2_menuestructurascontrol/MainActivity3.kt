package mx.tecnm.tepic.tap_u5_ejercicio2_menuestructurascontrol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        button6.setOnClickListener {
            var opcionSpinner = spinner.selectedItemPosition

            when(opcionSpinner){
                0 -> {
                    var cadena1 = "919"
                    var valorEntero = Integer.parseInt(cadena1)

                    valorEntero += 1

                    editTextResultado.setText("conversión CAD a INT: ${valorEntero}")
                }
                1 -> {
                    var cadena2 = "5.18"
                    var valorDoble = cadena2.toDouble()

                    valorDoble += 0.92

                    editTextResultado.setText("conversión CAD a DOUBLE: ${valorDoble}")
                }
                2 -> {
                    var decimal = 29.8
                    var cadena3 = decimal.toString()

                    cadena3 = "Conversión DEC a CAD"+cadena3

                    editTextResultado.setText(cadena3)
                }
                3 -> {
                    var entero = 915
                    var cadena4 = "Conversion INT a CAD: "+entero

                    editTextResultado.setText(cadena4)
                }
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menuconversion, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.regresar -> {
                finish()
            }
            R.id.limpiar -> {
                editTextResultado.setText("")
                Toast.makeText(this, "Se limpió campo texto", Toast.LENGTH_LONG).show()
            }
        }
        return true
    }
}