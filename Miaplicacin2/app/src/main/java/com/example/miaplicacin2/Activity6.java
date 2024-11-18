package com.example.miaplicacin2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity6 extends AppCompatActivity {
    EditText txtnombreprod, txtprecio,txtdescuento;
    Button btncalcular6, btnsalir6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_6);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        txtnombreprod = findViewById(R.id.txtnombreprod);
        txtdescuento = findViewById(R.id.txtdescuento);
        txtprecio = findViewById(R.id.txtprecio);
        btncalcular6 = findViewById(R.id.btncalcular6);
        btnsalir6 = findViewById(R.id.btnsalir6);

    }

    public void setBtnsalir6 (View view){
        // primero obtenemos los datos ingresados por los docentes
        String nombreprod = txtnombreprod.getText().toString();
        double precio = Double.parseDouble(txtprecio.getText().toString());
        int descuento = Integer.parseInt(txtdescuento.getText().toString());
        double precioFinal = precio * (1-(descuento/100.0));

        //Ahora enviaremos los datos a la segunda actividad

        Intent ventanaEjercicio2 = new Intent(Activity6.this, Activity7.class);
        ventanaEjercicio2.putExtra("nombreprod", nombreprod);
        ventanaEjercicio2.putExtra("precio", precio);
        ventanaEjercicio2.putExtra("descuento", descuento);
        ventanaEjercicio2.putExtra("precioFinal",precioFinal);

        startActivity(ventanaEjercicio2);

    }
}