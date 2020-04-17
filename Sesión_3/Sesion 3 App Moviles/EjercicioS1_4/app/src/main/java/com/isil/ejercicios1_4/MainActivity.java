package com.isil.ejercicios1_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup grupoLibros, grupoPagos;
    EditText cajaCantidad;
    TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grupoLibros = findViewById(R.id.rgTipoLibros);
        grupoPagos = findViewById(R.id.rgTipoPagos);
        cajaCantidad = findViewById(R.id.etCantidad);
        textoResultado = findViewById(R.id.tvResultado);
    }

    public void Calcular(View v){

        double precio_unitario = 0;
        String mensajeError = "";

        switch (grupoLibros.getCheckedRadioButtonId()){
            case R.id.rbA:
                precio_unitario = 40;
                break;
            case R.id.rbB:
                precio_unitario = 30;
                break;
            case R.id.rbC:
                precio_unitario = 25;
                break;
            default:
                mensajeError = "Debe escoger un tipo de libro.";
        }

        switch (grupoPagos.getCheckedRadioButtonId()){
            case R.id.rbVisa: case R.id.rbMastercard:
                if(grupoLibros.getCheckedRadioButtonId()==R.id.rbB){
                    precio_unitario = precio_unitario + precio_unitario*18.5/100.0;
                    //precio_unitario *= 1.185;
                }
                break;
            case R.id.rbCash:
                if(grupoLibros.getCheckedRadioButtonId()==R.id.rbC) {
                    precio_unitario = precio_unitario - precio_unitario*40.0/100.0;
                    //precio_unitario *= 0.6;
                }
                break;
            default:
                mensajeError = mensajeError + "\n" + "Debes escoger un tipo de pago";
        }

        if(cajaCantidad.getText().toString().isEmpty()){
            mensajeError = mensajeError + "\n" + "Debe especificar una cantidad.";
        }
        else{
            int cantidad = Integer.parseInt(cajaCantidad.getText().toString());

            if(cantidad<=0){
                mensajeError = mensajeError + "\n" + "La cantidad debe ser mayor a 0.";
            }
            else{
                double precioTotal = precio_unitario*cantidad;
                textoResultado.setText("Total a Pagar: S/."+precioTotal);
            }
        }

        if(!mensajeError.isEmpty()){
            textoResultado.setText(mensajeError);
        }
    }
}
