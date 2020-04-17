package com.isil.impaktofinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.isil.impaktofinal.Entidades.Adaptadores.ListaAlmacenamientoVH;
import com.isil.impaktofinal.Entidades.Adaptadores.ListaCaseVH;
import com.isil.impaktofinal.Entidades.Adaptadores.ListaRamVH;
import com.isil.impaktofinal.Entidades.Producto.Case;
import com.isil.impaktofinal.Entidades.Producto.Ram;


import java.util.ArrayList;
public class CatalagoRam extends AppCompatActivity {
    ArrayList<Ram> listaRam;
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalago_ram);

        listaRam = new ArrayList<>();
        recycler = (RecyclerView)findViewById(R.id.cRecyclerViewR);
        recycler.setLayoutManager(new LinearLayoutManager(this));

        llenarRam();
        ListaRamVH adapter =  new ListaRamVH(listaRam);
        recycler.setAdapter(adapter);




    }
    private void llenarRam() {


        listaRam.add(new Ram("ADATA XPG 16GB","",R.drawable.memramadataxpg16gb));
        listaRam.add(new Ram("CRUCIAL BALLISTIX TACTICAL 16GB","",R.drawable.memramcrucialballistixtactical16gb));
        listaRam.add(new Ram("GSKILL TRIDENTZ 16GB","",R.drawable.memramgskilltridentz16gb));
        listaRam.add(new Ram("HYPER RXFURY 8GB","",R.drawable.memramhyperrxfury8gb));
        listaRam.add(new Ram("TEAM GROUP TFORCE 16GB"," ",R.drawable.memramteamgrouptforce16gb));






    }






}

