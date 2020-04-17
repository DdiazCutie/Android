package com.isil.impaktofinal.Entidades.Producto;

public class Almacenamiento  {
    private String tipo;         //HDD o SDD
    private String capacidad;    //1TB 500GB
    private int memoriaCacheMB;  //32
    private String frecuencia;   //7200 RPM
    private int foto;
    private double precio;
    private int stock;
    private static double igv=0.18;


    public Almacenamiento(String tipo, String capacidad, int memoriaCacheMB, String frecuencia, double precio, int stock) {
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.memoriaCacheMB = memoriaCacheMB;
        this.frecuencia = frecuencia;
        this.precio = precio;
        this.stock = stock;
    }

    public Almacenamiento(String tipo, String capacidad, int memoriaCacheMB, String frecuencia, int foto) {
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.memoriaCacheMB = memoriaCacheMB;
        this.frecuencia = frecuencia;
        this.foto = foto;
    }

    public Almacenamiento(String tipo, String capacidad, int foto) {
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.foto = foto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public int getMemoriaCacheMB() {
        return memoriaCacheMB;
    }

    public void setMemoriaCacheMB(int memoriaCacheMB) {
        this.memoriaCacheMB = memoriaCacheMB;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }



    @Override
    public String toString() {
        return  toString()+"\n"+
                "-----------"+
                "\nTipo: "+ tipo +
                "\nCapacidad: "+ capacidad +
                "\nMemoria Cáche MB: "+ memoriaCacheMB +
                "\nFrecuencia: "+ frecuencia;
    }


}
