package com.example.santiago;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class Prop_menu2 extends AppCompatActivity {
    private List<Integer> numeros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prop_menu2);

        numeros = ((GlobalClass) this.getApplication()).getGlobalArrayList();
        //PROPIEDADES TOTAL
        TextView mText = (TextView) findViewById(R.id.textView3);
        mText.setText("(" + numeros.get(0) + " avisos)");

        //PROPIEDADES COMPRAS (201)
        Button mBtnCompras = (Button) findViewById(R.id.mBtnCompras);
        mBtnCompras.setText("Compras (" + numeros.get(1) + ")");

        //PROPIEDADES VENTAS (202 al 206)
        Button mBtnVentas = (Button) findViewById(R.id.mBtnVentas);
        mBtnVentas.setText("Ventas"+System.lineSeparator()+"(" + (numeros.get(2) + numeros.get(3) + numeros.get(4) + numeros.get(5) + numeros.get(6)) + ")");

        //PROPIEDADES ALQUILERES (207 al 209)
        Button mBtnAlquileres = (Button) findViewById(R.id.mBtnAlquileres);
        mBtnAlquileres.setText("Alquileres (" + (numeros.get(7) + numeros.get(8) + numeros.get(9)) + ")");

        //PROPIEDADES HOTELES Y HOSPEDAJES (210)
        Button mBtnHoteles = (Button) findViewById(R.id.mBtnHoteles);
        mBtnHoteles.setText("Hoteles y Hospedajes (" + numeros.get(10) + ")");

        //PROPIEDADES ALQUILERES PEDIDOS (211 al 213)
        Button mBtnAlqPed = (Button) findViewById(R.id.mBtnAlqPed);
        mBtnAlqPed.setText("Alquileres Pedidos (" + (numeros.get(11) + numeros.get(12) + numeros.get(13)) + ")");
    }

    public void Compras(View view) {
        Intent intent = new Intent(this, p201.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Propiedades Compras", Toast.LENGTH_SHORT).show();
    }
    public void Ventas(View view) {
        Intent intent = new Intent(this, Prop_menuVtas.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Propiedades Ventas", Toast.LENGTH_SHORT).show();
    }
    public void Alquileres(View view) {
        Intent intent = new Intent(this, Prop_menuAlq.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Propiedades Alquileres", Toast.LENGTH_SHORT).show();
    }
    public void Hoteles(View view) {
        Intent intent = new Intent(this, p210.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Hoteles y Hospedajes", Toast.LENGTH_SHORT).show();
    }
    //AlqPed
    public void AlqPed(View view) {
        //211 Casas - 212 Departamentos - 213 Loc. Comerciales
        Intent intent = new Intent(this, Prop_AlqPed.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Alquileres Pedidos", Toast.LENGTH_SHORT).show();
    }
}