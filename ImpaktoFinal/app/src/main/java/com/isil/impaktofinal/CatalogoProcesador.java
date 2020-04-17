package com.isil.impaktofinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import com.isil.impaktofinal.Entidades.Adaptadores.ListaFuentePoderVH;
import com.isil.impaktofinal.Entidades.Adaptadores.ListaProcesadorVH;
import com.isil.impaktofinal.Entidades.Producto.FuentePoder;
import com.isil.impaktofinal.Entidades.Producto.Procesador;

import java.util.ArrayList;
public class CatalogoProcesador extends AppCompatActivity {
    ArrayList<Procesador> listaProcesador;
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo_procesador);

        listaProcesador = new ArrayList<>();
        recycler = (RecyclerView)findViewById(R.id.cRecyclerViewPr);
        recycler.setLayoutManager(new LinearLayoutManager(this));

        llenarProcesador();
        ListaProcesadorVH adapter =  new ListaProcesadorVH(listaProcesador);
        recycler.setAdapter(adapter);




    }
    private void llenarProcesador () {

        listaProcesador.add(new Procesador("INTEL CORE I7 9700KF","",R.drawable.cori79700kf));
        listaProcesador.add(new Procesador("INTEL CORE I3 9100","",R.drawable.cori39100));
        listaProcesador.add(new Procesador("INTEL CORE I5 9400","",R.drawable.cori59400));
        listaProcesador.add(new Procesador("INTEL CORE I5 9400F","",R.drawable.cori59400f));
        listaProcesador.add(new Procesador("INTEL CORE I7 9700K"," ",R.drawable.cori79700k));





    }






}