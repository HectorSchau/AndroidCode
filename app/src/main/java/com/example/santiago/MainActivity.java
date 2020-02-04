package com.example.santiago;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
//import android.support.v7.app.ActionBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void meimportaUnPingo(){}
    public void Telefonos(View view) {
        Toast.makeText(getApplicationContext(), "Teléfonos de Utilidad Pública", Toast.LENGTH_SHORT).show();
    }
    public void Profesionales(View view) {
        Toast.makeText(getApplicationContext(), "Profesionales...", Toast.LENGTH_SHORT).show();
    }
}


