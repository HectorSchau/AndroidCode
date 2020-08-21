package com.example.santiago;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class Prop_menuVtas extends AppCompatActivity {
    private List<Integer> numeros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prop_menu_vtas);

        numeros = ((GlobalClass) this.getApplication()).getGlobalArrayList();
        //PROPIEDADES VENTAS
        TextView mText = (TextView) findViewById(R.id.textView3);
        mText.setText("(" + (numeros.get(2)+numeros.get(3)+numeros.get(4)+numeros.get(5)+numeros.get(6)) + " avisos)");

        Button mBtn202=(Button)findViewById(R.id.mBtn202);
        mBtn202.setText("Casas ("+numeros.get(2)+")");

        Button mBtn203=(Button)findViewById(R.id.mBtn203);
        mBtn203.setText("Departamentos ("+numeros.get(3)+")");

        Button mBtn204=(Button)findViewById(R.id.mBtn204);
        mBtn204.setText("Locales Comerciales ("+numeros.get(4)+")");

        Button mBtn205=(Button)findViewById(R.id.mBtn205);
        mBtn205.setText("Terrenos & Lotes ("+numeros.get(5)+")");

        Button mBtn206=(Button)findViewById(R.id.mBtn206);
        mBtn206.setText("Campos & Fincas ("+numeros.get(6)+")");

    }
    public void p202 (View view) {
        Intent intent = new Intent(this, p202.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Casas Ventas", Toast.LENGTH_SHORT).show();
    }
    public void p203 (View view) {
        Intent intent = new Intent(this, p203.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Departamentos Ventas", Toast.LENGTH_SHORT).show();
    }
    public void p204 (View view) {
        Intent intent = new Intent(this, p204.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Locales Comerciales", Toast.LENGTH_SHORT).show();
    }
    public void p205 (View view) {
        Intent intent = new Intent(this, p205.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Terrenos Lotes", Toast.LENGTH_SHORT).show();
    }
    public void p206 (View view) {
        Intent intent = new Intent(this, p206.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Campos/Fincas", Toast.LENGTH_SHORT).show();
    }
}
