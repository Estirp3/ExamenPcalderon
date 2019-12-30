package com.example.examen_patriciocalderon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Spinner spn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spn1 = (Spinner) findViewById(R.id.spinner2);
        String [] opciones = {"Administrador","usaurio"};
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, opciones);
        spn1.setAdapter(adapter);
    }

    public void ingresar(View v){
        String Seleccion = spn1.getSelectedItem().toString();
        if(Seleccion.equals("Administrador")){
            Intent ingresar = new Intent(this, ADMIN_ACT.class);
            startActivity(ingresar);
        }else{
            Toast.makeText(this, "No seleccionaste la opcion valida", Toast.LENGTH_SHORT).show();
        }
    }

}
