package com.isil.recycler.Entidades;

public class Alumno {
    private String nombre, apellido;
    private double nota1, nota2, nota3;
    private int foto;

    public Alumno(String nombre, String apellido, double nota1, double nota2, double nota3, int foto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.foto = foto;
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

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public double  Promedio(){
        return Math.round(nota1+nota2+nota3)/3.0;
    }

    public String Estado(){
        return Promedio()>=12.5?"Aprobado":"Desaprobado";
    }

    public String DetalleNotas(){
        return "Detalle Notas:"+"\n"+
                "Practica Calificada 1:"+nota1+"\n"+
                "Practica Calificada 2:"+nota2+"\n"+
                "Practica Calificada 3:"+nota3+"\n";
    }
}
