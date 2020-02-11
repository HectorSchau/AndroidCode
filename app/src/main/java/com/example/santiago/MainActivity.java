package com.example.santiago;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the toolbar view inside the activity layout
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(toolbar);
    }

    // Menu icons are inflated just as they were with actionbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    private void meimportaUnPingo(){}
    public void Telefonos(View view) {
        Toast.makeText(getApplicationContext(), "Teléfonos de Utilidad Pública", Toast.LENGTH_SHORT).show();
    }
    public void Profesionales(View view) {
        Intent intent = new Intent(this, Profesionales_Main_Activity.class);
        startActivity(intent);

        Toast.makeText(getApplicationContext(), "Profesionales...", Toast.LENGTH_SHORT).show();
    }
}


