package com.example.prueba2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

   public static final String EXTRA_MESSAGE = "com.example.mainactivity.MESSAGE";
    List<Button> listaBut = new ArrayList<Button>();
    String texto = "";
    Button borrarBoton;
    Button masBotonfind;
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
        masBotonfind = findViewById(R.id.btnMas);
        menosBoton = findViewById(R.id.btnMenos);
        multBoton = findViewById(R.id.btnMult);
        divBoton = findViewById(R.id.btnDiv);
        igualBoton = findViewById(R.id.btnIgual);

        pulsarBoton();
        pulsarBotonesEspeciales();
    }

    public void pulsarBoton () {
        for (Button  b : listaBut) {
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //cogemos el texto del botón y lo guardamos en un string
                    texto = texto + b.getText();
                    ponerNumEnPantalla(texto);

                }
            });
        }
    }

    /**
     *
     */
    public void pulsarBorrar () {
        borrarBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //borramos el texto que aparece en pantalla
                texto = "";
                ponerNumEnPantalla(texto);
            }
        });
    }

    public void pulsarDiv () {
        divBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //div el texto que aparece en pantalla
                numTrabajo1 = Double.parseDouble(texto);
                texto = "";

                ponerNumEnPantalla(texto);
                //para el switch
                identificadorOperacion = 1;
            }
        });
    }

    public void pulsarIgual () {
        numTrabajo2 = Double.parseDouble(texto);
        //ponemos pantalla a cero
        texto = "";

        igualBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //dependiendo de la operación que vamos a realizar usaremos un case u otro
                switch (identificadorOperacion) {
                    case 1: //division
                        resultadoFinal = numTrabajo1/numTrabajo2;
                        ponerNumEnPantalla("" + resultadoFinal);

                        break;

                }
            }
        });
    }

    public void pulsarBotonesEspeciales () {
        pulsarBorrar();
        pulsarDiv();
        //pulsarIgual();

    }

    public void ponerNumEnPantalla(String str) {

        ((EditText) findViewById(R.id.resultado)).setText(str);
    }

    public void enviarMensaje(View view) {

        //Intent conecta actividades, en este caso la actual (this) con mainactivity3
        Intent intent= new Intent(this, MainActivity3.class);
        //Para trabajar con un objeto que tenemos dentro de la vista usaremos findViewById
        EditText editText = (EditText) findViewById(R.id.resultado);
        String message= editText.getText().toString();
        //almacenamos información de la caja de texto en el objeto intent para poder usarlo luego
        intent.putExtra(EXTRA_MESSAGE, message);
        //lanzamos un activity y le mandamos lo que tenemos en intent
        startActivity(intent);
    }
}