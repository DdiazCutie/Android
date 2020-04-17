package com.isil.impaktofinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import com.isil.impaktofinal.Entidades.Adaptadores.ListaFuentePoderVH;
import com.isil.impaktofinal.Entidades.Adaptadores.ListaTarjetaVideoVH;
import com.isil.impaktofinal.Entidades.Producto.FuentePoder;
import com.isil.impaktofinal.Entidades.Producto.TarjetaVideo;

import java.util.ArrayList;
public class CatalogoTarjetaVideo extends AppCompatActivity {
    ArrayList<TarjetaVideo> listaTarjetaVideo;
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo_tarjeta_video);

        listaTarjetaVideo = new ArrayList<>();
        recycler = (RecyclerView)findViewById(R.id.cRecyclerViewT);
        recycler.setLayoutManager(new LinearLayoutManager(this));

        llenarTarjetaVideo();
        ListaTarjetaVideoVH adapter =  new ListaTarjetaVideoVH(listaTarjetaVideo);
        recycler.setAdapter(adapter);




    }
    private void llenarTarjetaVideo () {

        listaTarjetaVideo.add(new TarjetaVideo("INTEL CORE I7 9700KF","",R.drawable.cori79700kf));
        listaTarjetaVideo.add(new TarjetaVideo("INTEL CORE I3 9100","",R.drawable.cori39100));
        listaTarjetaVideo.add(new TarjetaVideo("INTEL CORE I5 9400","",R.drawable.cori59400));
        listaTarjetaVideo.add(new TarjetaVideo("INTEL CORE I5 9400F","",R.drawable.cori59400f));
        listaTarjetaVideo.add(new TarjetaVideo("INTEL CORE I7 9700K"," ",R.drawable.cori79700k));





    }






}