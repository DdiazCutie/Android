package com.isil.cuentabancaria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Cliente cliente1, cliente2, cliente3;
    CuentaBancaria cuenta1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cliente1 = new Cliente("Juan", "Ramos", 48577896);
        cliente2 = new Cliente("Ricardo", "Milonot", 70255859);
        cliente3 = new Cliente("Marina Caps", Long.parseLong("20614589685"));
    }
    cliente1.Depositar(500.cliente2);
}
