package com.example.tarea2parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etxtNombre;
    private EditText etxtApellidos;
    private EditText etxtEdad;
    private EditText etxtCorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etxtNombre = (EditText) findViewById(R.id.txtNombre);
        etxtApellidos = (EditText) findViewById(R.id.txtApellidos);
        etxtEdad = (EditText) findViewById(R.id.txtEdad);
        etxtCorreo = (EditText) findViewById(R.id.txtCorreo);
    }

    public void Enviar (View view){
        Intent i = new Intent(this, MainActivity2.class);
        i.putExtra("name", etxtNombre.getText().toString());
        i.putExtra("name2", etxtApellidos.getText().toString());
        i.putExtra("age", etxtEdad.getText().toString());
        i.putExtra("mail", etxtCorreo.getText().toString());
        startActivity(i);
    }
}