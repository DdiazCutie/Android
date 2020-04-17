package com.isil.impaktofinal;
import com.isil.impaktofinal.Entidades.Adaptadores.ListaFuentePoderVH;
import com.isil.impaktofinal.Entidades.Producto.FuentePoder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;




import java.util.ArrayList;
public class CatalogoFuentePoder extends AppCompatActivity {
    ArrayList<FuentePoder> listaFuentePoder;
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo_fuente_poder);

        listaFuentePoder = new ArrayList<>();
        recycler = (RecyclerView)findViewById(R.id.cRecyclerViewF);
        recycler.setLayoutManager(new LinearLayoutManager(this));

        llenarFuentePoder();
        ListaFuentePoderVH adapter =  new ListaFuentePoderVH(listaFuentePoder);
        recycler.setAdapter(adapter);




    }
    private void llenarFuentePoder () {

        listaFuentePoder.add(new FuentePoder("COOLER MASTER 750W(BRONZE)","",R.drawable.fcoolermaster750wbronze));
        listaFuentePoder.add(new FuentePoder("COOLER MASTER 750W(GOLD)","",R.drawable.fcoolermaster750wgold));
        listaFuentePoder.add(new FuentePoder("EVGA 500W(BRONZE)","",R.drawable.fevga500wbronze));
        listaFuentePoder.add(new FuentePoder("EVGA 700W(BRONZE)","",R.drawable.fevga700wbronze));
        listaFuentePoder.add(new FuentePoder("EVGA 1300W(GOLD)"," ",R.drawable.fevga1300wgold));





    }






}