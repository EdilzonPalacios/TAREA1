package com.example.tarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtn1, txtn2;
    Button suma, resta, multi, division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtn1=(EditText) findViewById(R.id.txtn1);
        txtn2=(EditText) findViewById(R.id.txtn2);

        //SUMAAAAAAAAAA
        suma=(Button) findViewById(R.id.suma);

        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int total=Msuma(Integer.valueOf(txtn1.getText().toString()),
                        Integer.valueOf(txtn2.getText().toString()));

                //Toast.makeText(MainActivity.this, "La suma es "+total, Toast.LENGTH_SHORT).show();

                String paso =String.valueOf(total);

                Intent intent = new Intent(getApplicationContext(), ActivityResultado.class);
                intent.putExtra("dato", paso);
                startActivity(intent);
            }
        });

        //RESTAAAAAAAAAAAAAAAAAAAAAAAA
        resta=(Button) findViewById(R.id.resta);

        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int total=Mresta(Integer.valueOf(txtn1.getText().toString()),
                        Integer.valueOf(txtn2.getText().toString()));

                //Toast.makeText(MainActivity.this, "La resta es "+total, Toast.LENGTH_SHORT).show();

                String paso =String.valueOf(total);

                Intent intent = new Intent(getApplicationContext(), ActivityResultado.class);
                intent.putExtra("dato", paso);
                startActivity(intent);
            }
        });

        //MULTIPLICAAAAAAAAR
        multi=(Button) findViewById(R.id.multi);

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int total=Mmulti(Integer.valueOf(txtn1.getText().toString()),
                        Integer.valueOf(txtn2.getText().toString()));

                //Toast.makeText(MainActivity.this, "La multiplicacion es "+total, Toast.LENGTH_SHORT).show();

                String paso =String.valueOf(total);

                Intent intent = new Intent(getApplicationContext(), ActivityResultado.class);
                intent.putExtra("dato", paso);
                startActivity(intent);
            }
        });

        //DIVISIOooooooooooooon
        division=(Button) findViewById(R.id.division);

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int total=Mdiv(Integer.valueOf(txtn1.getText().toString()),
                        Integer.valueOf(txtn2.getText().toString()));

                //Toast.makeText(MainActivity.this, "La division es "+total, Toast.LENGTH_SHORT).show();

                String paso =String.valueOf(total);

                Intent intent = new Intent(getApplicationContext(), ActivityResultado.class);
                intent.putExtra("dato", paso);
                startActivity(intent);
            }
        });

    }

    private int Msuma(int n1, int n2) {

        return n1+n2;

    }

    private int Mresta(int n1, int n2) {

        return n1-n2;

    }

    private int Mmulti(int n1, int n2) {

        return n1*n2;

    }

    private int Mdiv(int n1, int n2) {

        return n1/n2;

    }
}