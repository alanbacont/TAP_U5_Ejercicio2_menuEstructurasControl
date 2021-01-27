package mx.tecnm.tepic.tap_u5_ejercicio2_menuestructurascontrol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    var num1 = 0
    var num2 = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        button.setOnClickListener {
            num1 = numero1.text.toString().toInt()
            num2 = numero2.text.toString().toInt()

            if (num1>num2){
                Toast.makeText(this, "El número ${num1} es Mayor que ${num2}", Toast.LENGTH_LONG)
                    .show()
            }else {
                if(num1<num2){
                    Toast.makeText(this, "El número ${num1} es Menor que ${num2}", Toast.LENGTH_LONG)
                        .show()
                }else{
                    Toast.makeText(this, "Ambos son iguales", Toast.LENGTH_LONG)
                        .show()
                }
            }

        }

        button2.setOnClickListener {
            finish()
        }
    }
}