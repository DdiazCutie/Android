package com.isil.impaktoisil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

       // Producto r1, p2, pm1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Usuario Usuario[] = new Usuario[10];

        //ADMINISTRADOR:
        Usuario[0] = new Administrador (101,"Ramon", "Ramirez Carreon", "rcarreon@impaktoperu.com","Av. Surco 110",
                "Surco","Lima","M",12131415,12457885621L, 987556524);
        //USUARIO:
        Usuario[1] = new Cliente (10001,"Rodolfo","Perez","perez43@gmail.com","Av.Aviacion 245", "Surquillo",
                "Lima","M",45892312,987054544);
        Usuario[2] = new Cliente (10002,"Amancia","Oterga","otergaa@gmail.com","Calle Los Pinos 901","San Borja",
                "Lima","F",65876594,965541587);

        //PRODUCTOS:
        Producto p1= new Producto("Vengamce RGB PRO","Corsair","C16","RAM",
                1001,500, "-");
        Producto p2= new Producto("core i9","intel","7900x","Procesador",
                1101,5000,"-" );
        Producto p3= new Producto("ROG STRIX","Asus","Z370 E GAMING","Placa madre",1201,
                2000,"-");
        Producto p4= new Producto("GeForce RTX","AOURUS","2080 Ti","Tarjeta Video",1301,
                4500,"-");
        Producto p5= new Producto("Extreme SSD","Sandisk","Extreme 900","Memoria",1401,
                3800,"-");
        Producto p6= new Producto("MX Vertical","logitech","Vertical","Componente Externo",
                1501,800,"-");
        //R1, P1, PM1, T1, M1, CX1

        //TIENDA
        Tienda t1= new Tienda("Benavides","Av.Benavides 455","9:00 - 20:00",12345,30);
        Tienda t2= new Tienda("Aviacion", "Av.Aviacion", "08:00 - 18:00",12346,25);


    }





}

