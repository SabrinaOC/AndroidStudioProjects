package com.example.vargate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TrollingSL extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trolling_s_l);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.menu_settings:
                Toast.makeText(this, "Sabrina Ojea Chapelet", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_about:
                abrirVentanaAbout();
                return true;
            case R.id.menu_item3:
                Toast.makeText(this, "No disponible en estos momentos", Toast.LENGTH_SHORT).show();
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void abrirVentanaAbout() {

        //Intent conecta actividades, en este caso la actual (this) con mainactivity3
        Intent intent= new Intent(this, AboutInfo.class);
        //Para trabajar con un objeto que tenemos dentro de la vista usaremos findViewById
      /*  EditText editText = (EditText) findViewById(R.id.resultado);
        String message= editText.getText().toString();
        //almacenamos información de la caja de texto en el objeto intent para poder usarlo luego
        intent.putExtra(EXTRA_MESSAGE, message); */
        //lanzamos un activity y le mandamos lo que tenemos en intent
        startActivity(intent);
    }
}