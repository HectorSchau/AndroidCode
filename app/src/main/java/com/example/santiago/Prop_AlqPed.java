package com.example.santiago;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class Prop_AlqPed extends AppCompatActivity {
    private List<Integer> numeros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prop__alqped);
        numeros = ((GlobalClass) this.getApplication()).getGlobalArrayList();
        //PROPIEDADES ALQUILERES
        TextView mText = (TextView) findViewById(R.id.textView3);
        mText.setText("(" + (numeros.get(11)+numeros.get(12)+numeros.get(13)) + " avisos)");

        Button mBtn211=(Button)findViewById(R.id.mBtn211);
        mBtn211.setText("Casas ("+numeros.get(11)+")");

        Button mBtn212=(Button)findViewById(R.id.mBtn212);
        mBtn212.setText("Departamentos ("+numeros.get(12)+")");

        Button mBtn213=(Button)findViewById(R.id.mBtn213);
        mBtn213.setText("Locales Comerciales ("+numeros.get(13)+")");

    }
    public void p211 (View view) {
        Intent intent = new Intent(this, p211.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Alquileres Pedidos Casas", Toast.LENGTH_SHORT).show();
    }
    public void p212 (View view) {
        Intent intent = new Intent(this, p212.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Alquileres Pedidos Departamentos", Toast.LENGTH_SHORT).show();
    }
    public void p213 (View view) {
        Intent intent = new Intent(this, p213.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Alquileres Pedidos - Locales Comerciales", Toast.LENGTH_SHORT).show();
    }
}

