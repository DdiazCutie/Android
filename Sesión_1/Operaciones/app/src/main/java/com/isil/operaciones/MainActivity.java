package com.isil.operaciones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int n1=0;
    int n2=0;
    int s=0;
    int r=0;
    int m=0;
    double d=0;

    EditText caja1;
    EditText caja2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caja1 = findViewById(R.id.editText3);
        caja2 = findViewById(R.id.editText4);
    }
    public void  Sumar(View v){
        //Obtenemos el valor de la caja de texto como String
        String txt1 = caja1.getText().toString();
        String txt2 = caja2.getText().toString();
        //Convertimos los valores del String a Int
        n1= Integer.parseInt(txt1);
        n2= Integer.parseInt(txt2);

        //Calculamos la suma
        s= n1+n2;

        Toast.makeText(this, "Suma: "+s, Toast.LENGTH_SHORT).show();
    }

    public void  Resta(View v){
        //Obtenemos el valor de la caja de texto como String
        String txt1 = caja1.getText().toString();
        String txt2 = caja2.getText().toString();
        //Convertimos los valores del String a Int
        n1= Integer.parseInt(txt1);
        n2= Integer.parseInt(txt2);

        //Calculamos la resta
        r= n1-n2;

        Toast.makeText(this, "Resta: "+r, Toast.LENGTH_SHORT).show();
    }
    public void  Multiplicacion(View v){
        //Obtenemos el valor de la caja de texto como String
        String txt1 = caja1.getText().toString();
        String txt2 = caja2.getText().toString();
        //Convertimos los valores del String a Int
        n1= Integer.parseInt(txt1);
        n2= Integer.parseInt(txt2);

        //Calculamos la multiplicación
        m= n1*n2;

        Toast.makeText(this, "Multiplicación: "+m, Toast.LENGTH_SHORT).show();
    }
    public void  Division(View v){
        //Obtenemos el valor de la caja de texto como String
        String txt1 = caja1.getText().toString();
        String txt2 = caja2.getText().toString();
        //Convertimos los valores del String a Int
        double x1,x2;

        x1= Double.parseDouble(txt1);
        x2= Double.parseDouble(txt2);

        //Calculamos la multiplicación
        d= x1/x2;

        Toast.makeText(this, "División: "+d, Toast.LENGTH_SHORT).show();
    }
}
