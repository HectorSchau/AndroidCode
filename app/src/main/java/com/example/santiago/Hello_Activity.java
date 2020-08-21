package com.example.santiago;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Hello_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_activity);
    }
    /** Called when the user taps the b_log_in button */
    public void log_in(View view) {
        // Do something in response to button log_in
        Intent intent = new Intent(this, Entrada_Activity.class);
        startActivity(intent);
    }
}
