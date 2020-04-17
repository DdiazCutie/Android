package com.isil.impaktofinal;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import com.isil.impaktofinal.R;
import com.isil.impaktofinal.Entidades.Tienda;

public class Pagina_Principal extends AppCompatActivity {
    Button catalogo,configuracion,oferta,tienda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina__principal);

        catalogo = (Button)findViewById(R.id.bcatalogo);
        oferta = (Button)findViewById(R.id.bofertea);
        configuracion = (Button)findViewById(R.id.bconfiguracion);
        tienda = (Button)findViewById(R.id.btienda);

        catalogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent catalogo = new Intent (Pagina_Principal.this,Catalogo.class);
                startActivity(catalogo);
            }
        });
        oferta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oferta = new Intent (Pagina_Principal.this,Oferta.class);
                startActivity(oferta);
            }
        });
        configuracion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent configuracion = new Intent (Pagina_Principal.this,Configuracion.class);
                startActivity(configuracion);
            }
        });
        tienda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tienda = new Intent (Pagina_Principal.this,TiendaActivity.class);
                startActivity(tienda);
            }
        });




    }
}
