package com.isil.impaktofinal;
import com.isil.impaktofinal.Entidades.Adaptadores.ListaCatalogoVH;
import com.isil.impaktofinal.Entidades.Categorias;
import com.isil.impaktofinal.Entidades.Producto.Almacenamiento;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;


import java.util.ArrayList;

public class Catalogo extends AppCompatActivity implements ListaCatalogoVH.onNoteListener {
    ArrayList<Categorias> listaCategorias;
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiy__catalogo);

        listaCategorias = new ArrayList<>();
        recycler = (RecyclerView)findViewById(R.id.cRecyclerView);
        recycler.setLayoutManager(new LinearLayoutManager(this));

    llenarCategorias();
    ListaCatalogoVH adapter =  new ListaCatalogoVH(listaCategorias,this);
    recycler.setAdapter(adapter);



    }


   private void llenarCategorias () {



        listaCategorias.add(new Categorias("Almecinamineto","n dispositivo de almacenamiento de datos es un conjunto de componentes utilizados para leer o grabar datos en el soporte de almacenamiento de datos",R.drawable.almacenamiento));
        listaCategorias.add(new Categorias("Case","En informática, la caja, carcasa, chasis, gabinete o torre de computadora, es la estructura metálica o plástica, cuya función consiste en albergar y proteger los componentes unidad central de procesamiento (CPU)",R.drawable.case2));
        listaCategorias.add(new Categorias("Fuente Poder","es un componente del computador que se encarga de transformar una corriente eléctrica alterna en una corriente eléctrica continua transmitiendo la corriente eléctrica imprescindible y necesaria a los ordenadores",R.drawable.fuentedepoder));
        listaCategorias.add(new Categorias("Placa madre","La placa base, también conocida como tarjeta madre, placa madre o placa principal (motherboard o mainboard en inglés), es una tarjeta de circuito impreso a la que se conectan los componentes que constituyen la computadora.",R.drawable.placaamadre));
        listaCategorias.add(new Categorias("Procesador","s el hardware dentro de un ordenador u otros dispositivos programables, que interpreta las instrucciones de un programa informático ",R.drawable.procesamiento));
        listaCategorias.add(new Categorias("Ram","Dispositivo de una máquina donde se almacenan datos o instrucciones que posteriormente se pueden utilizar.",R.drawable.ram));
        listaCategorias.add(new Categorias("Tarjeta Video","Definición de tarjeta de video. Una tarjeta de vídeo, también llamada tarjeta gráfica (entre otros nombres) tiene a su cargo el procesamiento de los datos que provienen del procesador",R.drawable.tarjetavideo));


   }


    @Override
    public void onNoteClick(int position) {

        Intent almacenamiento = new Intent(this,CatalogoAlmacenamiento.class);
        startActivity(almacenamiento);



    }


    }




