package com.example.miaplicacin2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity5 extends AppCompatActivity {
    TextView lblvista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_5);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        lblvista = (TextView) findViewById(R.id.lblvista);
        // ahora escribimos el codigo para recibir los datos del intent

       // Intent i = getIntent();
       //lblvista.setText(i.getStringExtra("nombre"));

        String nombre = getIntent().getStringExtra("nombre");
        int edad = getIntent().getIntExtra("edad", 0);
        String sexo = getIntent().getStringExtra("sexo");
        double saldo = getIntent().getDoubleExtra("saldo", 0);
        boolean bono = getIntent().getBooleanExtra("bono", false);

        // calculamos el saldo actual
        //double saldoFinal = bono ? saldo * 1.05 : saldo * 0.97; este es un operador ternario para escribir una estructura consicional
        double saldoFinal;
        if (bono){
            saldoFinal = saldo * 1.05;
        }
        else{
            saldoFinal = saldo * 0.97;
        }
         // ahora mostraremos todos los datos del

        String datos = "Nombre: "+ nombre + "\n" + "Edad: "+ edad + "\n" +
                "Sexo: "+ sexo + "\n" + "Saldo Final: "+ saldoFinal ;

        lblvista.setText(datos);
    }
    public  void btnsalir5(View view){

        finish();
    }
}