package com.example.examen_patriciocalderon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class CALC_PROD_ACT extends AppCompatActivity {

    EditText et1,et2;
    TextView tv1;
    Spinner spn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc__prod__act);
        et1=(EditText)findViewById(R.id.txt_precio);
        et2=(EditText)findViewById(R.id.txt_cantidad);
        tv1=(TextView)findViewById(R.id.txt_result);
        spn1=(Spinner)findViewById(R.id.spinner);

        String [] opciones = {"Notebook HP","Impresora HP","Desktop HP"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, opciones);
        spn1.setAdapter(adapter);
    }

    public void calcular(View v){
        String selector = spn1.getSelectedItem().toString();
        if(selector.equals("Notebook HP")){
            String valor1 = et1.getText().toString();
            String valor = et2.getText().toString();
            int num = Integer.parseInt(valor1);
            int num1 = Integer.parseInt(valor);
            int valorHp= 480000;
            int resultado = (num+valorHp)*num1;
            String Final = String.valueOf(resultado);
            tv1.setText("Valor producto final : $" + Final +"\n \"Valor Original : $"+valorHp  );
        }else if(selector.equals("Impresora HP")){
            String valor1 = et1.getText().toString();
            String valor = et2.getText().toString();
            int num = Integer.parseInt(valor1);
            int num1 = Integer.parseInt(valor);
            int valorHp= 120000;
            int resultado = (num+valorHp)*num1;
            String Final = String.valueOf(resultado);
            tv1.setText("Valor producto final : $" + Final +"\n \"Valor Original : $"+valorHp  );


        }else if(selector.equals("Desktop HP")){
            String valor1 = et1.getText().toString();
            String valor = et2.getText().toString();
            int num = Integer.parseInt(valor1);
            int num1 = Integer.parseInt(valor);
            int valorHp= 620000;
            int resultado = (num+valorHp)*num1;
            String Final = String.valueOf(resultado);
            tv1.setText("Valor producto final : $" + Final +"\n \"Valor Original : $"+valorHp  );

        }
    }
}
