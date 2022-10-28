package com.example.tarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityResultado extends AppCompatActivity {

    TextView txtr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        txtr = (TextView) findViewById(R.id.txtr);

        String dato = getIntent().getStringExtra("dato");

        txtr.setText("el resultado es: "+dato);
    }
}