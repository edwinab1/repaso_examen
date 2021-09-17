package com.example.iniciosesion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Registro_Usuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuario);

        TextView tvLoginAction = findViewById(R.id.tvLoginAction);

        EditText edtNombre = findViewById(R.id.edtName);
        EditText edtEmail = findViewById(R.id.edtEmail);
        EditText edtPassword = findViewById(R.id.edtPassword);

        Button btRegistrar = findViewById(R.id.btRegistro);
        Button btfecha = findViewById(R.id.btFecha);

        DatePicker picker = findViewById(R.id.dtFecha);


        btfecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                picker.setVisibility(View.VISIBLE);
            }
        });


        btRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Usuario usuario = new Usuario(edtNombre.getText().toString(),
                        "Flores", edtEmail.getText().toString(),
                        edtPassword.getText().toString());

                Toast.makeText(Registro_Usuario.this, usuario.toString(), Toast.LENGTH_LONG).show();
            }
        });

        tvLoginAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Registro_Usuario.this, MainActivity.class));

            }
        });
    }
}