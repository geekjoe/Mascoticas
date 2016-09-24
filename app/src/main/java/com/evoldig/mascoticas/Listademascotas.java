package com.evoldig.mascoticas;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;


public class Listademascotas extends AppCompatActivity {

    ArrayList <Mascotas> mascotas;
    private RecyclerView listaMascotas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listademascotas);

        //Llamando el objeto de Action Bar
        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);




        //Lllamando mi floatingActionButton

        agregarFAB();


        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascota();
        inicializarAdaptador();



       // mascotas.add (new Mascotas(android.R.drawable.collie,"Lazy"));






      /*  ArrayList<String> nombresMascota = new ArrayList<>();
        for (Mascotas mascota : mascotas) {
            nombresMascota.add(mascota.getNombre());

        } */


    }

    public AdaptadorMascota adaptador;

    public void inicializarAdaptador () {

        adaptador = new AdaptadorMascota(mascotas, this);
       // AdaptadorMascota adaptador = new AdaptadorMascota(mascotas);
        listaMascotas.setAdapter(adaptador);


    }

    public void inicializarListaMascota () {

        mascotas = new ArrayList<Mascotas>();

        //  ArrayList<String> mascotas;
        mascotas.add(new Mascotas("Lazy",R.drawable.collie,"1"));
        mascotas.add(new Mascotas("Chapy",R.drawable.chapy,"1"));
        mascotas.add(new Mascotas("Chester",R.drawable.chester,"1"));
        mascotas.add(new Mascotas("Loly",R.drawable.loly,"1"));
        mascotas.add(new Mascotas("Tommy",R.drawable.tommy,"1"));


    }

    public void agregarFAB () {

        FloatingActionButton miFAB = (FloatingActionButton) findViewById(R.id.fabMiFAB);
        miFAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar.make(view, "Se presiono el FAB", Snackbar.LENGTH_SHORT)
                        .setAction("Action", null).show();

            }
        });
    }

    public void irSegundaActividad (View view) {

        Intent intent = new Intent(this, DetalleMascota.class);
        startActivity(intent);
    }



}
