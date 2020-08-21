package com.example.santiago;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
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

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TextView textViewUsername;//, textViewUserEmail;
    private static final String URL_DATA_CANT="https://seahorse2.000webhostapp.com/cantidades.php";
    List<Integer> num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(!SharedPrefManager.getInstance(this).isLoggedIn()){
            finish();
            startActivity(new Intent(this, Login_Activity.class));
        }

        //textViewUsername = (TextView) findViewById(R.id.textViewUsername);
        //textViewUserEmail = (TextView) findViewById(R.id.textViewUseremail);


        //textViewUserEmail.setText(SharedPrefManager.getInstance(this).getUserEmail());
        //textViewUsername.setText(SharedPrefManager.getInstance(this).getUsername());
        //textViewUsername.setText(SharedPrefManager.getInstance(this).getUsername()+":"+SharedPrefManager.getInstance(this).getUserEmail());

        // Find the toolbar view inside the activity layout
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(toolbar);
        //llamanum();
        loadCantidadesViewData();
    }

    public void llamanum(){
        //getting the list
        num = ((GlobalClass) this.getApplication()).getGlobalArrayList();
        //clear the list
        //num.clear();
        //asignar valores a numeros
        num.add(3000);
        num.add(31);
        num.add(71);
        //saving the list
        ((GlobalClass) this.getApplication()).setGlobalArrayList(num);
    }
    private void loadCantidadesViewData(){
        final ProgressDialog progressDialog=new ProgressDialog(this);
        progressDialog.setMessage("Cargando datos...");
        progressDialog.show();
        //getting the list
        num = ((GlobalClass) this.getApplication()).getGlobalArrayList();
        //clear the list
        //num.clear();
        //asignar valores a numeros
        //num.add(4000);
        //num.add(41);
        //num.add(71);

        //Toast.makeText(getApplicationContext(), "Trato de demorar...", Toast.LENGTH_SHORT).show();
        progressDialog.dismiss();

        StringRequest stringRequest = new StringRequest(Request.Method.GET,
                URL_DATA_CANT,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String s) {
                        progressDialog.dismiss();
                        try {
                            //Toast.makeText(getApplicationContext(), "Hace el try...", Toast.LENGTH_SHORT).show();
                            JSONObject jsonObject = new JSONObject(s);
                            JSONArray array = jsonObject.getJSONArray("cantidad");
                            //Toast.makeText(getApplicationContext(), String.valueOf(array.length()), Toast.LENGTH_SHORT).show();
                            for(int i=0; i<array.length();i++){
                                JSONObject o = array.getJSONObject(i);
                                int item = o.getInt ("firstName");
                                num.add(item);
                                //Toast.makeText(getApplicationContext(), String.valueOf(item), Toast.LENGTH_SHORT).show();
                            }
                            //adapter=new MyAdapter(listItems, getApplicationContext());
                            //recyclerView.setAdapter(adapter);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        progressDialog.dismiss();
                        Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_LONG).show();
                    }
                });
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
        Toast.makeText(getApplicationContext(), "Los otros...", Toast.LENGTH_SHORT).show();

        //saving the list
        ((GlobalClass) this.getApplication()).setGlobalArrayList(num);
    }

    // Menu icons are inflated just as they were with actionbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        //Aqui pongo texto para el usuario
        MenuItem item = menu.findItem(R.id.usuario);
        item.setTitle(SharedPrefManager.getInstance(this).getUsername());
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.menuLogout:
                SharedPrefManager.getInstance(this).logout();
                finish();
                startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.menuSettings:
                Toast.makeText(this, "You clicked settings", Toast.LENGTH_LONG).show();
                break;
        }
        return true;
    }

    public void Telefonos(View view) {
        Toast.makeText(getApplicationContext(), "Teléfonos de Utilidad Pública", Toast.LENGTH_SHORT).show();
    }
    public void Clasificados(View view) {
        Intent intent = new Intent(this, Clasificados_Main.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Avisos Clasificados", Toast.LENGTH_SHORT).show();
    }
    public void Profesionales(View view) {
        Intent intent = new Intent(this, Profesionales_Main_Activity.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Profesionales...", Toast.LENGTH_SHORT).show();
    }

}


