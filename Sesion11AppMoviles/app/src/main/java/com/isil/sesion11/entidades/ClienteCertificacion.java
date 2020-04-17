package com.isil.sesion11.entidades;

public class ClienteCertificacion implements Calificable{
    private String tema;
    private String nombre, apellido;
    private long codigo;
    private double nota;

    public ClienteCertificacion(String tema, String nombre, String apellido, long codigo, double nota) {
        this.tema = tema;
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
        this.nota = nota;
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

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public double ObtenerNotaFinal() {
        return nota;
    }

    @Override
    public String ObtenerDetalleCondicion() {
        return "Certificación para "+tema+"\n"+
                "Usuario: "+nombre+" "+apellido+"\n"+
                "Puntaje: "+nota+"/100\n"+
                "Condición: "+((nota>=84)?"CERTIFICADO":"NO CERTIFICADO");
    }

    @Override
    public String toString() {
        return "ClienteCertificacion{" +
                "tema='" + tema + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", codigo=" + codigo +
                ", nota=" + nota +
                '}';
    }
}
