package com.evoldig.mascoticas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class DetalleMascota extends AppCompatActivity {

    //TextView tvNombreDetalle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detalle_mascota);


        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);






       // Bundle parametros = getIntent().getExtras();
      //  String nombre = parametros.getString("Nombre");

     //   tvNombreDetalle = (TextView) findViewById(R.id.tvNombreDetalle);

     //   tvNombreDetalle.setText (nombre);


    }
}
