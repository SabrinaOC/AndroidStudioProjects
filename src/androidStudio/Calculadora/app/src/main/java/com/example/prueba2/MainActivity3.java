package com.example.prueba2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ComponentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.TextValueSanitizer;
import android.widget.TextView;

import static com.example.prueba2.MainActivity.EXTRA_MESSAGE;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent intent= getIntent();
        String message = intent.getStringExtra(EXTRA_MESSAGE);

        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }

}