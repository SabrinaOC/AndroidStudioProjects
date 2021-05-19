package com.example.vargate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TrollingSL extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.mainactivity.MESSAGE";

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

        //Intent conecta actividades, en este caso la actual (this) con aboutInfo
        Intent intent= new Intent(this, AboutInfo.class);

        startActivity(intent);
    }

    public void abrirWeb(View view) {

        //Intent conecta actividades, en este caso la actual (this) con webBuscada
        Intent intent= new Intent(this, webBuscada.class);

        //lanzamos un activity y le mandamos lo que tenemos en intent
        startActivity(intent);
    }

    public void abrirMaps(View view) {

        //Intent conecta actividades, en este caso la actual (this) con mainactivity3
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("geo:37.41131, -4.47793"));

        startActivity(intent);
    }

    public void abrirFoto(View view) {

       final int REQUEST_IMAGE_CAPTURE = 1;
        //Intent conecta actividades, en este caso la actual (this) con mainactivity3
        Intent intent= new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(intent, REQUEST_IMAGE_CAPTURE);
        }

        startActivity(intent);
    }

    /**
     *
     * @param view
     */
    public void abrirCorreo(View view) {

        Intent intent=Intent.makeMainSelectorActivity(Intent.ACTION_MAIN, Intent.CATEGORY_APP_EMAIL);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);//Min SDK 15
        startActivity(intent);

    }

    /**
     *
     * @param view
     */
    public void abrirTelefono(View view) {

        Intent intent= new Intent(Intent.ACTION_DIAL);
        startActivity(intent);

    }
}