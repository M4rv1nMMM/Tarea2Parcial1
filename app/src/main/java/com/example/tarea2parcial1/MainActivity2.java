package com.example.tarea2parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView ttxtnombre2;
    private TextView ttxtapellidos2;
    private TextView ttxtedad2;
    private TextView ttxtcorreo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ttxtnombre2 = (TextView) findViewById(R.id.txtNombre2);
        ttxtapellidos2 = (TextView) findViewById(R.id.txtApellidos2);
        ttxtedad2 = (TextView) findViewById(R.id.txtEdad2);
        ttxtcorreo2 = (TextView) findViewById(R.id.txtCorreo2);

        String varname = getIntent().getStringExtra("name");
        String varname2 = getIntent().getStringExtra("name2");
        String varage = getIntent().getStringExtra("age");
        String varmail = getIntent().getStringExtra("mail");

        ttxtnombre2.setText(varname);
        ttxtapellidos2.setText(varname2);
        ttxtedad2.setText(varage);
        ttxtcorreo2.setText(varmail);
    }

    public void regresar(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}