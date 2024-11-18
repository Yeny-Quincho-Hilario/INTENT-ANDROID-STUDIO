package com.example.miaplicacin2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void btncaso1 (View view){
        Intent ventana1 = new Intent(MainActivity.this, Activity2.class);
        ventana1.putExtra("nombre","Yeny Quincho Hilario");
        startActivity(ventana1);
    }
    public  void btncaso2(View view){
        Intent ventana2 = new Intent(MainActivity.this, Activity3.class);
        startActivity(ventana2);
    }

    public  void btncaso3 (View view){
        Intent ventana3 = new Intent(MainActivity.this, Activity4.class);
        startActivity(ventana3);
    }
    public void btncaso4 ( View view){
        Intent ventana4 = new Intent(MainActivity.this, Activity6.class);
        startActivity(ventana4);
    }
   public void setSalir(View view){
        finish();
    }
}