package com.isil.ejemplorepetitivas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        tvResult = findViewById(R.id.tvResult);
    }

    public void Calcular(View v){
        int selected = radioGroup.getCheckedRadioButtonId();

        switch (selected){
            case R.id.rb1:
                Opcion1();
                break;
            case R.id.rb2:
                Opcion2();
                break;
            case R.id.rb3:
                break;
            case R.id.rb4:
                Opcion4();
                break;
            default:
                tvResult.setText("Opción Incorrecta");
        }
    }

    void Opcion1(){
        int i = 0;
        int suma = 0;
        while(i<=100){
            i=i+2;
            suma = suma + i;
        }
        tvResult.setText("Suma Pares: "+suma);
    }

    void Opcion2(){

        int suma = 0;
        /*int i = 5;
        while(i<=500){
            suma = suma + i;
            i = i+2;
        }*/
        for(int i=5; i<=500;i=i+2){
            suma = suma+i;
        }
        tvResult.setText("Suma Impares: "+suma);
    }

    void Opcion4(){
        double factorial = 1;

        for(int i=1; i<=15;i=i+1){
            factorial = factorial*i;
        }
        tvResult.setText("Factorial de 15: "+factorial);
    }
}
