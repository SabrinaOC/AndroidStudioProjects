package com.example.ejercicioCalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

  // lista para recoger botones números
    List<Button> listaBut = new ArrayList<Button>();
    //variables necesarias para operaciones
    String texto = "";
    Button borrarBoton;
    Button masBoton;
    Button menosBoton;
    Button multBoton;
    Button divBoton;
    Button igualBoton;

    Double resultadoFinal;
    Double numTrabajo1;
    Double numTrabajo2;

    int identificadorOperacion; //1 Div, 2 Mult, 3 Sum, 4 Rest

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttons();

    }

    /**
     * Método para poner botones
     */
    public void buttons () {
        //creamos botones y los añadimos a nuestra lista
        listaBut.add(findViewById(R.id.btn0));
        listaBut.add(findViewById(R.id.btn1));
        listaBut.add(findViewById(R.id.btn2));
        listaBut.add(findViewById(R.id.btn3));
        listaBut.add(findViewById(R.id.btn4));
        listaBut.add(findViewById(R.id.btn5));
        listaBut.add(findViewById(R.id.btn6));
        listaBut.add(findViewById(R.id.btn7));
        listaBut.add(findViewById(R.id.btn8));
        listaBut.add(findViewById(R.id.btn9));

        borrarBoton = findViewById(R.id.btnBorrar);
        masBoton = findViewById(R.id.btnMas);
        menosBoton = findViewById(R.id.btnMenos);
        multBoton = findViewById(R.id.btnMult);
        divBoton = findViewById(R.id.btnDiv);
        igualBoton = findViewById(R.id.btnIgual);

        pulsarBoton();
        pulsarBotonesEspeciales();

    }

    /**
     * Método para poner números en pantalla al tocar botones
     */
    public void pulsarBoton () {
        for (Button  b : listaBut) {
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //cogemos el texto del botón y lo guardamos en un string
                    texto = texto + b.getText().toString();
                    ponerNumEnPantalla(texto);

                }
            });
        }
    }

    /**
     * Método para borrar pantalla
     */
    public void pulsarBorrar () {
        borrarBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //borramos el texto que aparece en pantalla
                texto = "";
                ponerNumEnPantalla(texto);

                //y ponemos el num1 a null para seguir haciendo operaciones
                numTrabajo1 = null;
            }
        });
    }


    /**
     * Método para dividir (1ª parte)
     */
    public void pulsarDiv () {
        divBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numTrabajo1 == null) {
                    //guardamos el texto que aparece en pantalla y limpiamos pantalla
                    numTrabajo1 = Double.parseDouble(texto);

                    texto = "";
                    ponerNumEnPantalla(texto);


                } else {
                    //conservamos el número de trabajo y ponemos pantalla a 0

                    texto = "";
                    ponerNumEnPantalla(texto);


                }

                //para el switch
                identificadorOperacion = 1;
            }
        });
    }

    /**
     *
     */
    public void pulsarMult () {
        multBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numTrabajo1 == 1) {
                    //div el texto que aparece en pantalla
                    numTrabajo1 = Double.parseDouble(texto);
                    texto = "";
                    ponerNumEnPantalla(texto);
                } else {
                    //conservamos el número de trabajo y ponemos pantalla a 0
                    texto = "";
                    ponerNumEnPantalla(texto);
                }

                //para el switch
                identificadorOperacion = 2;
            }
        });
    }

    /**
     *
     */
    public void pulsarSuma () {
        masBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numTrabajo1 == null) {
                    //div el texto que aparece en pantalla
                    numTrabajo1 = Double.parseDouble(texto);
                    texto = "";

                    ponerNumEnPantalla(texto);
                } else {
                    //conservamos el número de trabajo y ponemos pantalla a 0

                    texto = "";
                    ponerNumEnPantalla(texto);
                }

                //para el switch
                identificadorOperacion = 3;
            }
        });
    }

    /**
     *
     */
    public void pulsarResta () {
        menosBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numTrabajo1 == null) {
                    //div el texto que aparece en pantalla
                    numTrabajo1 = Double.parseDouble(texto);
                    texto = "";

                    ponerNumEnPantalla(texto);
                } else {
                    //conservamos el número de trabajo y ponemos pantalla a 0
                    texto = "";
                    ponerNumEnPantalla(texto);
                }
                //para el switch
                identificadorOperacion = 4;
            }
        });
    }


    public void pulsarIgual (View v) {
        numTrabajo2 = Double.parseDouble(texto);
        //ponemos pantalla a cero
        //texto = "";

                //dependiendo de la operación que vamos a realizar usaremos un case u otro
                switch (identificadorOperacion) {
                    case 1: //division
                        //realizamos operación
                        resultadoFinal = numTrabajo1 / numTrabajo2;

                        ponerNumEnPantalla("" + resultadoFinal);
                        break;
                    case 2: //multiplicacción
                        resultadoFinal = numTrabajo1 * numTrabajo2;
                        ponerNumEnPantalla("" + resultadoFinal);

                        break;
                    case 3: //suma
                        resultadoFinal = numTrabajo1 + numTrabajo2;
                        ponerNumEnPantalla("" + resultadoFinal);
                        break;
                    case 4: //resta
                        resultadoFinal = numTrabajo1 - numTrabajo2;
                        ponerNumEnPantalla("" + resultadoFinal);
                        break;

                }

        //para poder seguir haciendo cuentas, guardamos el resultado final y ponemos a null el num2
        numTrabajo1 = resultadoFinal;
        numTrabajo2 = null;


    }

    /**
     *
     */
    public void pulsarBotonesEspeciales () {
        pulsarBorrar();
        pulsarDiv();
        pulsarMult();
        pulsarSuma();
        pulsarResta();
    }

    /**
     *
     * @param str
     */
    public void ponerNumEnPantalla(String str) {

        ((EditText) findViewById(R.id.resultado)).setText(str);
    }


}