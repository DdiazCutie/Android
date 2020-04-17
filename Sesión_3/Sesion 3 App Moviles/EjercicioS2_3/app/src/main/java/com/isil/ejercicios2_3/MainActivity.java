package com.isil.ejercicios2_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText cajaHora, cajaTarifa;
    TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cajaHora = findViewById(R.id.etHoras);
        cajaTarifa = findViewById(R.id.etTarifa);
        textoResultado = findViewById(R.id.tvResultado);
    }

    public void Calcular(View v){
        double nHoras = Double.parseDouble(cajaHora.getText().toString());
        double tarifa = Double.parseDouble(cajaTarifa.getText().toString());

        double sueldo_basico = nHoras*tarifa;
        double bono = sueldo_basico*35.0/100.0;

        double sueldo_bruto = sueldo_basico + bono;
        double descuento = sueldo_bruto*12.0/100.0;

        double sueldo_neto = sueldo_bruto - descuento;

        String mensaje = "DETALLE DE PAGO"+"\n"+
                "*****************" + "\n"+
                "Sueldo Básico: S/."+sueldo_basico+"\n"+
                "Bonificación: + S/."+bono + "\n"+
                "-----------------------"+"\n"+
                "Sueldo Bruto: S/." + sueldo_bruto + "\n"+
                "Descuento: - S/."+descuento+"\n"+
                "-----------------------"+"\n"+
                "Total a Pagar S/."+sueldo_neto;
        
        textoResultado.setText(mensaje);
    }
}
