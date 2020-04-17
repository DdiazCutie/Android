package com.isil.miprimeraapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Declaración de variables
    /*
    int = entero
    string = cadena
    boolean = buleano
     */
    int n1= 5;
    int n2= 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int n3= Sumar(n1,n2);
        String mensaje= "";
        String nota="";

        if(n3>5){
            mensaje="A";
        }else{
            mensaje="B";
        }

        //ejemplo de condicional anidada
        if(n3<8){
            nota = "D";
        }
        else if(n3>=8 && n3<12) {
            nota = "C";
        }
        else if(n3>=12 && n3<15){
            nota = "B";
        }
        else if(n3>=15 && n3<20){
            nota = "A";
        }
        else {
            nota = "Error";
        }
        Toast.makeText(this, "Hola Mundo Móvil: "+nota, Toast.LENGTH_LONG).show();
    }

    int Sumar(int a, int b){
        int s= a+b;
        return s;
    }
}
