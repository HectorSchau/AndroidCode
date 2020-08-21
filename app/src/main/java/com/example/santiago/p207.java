package com.example.santiago;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.os.Bundle;
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

public class p207 extends AppCompatActivity {
    private static final String URL_DATA_CLAS="https://seahorse2.000webhostapp.com/p_207.php";
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<ListItem> listItems;
    private List<Integer> numeros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p207);
        numeros = ((GlobalClass) this.getApplication()).getGlobalArrayList();

        //Barra de la Aplicacion
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Alquileres de Casas (" + numeros.get(7) + ")");

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItems=new ArrayList<>();
        //Toast.makeText(getApplicationContext(), "Va a entrar en el loadRecyclerViewData()", Toast.LENGTH_SHORT).show();
        loadRecyclerViewData();
    }
    private void loadRecyclerViewData(){
        final ProgressDialog progressDialog=new ProgressDialog(this);
        progressDialog.setMessage("Cargando datos...");
        progressDialog.show();

        StringRequest stringRequest = new StringRequest(Request.Method.GET,
                URL_DATA_CLAS,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String s) {
                        progressDialog.dismiss();
                        try {
                            //Toast.makeText(getApplicationContext(), "Hace el try...", Toast.LENGTH_SHORT).show();
                            JSONObject jsonObject = new JSONObject(s);
                            JSONArray array = jsonObject.getJSONArray("data");
                            //Toast.makeText(getApplicationContext(), String.valueOf(array.length()), Toast.LENGTH_SHORT).show();
                            for(int i=0; i<array.length();i++){
                                JSONObject o = array.getJSONObject(i);
                                ListItem item =new ListItem(
                                        o.getString("firstName"),
                                        Integer.toString(i+1)+"/"+Integer.toString(array.length())+" - "+o.getString("lastName")
                                );
                                //Toast.makeText(getApplicationContext(), String.valueOf(i), Toast.LENGTH_SHORT).show();
                                listItems.add(item);
                                //Toast.makeText(getApplicationContext(), item.getDesc(), Toast.LENGTH_SHORT).show();
                            }
                            adapter=new MyAdapter(listItems, getApplicationContext());
                            recyclerView.setAdapter(adapter);
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
    }
}

