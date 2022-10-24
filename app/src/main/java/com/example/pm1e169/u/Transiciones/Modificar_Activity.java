package com.example.pm1e169.u.Transiciones;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pm1e169.R;

public class Modificar_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificar);
    }

    EditText text= (EditText) findViewById(R.id.txtMnombre);
    EditText text1=(EditText)findViewById(R.id.txtMtelefono);
    String dato= getIntent().getStringExtra("Resultado");
       /// tv3.setText("Resultado es: " + dato);

}