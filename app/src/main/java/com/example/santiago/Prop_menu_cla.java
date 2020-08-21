package com.example.santiago;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Prop_menu_cla extends AppCompatActivity {
    private List<Integer> numeros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prop_menu_cla);

        numeros = ((GlobalClass) this.getApplication()).getGlobalArrayList();

        TextView mText=(TextView) findViewById(R.id.textView2);
        mText.setText("PROPIEDADES ("+numeros.get(0)+" avisos)");

        Button mBtn201=(Button)findViewById(R.id.mc_p201);
        mBtn201.setText("Propiedades Compras ("+numeros.get(1)+")");

        Button mBtn202=(Button)findViewById(R.id.mc_p202);
        mBtn202.setText("Casas ("+numeros.get(2)+")");

        Button mBtn203=(Button)findViewById(R.id.mc_p203);
        mBtn203.setText("Departamentos ("+numeros.get(3)+")");

        Button mBtn204=(Button)findViewById(R.id.mc_p204);
        mBtn204.setText("Locales Comerciales ("+numeros.get(4)+")");

        Button mBtn205=(Button)findViewById(R.id.mc_p205);
        mBtn205.setText("Terrenos/Lotes ("+numeros.get(5)+")");

        Button mBtn206=(Button)findViewById(R.id.mc_p206);
        mBtn206.setText("Campos/Fincas ("+numeros.get(6)+")");

        Button mBtn207=(Button)findViewById(R.id.mc_p207);
        mBtn207.setText("Casas ("+numeros.get(7)+")");

        Button mBtn208=(Button)findViewById(R.id.mc_p208);
        mBtn208.setText("Departamentos ("+numeros.get(8)+")");

        Button mBtn209=(Button)findViewById(R.id.mc_p209);
        mBtn209.setText("Locales Comerciales ("+numeros.get(9)+")");

        Button mBtn210=(Button)findViewById(R.id.mc_p210);
        mBtn210.setText("Hoteles y Hospedajes ("+numeros.get(10)+")");

        Button mBtn211=(Button)findViewById(R.id.mc_p211);
        mBtn211.setText("Casas ("+numeros.get(11)+")");

        Button mBtn212=(Button)findViewById(R.id.mc_p212);
        mBtn212.setText("Departamentos ("+numeros.get(12)+")");

        Button mBtn213=(Button)findViewById(R.id.mc_p213);
        mBtn213.setText("Locales Comerciales ("+numeros.get(13)+")");
    }
    public void p201 (View view) {
        Intent intent = new Intent(this, p201.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Propiedades Compras", Toast.LENGTH_SHORT).show();
    }
    public void p207 (View view) {
        Intent intent = new Intent(this, p207.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Casas", Toast.LENGTH_SHORT).show();
    }
    public void p208 (View view) {
        Intent intent = new Intent(this, p208.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Departamentos", Toast.LENGTH_SHORT).show();
    }
    public void p209 (View view) {
        Intent intent = new Intent(this, p209.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Locales Comerciales", Toast.LENGTH_SHORT).show();
    }
    public void p210 (View view) {
        Intent intent = new Intent(this, p210.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Hoteles y Hospedajes", Toast.LENGTH_SHORT).show();
    }
    public void p211 (View view) {
        Intent intent = new Intent(this, p211.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Casas", Toast.LENGTH_SHORT).show();
    }
    public void p212 (View view) {
        Intent intent = new Intent(this, p212.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Departamentos", Toast.LENGTH_SHORT).show();
    }
    public void p213 (View view) {
        Intent intent = new Intent(this, p213.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Locales Comerciales", Toast.LENGTH_SHORT).show();
    }
}

