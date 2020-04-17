package com.isil.solpc1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pregunta3();
    }

    void Pregunta3(){
        double sueldo_base = 2400;
        double comision = 0;
        double monto_vendido = 0;
        double sueldo_total = 0;
        double porc = 0;

        //ingreso de datos por teclado
        monto_vendido = 10000;


        if(monto_vendido<500) porc = 5.0/100.0;
        else if(monto_vendido>=500 && monto_vendido<1500) porc = 7.5/100.0;
        else if(monto_vendido>=1500 && monto_vendido<5000) porc = 10.0/100.0;
        else porc = 12.5/100.0;

        comision = monto_vendido*porc;

        //Peugeot 2008 100 mil soles;
        sueldo_total = sueldo_base + comision;

        String msg = "Sueldo base: S/."+sueldo_base + "\n"+
                "Monto vendido: S/."+monto_vendido+"\n"+
                "Comisión: S/."+comision + "\n"+
                "Total a pagar S/."+sueldo_total;
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

    void Pregunta2(){
        int n1 = 20;
        int n2 = 18;
        int n3 = 16;
        double promedio = (n1+n2+n3)/3.0;
        int prom = (int) Math.round(promedio);
        String msg = "";

        if(prom==17) msg = "A";
        else if(prom==18) msg = "B";
        else if(prom==19) msg = "C";
        else if(prom==20) msg = "D";
        else msg = "No hay certificado";

        /*switch (prom){
            case 17:
                msg = "A";
                break;
            case 18:
                msg = "B";
                break;
            case 19:
                msg = "C";
                break;
            case 20:
                msg = "D";
                break;
            default:
                msg = "No hay certificado";
        }*/

        Toast.makeText(this, "Resultado: "+msg, Toast.LENGTH_SHORT).show();
    }

    void Pregunta1(){
        int n1 = 5;
        int n2 = 32;
        int suma = 0;

        if(n1>0 && n2>0 && n1!=n2){
            for(int i=n1; i<=n2; i++){
                if(i%2==0 && i%7==0 && i%5!=0) suma += i;
            }
            Toast.makeText(this, "Suma: "+suma, Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Error de condiciones", Toast.LENGTH_SHORT).show();
        }
    }
}
