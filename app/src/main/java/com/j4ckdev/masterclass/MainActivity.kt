package com.j4ckdev.masterclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

/*
 * Equivalencia en JAVA
 *
 * public class MainActivity extends AppCompactActivity implements MainInterface{
 *  @Override
 *      public void onCreate(Bundle savedInstanceState){
 *          super.onCreate(SavedinstanceState)
 *          setContentView(R.layout.activity_main);
 *
 *          EditText numeroUno = findViewById(R.id.numeroUno);
 *          EditText numeroDos = findViewById(R.id.numeroDos);
 *
 *          Button calcular = findViewById(R.id.calcular);
 *          calcular.setOnClickListener(new OnClickListener(){
 *              @Override
 *              void onClick(View view){
 *                  String uno = numeroUno.getText().toString();
 *                  String dos = numeroDos.getText().toString();
 *
 *                  Double numUno = Double.parseDouble(uno);
 *                  Double numDos = Double.parseDouble(dos);
 *                  Double resultado = numUno * numDos;
 *
 *                  Toast.makeText(
                        MainActivity.this,
                        "El resultado de la multiplicación es igual a " + resultado,
                        Toast.LENGTH_SHORT
                    ).show()
 *              }
 *          });
 *      }
 * }
 *
 * */

class MainActivity : AppCompatActivity(), MainInterface{ // La , sirve para agregar interfaces y : representa al extends
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calcular.setOnClickListener{
            // val -> es como una variable final o que no cambia en el tiempo
            // var -> cambia en el tiempo

            val uno:String = numeroUno.text.toString() // En la variable al colocar : después del nombre, sirve para definir el tipo de la variable
            val dos:String = numeroDos.text.toString()
            // Otra alternativa para especificar el tipo de variable es inicializandola ej. val variableString = "", val variableInt = 0, val variableDouble = 0.0

            val numUno:Double = uno.toDouble()
            val numDos:Double = dos.toDouble()
            val resultado:Double = numUno * numDos

            Toast.makeText(
                    this,
                    "El resultado de la multiplicación es igual a $resultado",
                    Toast.LENGTH_SHORT
            ).show()
        }
    }
}

interface MainInterface{
}