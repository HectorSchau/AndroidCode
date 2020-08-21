package com.example.santiago;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Clasificados_Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clasificados__main);
    }
    public void Consultar(View view) {
        Intent intent = new Intent(this, Consultas_Main.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Consultar", Toast.LENGTH_SHORT).show();
    }
    public void Ingresar(View view) {
        Intent intent = new Intent(this, ING_01_Rubro.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Ingresar", Toast.LENGTH_SHORT).show();
    }

}
