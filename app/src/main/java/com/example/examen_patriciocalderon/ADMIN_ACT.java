package com.example.examen_patriciocalderon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.EmptyStackException;

public class ADMIN_ACT extends AppCompatActivity {

    EditText et1,et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin__act);
        et1 = (EditText) findViewById(R.id.txt_user);
        et2 = (EditText) findViewById(R.id.txt_pass);
    }
    public void validador(View ver){
        String user = et1.getText().toString();
        String pass = et2.getText().toString();
        String clave = "123";
        String usuario = "183593897";

        if(user.equals(usuario)  && clave.equals(pass)){
            Intent validado = new Intent(this, CALC_PROD_ACT.class);
            startActivity(validado);
        }else{
            Toast.makeText(this, "Ingresaste un valor erroneo ingresa denuevo ", Toast.LENGTH_SHORT).show();
            et1.setText("");
            et2.setText("");
        }
    }
}
