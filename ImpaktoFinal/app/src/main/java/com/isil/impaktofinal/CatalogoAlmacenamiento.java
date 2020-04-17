package com.isil.impaktofinal;
import com.isil.impaktofinal.Entidades.Categorias;
import com.isil.impaktofinal.Entidades.Producto.Almacenamiento;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.isil.impaktofinal.Entidades.Adaptadores.ListaAlmacenamientoVH;


import java.util.ArrayList;
public class CatalogoAlmacenamiento extends AppCompatActivity {
    ArrayList<Almacenamiento> listaAlmacenamiento;
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almacenamiento);

        listaAlmacenamiento = new ArrayList<>();
        recycler = (RecyclerView)findViewById(R.id.cRecyclerViewA);
        recycler.setLayoutManager(new LinearLayoutManager(this));

        llenarAlmacenamiento();
        ListaAlmacenamientoVH adapter =  new ListaAlmacenamientoVH(listaAlmacenamiento);
        recycler.setAdapter(adapter);




    }
    private void llenarAlmacenamiento () {



        listaAlmacenamiento.add(new Almacenamiento("HDD SEAGATE 2TB","S/235.37",R.drawable.discoduro));
        listaAlmacenamiento.add(new Almacenamiento("HDD WESTER DIGITAL 2TB ","S/228.74",R.drawable.discolaptop));
        listaAlmacenamiento.add(new Almacenamiento("HDD SEAGATE 4TB","S/.394.49",R.drawable.discopc));
        listaAlmacenamiento.add(new Almacenamiento("HDD SEAGATE 3TB","S/.321.56",R.drawable.discovigilancia));
        listaAlmacenamiento.add(new Almacenamiento("HDD TOSHIBA 2TB","S/.218.79.",R.drawable.ssd));



    }






}
