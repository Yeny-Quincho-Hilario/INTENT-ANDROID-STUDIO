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

public class Activity7 extends AppCompatActivity {
    TextView lblresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_7);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        lblresultado = findViewById(R.id.lblresultado);// Vincula el texView
        //aca recibimos los datos enviados del anterior activity
        String nombreprod = getIntent().getStringExtra("nombreprod");
        double precio = getIntent().getDoubleExtra ("precio", 0);
        int descuento = getIntent().getIntExtra ("descuento",0);
        double precioFinal= getIntent().getDoubleExtra("precioFinal",0) ;

        //finalmente mostraremos los resultados
        String resultados = "Producto: "+ nombreprod + "\n"+ "Precio: "+ precio + "\n"+
                "Descuento: " + descuento + "%"+"\n" + "Precio Final: " + precioFinal;

        lblresultado.setText(resultados);

        }

        public  void setBtnsalir7 (View view){
            Intent ventanaf= new Intent(Activity7.this, MainActivity.class);
            startActivity(ventanaf);

        }
}