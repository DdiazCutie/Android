package com.isil.ejemploclases;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Alumno alumno1, alumno2;
    Celular celular1, celular2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alumno1 = new Alumno();
        alumno2 = new Alumno();

        alumno1.nombre = "Cesar";
        alumno1.apellido = "Pereda";
        alumno1.codigo = 101;

        alumno2.nombre = "David";
        alumno2.apellido = "Diaz";
        alumno2.codigo = 102;

        celular1 = new Celular();
        celular1.marca = "Apple";
        celular1.modelo = "6S";
        celular1.colorCel = "Space Grey";
        celular1.numero = 987654321;
        celular1.dueno = alumno1;

        celular2 = new Celular();
        celular2.dueno = alumno2;
        celular2.marca = "Sony";
        celular2.modelo = "Xperia";
        celular2.colorCel = "Negro";
        celular2.numero = 985456753;

        //Muestre mediante un toast el apellido del dueño
        //del celular1 utilizando
        //la propiedad dueno.
        String msg = celular1.dueno.apellido;

    }
}
