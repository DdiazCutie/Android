package com.isil.impaktofinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import com.isil.impaktofinal.Entidades.Adaptadores.ListaCatalogoVH;
import com.isil.impaktofinal.Entidades.Adaptadores.ListaPlacaMadreVH;
import com.isil.impaktofinal.Entidades.Categorias;
import com.isil.impaktofinal.Entidades.Producto.PlacaMadre;

import java.util.ArrayList;

public class CatalagoPlacaMadre extends AppCompatActivity {
    ArrayList<PlacaMadre> listaPlacaMadre;
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalago_placa_madre);

        listaPlacaMadre = new ArrayList<>();
        recycler = (RecyclerView)findViewById(R.id.cRecyclerViewP);
        recycler.setLayoutManager(new LinearLayoutManager(this));

        llenarPlacaMadre();
        ListaPlacaMadreVH adapter =  new ListaPlacaMadreVH(listaPlacaMadre);
        recycler.setAdapter(adapter);



    }


    private void llenarPlacaMadre () {

        listaPlacaMadre.add(new PlacaMadre("ASROCK Z390 PHANTOM GAMING 9","",R.drawable.mbasrockz390phantomgaming9));
        listaPlacaMadre.add(new PlacaMadre("ASROCK Z390 STEEL LEGEN","",R.drawable.mbasrockz390steellegen));
        listaPlacaMadre.add(new PlacaMadre("ASUS PRIME X299 DELUXE II","",R.drawable.mbasusprimex299deluxeii));
        listaPlacaMadre.add(new PlacaMadre("GIGABYTE Z390 AORUS ELITE","",R.drawable.mbgigabytez390aoruselite));
        listaPlacaMadre.add(new PlacaMadre("GIGABYTE Z390 AORUS PRO WIFI"," ",R.drawable.mbgigabytez390aorusprowifi));




    }



}
