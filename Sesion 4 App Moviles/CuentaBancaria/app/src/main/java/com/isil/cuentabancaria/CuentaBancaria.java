package com.isil.cuentabancaria;

public class CuentaBancaria {
    //atributos
    long numCuenta;
    Cliente cliente;
    String tipoMoneda;
    double monto;
    String historial;

    public CuentaBancaria(long numCuenta, Cliente cliente, String tipoMoneda, double monto) {
        this.numCuenta = numCuenta;
        this.cliente = cliente;
        this.tipoMoneda = tipoMoneda;
        this.monto = monto;
    }

    //métodos
    void Depositar(int monto_deposito){
       if(monto_deposito<=0) {
           historial += "Se intentó depositar una cantidad incorrecta"+"\n";
           return;
       }

        monto += monto_deposito;
        historial += "Depósito +" +
                (tipoMoneda.equals("SOLES")?"S/.":"$") + monto_deposito+"\n";
    }

    void Retirar(int monto_retirar){
        if(monto_retirar <= 0) {
            historial+="Se intentó depositar una cantidad incorrecta"+"\n";
        }
        else if(monto_retirar > monto) {
            historial+="No hubo saldo suficiente para el retiro"+"\n";
        }else{
            monto -= monto_retirar;
            historial += "Retiro +" +
                    (tipoMoneda.equals("SOLES")?"S/.":"$") + monto_retirar+"\n";
        }
    }

    String MostrarMonto(){
        return "Cuenta n° " + numCuenta + "\n"+
                "Cliente: " + cliente.enTexto() + "\n"+
                "*************************************"+"\n"+
                "Saldo: " + monto;
    }

    String MostrarHistorial(){
        return "Cuenta n° " + numCuenta + "\n"+
                "Cliente: " + cliente.enTexto() + "\n"+
                "*************************************"+"\n"+
                historial;
    }
}
