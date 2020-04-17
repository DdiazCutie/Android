package com.isil.impaktofinal.Entidades.Usuario;

public class Cliente extends Usuario {

    private String codCli;

    public Cliente(String nombre, String apellido, String direccion, String distrito,
                   char sexo, String celular, long dni, String codCli) {
        super(nombre, apellido, direccion, distrito, sexo, celular, dni);
        this.codCli = codCli;
    }

    @Override
    public String toString(){
        return  "Codigó Cliente: "+ codCli + "\n"+
                "***********\n"+
                super.toString();
    }
}
