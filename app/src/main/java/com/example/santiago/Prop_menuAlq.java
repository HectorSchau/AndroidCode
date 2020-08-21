package com.example.santiago;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class Prop_menuAlq extends AppCompatActivity {
    private List<Integer> numeros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prop_menu_alq);

        numeros = ((GlobalClass) this.getApplication()).getGlobalArrayList();
        //PROPIEDADES ALQUILERES
        TextView mText = (TextView) findViewById(R.id.textView3);
        mText.setText("(" + (numeros.get(7)+numeros.get(8)+numeros.get(9)) + " avisos)");

        Button mBtn207=(Button)findViewById(R.id.mBtn207);
        mBtn207.setText("Casas ("+numeros.get(7)+")");

        Button mBtn208=(Button)findViewById(R.id.mBtn208);
        mBtn208.setText("Departamentos ("+numeros.get(8)+")");

        Button mBtn209=(Button)findViewById(R.id.mBtn209);
        mBtn209.setText("Locales Comerciales ("+numeros.get(9)+")");

    }
    public void p207 (View view) {
        Intent intent = new Intent(this, p207.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Alquileres Casas", Toast.LENGTH_SHORT).show();
    }
    public void p208 (View view) {
        Intent intent = new Intent(this, p208.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Alquileres Departamentos", Toast.LENGTH_SHORT).show();
    }
    public void p209 (View view) {
        Intent intent = new Intent(this, p209.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Alquileres Locales Comerciales", Toast.LENGTH_SHORT).show();
    }
}
