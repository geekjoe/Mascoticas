package com.evoldig.mascoticas;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by jazocar on 20/9/16.
 */
public class AdaptadorMascota extends RecyclerView.Adapter <AdaptadorMascota.MascotaViewHolder> {

    ArrayList <Mascotas> mascotas;
    Activity activity;



    public AdaptadorMascota (ArrayList<Mascotas> mascotas, Activity activity) {

        this.mascotas = mascotas;
        this.activity = activity;
    }

    // Inflar el layout y lo pasará al viewholder para que el obtenga los views
    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascotas,parent, false);

        return new MascotaViewHolder(v);
    }

    // Asocia cada elemento de la lista con cada view
    @Override
    public void onBindViewHolder(final MascotaViewHolder mascotaViewHolder, int position) {

        final Mascotas mascota = mascotas.get(position);
        mascotaViewHolder.imgFoto.setImageResource(mascota.getFoto());
        mascotaViewHolder.tvNombre.setText(mascota.getNombre());
        mascotaViewHolder.tvRaiting.setText(mascota.getRaiting());



       // mascotaViewHolder.tvLike.setText(mascota.getLike());



        //Generar una Acción al hacer click envia los datos.






     /*  mascotaViewHolder.imgFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity, mascota.getNombre(),Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(activity,DetalleMascota.class);
                intent.putExtra("Nombre", mascota.getNombre());
              //  intent.putExtra("Foto",mascota.getFoto());
                activity.startActivity(intent);
            }
        }); */

        //Generar acción al presionar el boton de Like

        mascotaViewHolder.btnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            String cont;



                    cont = "2";
                    mascotaViewHolder.tvRaiting.setText(cont);



               Toast.makeText(activity, "Diste Like a" + mascota.getNombre(),Toast.LENGTH_SHORT).show();



            }
        });




    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public  static class MascotaViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgFoto;
        private TextView tvNombre;
        private ImageButton btnLike;


        private TextView tvRaiting;



        public MascotaViewHolder(View itemView) {
            super(itemView);
            imgFoto = (ImageView) itemView.findViewById(R.id.imgFoto);
            tvNombre = (TextView) itemView.findViewById(R.id.tvNombre);
            btnLike = (ImageButton) itemView.findViewById(R.id.btnLike);
            tvRaiting = (TextView) itemView.findViewById(R.id.tvRaiting);


        }
    }
}
