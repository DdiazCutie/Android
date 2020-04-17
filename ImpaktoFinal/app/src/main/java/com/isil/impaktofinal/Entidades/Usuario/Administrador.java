package com.isil.impaktofinal.Entidades.Usuario;

public class Administrador extends Usuario {

    private String codAdmin;

    public Administrador(String nombre, String apellido, String direccion, String distrito,
                         char sexo, String celular, long dni, String codAdmin) {
        super(nombre, apellido, direccion, distrito, sexo, celular, dni);
        this.codAdmin = codAdmin;
    }

    @Override
    public String toString(){
        return  "Codigó Administrador: "+ codAdmin + "\n"+
                "***********\n"+
                super.toString();
    }
}
