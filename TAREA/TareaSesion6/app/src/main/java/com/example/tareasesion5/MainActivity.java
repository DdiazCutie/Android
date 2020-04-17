package com.example.tareasesion5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*TextView Resultado;
    EditText etFecha, etImporte, etRucCliente, etRucEmpresa, etCodigoVendedor;
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        Resultado = findViewById(R.id.tvResult);
        etFecha = findViewById(R.id.etDate);
        etImporte = findViewById(R.id.etImporte);
        etRucCliente = findViewById(R.id.etRucCliente);
        etRucEmpresa = findViewById(R.id.etRucEmpresa);
        etCodigoVendedor = findViewById(R.id.etCodigoVendedor);
        */

        Cliente c01 = new Cliente("Rodolfo Perez",1231231551);
        Cliente c02 = new Cliente("Eugenio Torres", 2034123124);
        Empresa e001 = new Empresa("Avengers", 1231232445, "Avengers S.A.");
        Empresa e002 = new Empresa("EndGame", 1233454690, "EndGame S.A.C.");

        Factura.generarFactura("12/06/2019", );

    }
}
