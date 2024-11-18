package com.example.miaplicacin2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity4 extends AppCompatActivity {

    EditText txtnombre,txtedad,txtsexo,txtsaldo;
    Button btncalcular;
    RadioGroup rbtopciones;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        txtnombre = (EditText) findViewById(R.id.txtnombre);
        txtedad = (EditText) findViewById(R.id.txtedad);
        txtsexo = (EditText) findViewById(R.id.txtsexo);
        txtsaldo = (EditText) findViewById(R.id.txtsaldo);
        rbtopciones=findViewById(R.id.rbtopciones);
        btncalcular = (Button) findViewById(R.id.btncalcular);
     }

    public void setBtncalcular (View view){
         String nombre = txtnombre.getText().toString();
         int edad = Integer.parseInt(txtedad.getText().toString());
         String sexo = txtsexo.getText().toString();
         double saldo = Double.parseDouble(txtsaldo.getText().toString());
         //boolean bono = rbtbono.isChecked();
         //aca determinamos si se selecciono bono o descuento
         int opcionSelec = rbtopciones.getCheckedRadioButtonId();
         boolean bono = opcionSelec==R.id.rbtbono;

         // ahora crearemos INTENT para pasar los datos a la segunda actividad:
         Intent ventanaCalcular = new Intent(Activity4.this, Activity5.class);
        ventanaCalcular.putExtra("nombre", nombre);
        ventanaCalcular.putExtra("edad", edad);
        ventanaCalcular.putExtra("sexo", sexo);
        ventanaCalcular.putExtra("saldo", saldo);
        ventanaCalcular.putExtra("bono", bono);

        startActivity(ventanaCalcular);
    }
}


