package com.isil.cuentabancaria;

public class Cliente {
    //atributos
    String nombre;
    String apellido;
    int dni;
    long ruc;
    boolean esEmpresa;

    //constructor
    Cliente(String nombre, String apellido, int dni, long ruc, boolean esEmpresa){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.ruc = ruc;
        this.esEmpresa = esEmpresa;
    }

    Cliente(String nombre, String apellido, int dni){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        esEmpresa = false;
        ruc=-1;
    }

    Cliente(String nombre, long ruc){
        this.nombre = nombre;
        this.ruc = ruc;
        apellido = "--";
        esEmpresa = true;
        dni = -1;
    }

    //métodos
    String enTexto(){
        return esEmpresa?(nombre + " - " + ruc)
                :(nombre + " " + apellido + " - " + dni);
    }
}
