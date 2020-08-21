package com.example.santiago;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;

public class Consultas_Main extends AppCompatActivity {
    private List<Integer> numeros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.consultas__main);

        numeros = ((GlobalClass) this.getApplication()).getGlobalArrayList();
        //BOTON AUTOMOTORES (100)
        Button mBtnAuto = (Button) findViewById(R.id.mc_auto);
        mBtnAuto.setText("Automotores (" + numeros.get(14) + ")");// CAMBIAR LA POSICION DE LA MATRIZ
        //BOTON PROPIEDADES (200)
        Button mBtnProp = (Button) findViewById(R.id.mc_prop);
        mBtnProp.setText("Propiedades (" + numeros.get(0) + ")");
        //BOTON CONTRUCCIONES (300)
        Button mBtnConst = (Button) findViewById(R.id.mc_cons);
        mBtnConst.setText("CONSTRUCCION (" + (numeros.get(15)+numeros.get(16))+")");
        //BOTON EMPLEOS (400)
        Button mBtnEmpl = (Button) findViewById(R.id.mc_empl);
        mBtnEmpl.setText("Empleos (" + (numeros.get(17)+numeros.get(18)+numeros.get(19)) + ")");

        //FALTA 500 PROFESIONALES

        //BOTON SERVICIOS (600)
        Button mBtnServ = (Button) findViewById(R.id.mc_serv);
        mBtnServ.setText("Servicios ("+(numeros.get(22)+numeros.get(23)+numeros.get(24)+numeros.get(25)+numeros.get(26)+numeros.get(27)+numeros.get(28)+numeros.get(29)+numeros.get(30)+numeros.get(31))+")");
        //BOTON VARIOS (700)
        Button mBtnVarios = (Button) findViewById(R.id.mc_vari);
        mBtnVarios.setText("Varios ("+(numeros.get(32)+numeros.get(33)+numeros.get(34)+numeros.get(35)+numeros.get(36)+numeros.get(37)+numeros.get(38)+numeros.get(39)+numeros.get(40)+numeros.get(41)+numeros.get(42)+numeros.get(43)+numeros.get(44))+")");
        //BOTON EDICTOS (800)
        Button mBtnEdictos = (Button) findViewById(R.id.mc_edic);
        mBtnEdictos.setText("Edictos (" + numeros.get(45) + ")");
        //BOTON TODOS ()
        Button mBtnTodo = (Button) findViewById(R.id.mc_todo);
        mBtnTodo.setText("Ver Todos (" + (numeros.get(0)+numeros.get(14)+numeros.get(15)+numeros.get(16)+numeros.get(17)+numeros.get(18)+numeros.get(19)+numeros.get(22)+numeros.get(23)+numeros.get(24)+numeros.get(25)+numeros.get(26)+numeros.get(27)+numeros.get(28)+numeros.get(29)+numeros.get(30)+numeros.get(31)+numeros.get(32)+numeros.get(33)+numeros.get(34)+numeros.get(35)+numeros.get(36)+numeros.get(37)+numeros.get(38)+numeros.get(39)+numeros.get(40)+numeros.get(41)+numeros.get(42)+numeros.get(43)+numeros.get(44)+numeros.get(45))+")");
    }

    public void Automotores (View view) {
        Intent intent = new Intent(this, Auto_cla.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Automotores", Toast.LENGTH_SHORT).show();
    }
    public void Propiedades (View view) {
        Intent intent = new Intent(this, Prop_menu2.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Propiedades", Toast.LENGTH_SHORT).show();
    }
    public void Construcciones (View view) {
        Intent intent = new Intent(this, Consultar_Av.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Construcciones", Toast.LENGTH_SHORT).show();
    }
    public void Empleos (View view) {
        Intent intent = new Intent(this, Consultar_Av.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Empleos", Toast.LENGTH_SHORT).show();
    }
    public void Servicios (View view) {
        Intent intent = new Intent(this, Consultar_Av.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Servicios", Toast.LENGTH_SHORT).show();
    }
    public void Varios (View view) {
        Intent intent = new Intent(this, Consultar_Av.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Varios", Toast.LENGTH_SHORT).show();
    }
    public void Edictos (View view) {
        Intent intent = new Intent(this, Consultar_Av.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Edictos", Toast.LENGTH_SHORT).show();
    }
    public void Todos (View view) {
        Intent intent = new Intent(this, Consultar_Av.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Todos", Toast.LENGTH_SHORT).show();
    }
}
