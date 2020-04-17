package com.isil.impaktofinal.Entidades.Usuario;

public abstract class Usuario {
    protected String nombre, apellido, direccion,
                     distrito,  celular;
    protected char sexo;
    protected long dni;


    public Usuario(String nombre, String apellido, String direccion,
                   String distrito, char sexo, String celular, long dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.distrito = distrito;
        this.sexo = sexo;
        this.celular = celular;
        this.dni = dni;


    }

    @Override
    public String toString() {
        return "Usuario" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", distrito='" + distrito + '\'' +
                ", celular='" + celular + '\'' +
                ", sexo=" + sexo +
                ", dni=" + dni +
                '}';
    }
}
