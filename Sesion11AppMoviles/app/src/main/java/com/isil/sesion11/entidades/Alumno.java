package com.isil.sesion11.entidades;

public abstract class Alumno implements Calificable{
    protected long codigo;
    protected String nombre, apellido;

    public Alumno(long codigo, String nombre, String apellido) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public abstract double CalcularPromedio();

    @Override
    public String toString() {
        return  "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\''+
                ", Prom. Final: "+CalcularPromedio();
    }

    @Override
    public double ObtenerNotaFinal() {
        return CalcularPromedio();
    }
}
