package com.isil.impaktofinal.Entidades.Producto;

public class FuentePoder {
    private String dimension;    //150x140x86mm
    private String capacidadSalida; //500W
    private int voltajeEntrada;  //230V
    private String eficienciaProcentaje; //80%
    private int foto;
    private double precio;
    private int stock;
    private static double igv=0.18;


    public FuentePoder(String dimension, String capacidadSalida, int voltajeEntrada, String eficienciaProcentaje, int foto) {
        this.dimension = dimension;
        this.capacidadSalida = capacidadSalida;
        this.voltajeEntrada = voltajeEntrada;
        this.eficienciaProcentaje = eficienciaProcentaje;
        this.foto = foto;
    }

    public FuentePoder(String dimension, String capacidadSalida, int foto) {
        this.dimension = dimension;
        this.capacidadSalida = capacidadSalida;
        this.foto = foto;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }


    public String getCapacidadSalida() {
        return capacidadSalida;
    }

    public void setCapacidadSalida(String capacidadSalida) {
        this.capacidadSalida = capacidadSalida;
    }

    public int getVoltajeEntrada() {
        return voltajeEntrada;
    }

    public void setVoltajeEntrada(int voltajeEntrada) {
        this.voltajeEntrada = voltajeEntrada;
    }

    public String getEficienciaProcentaje() {
        return eficienciaProcentaje;
    }

    public void setEficienciaProcentaje(String eficienciaProcentaje) {
        this.eficienciaProcentaje = eficienciaProcentaje;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
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

    public static double getIgv() {
        return igv;
    }

    public static void setIgv(double igv) {
        FuentePoder.igv = igv;
    }

    @Override
    public String toString() {
        return  toString()+"\n"+
                "-----------"+
                "\nDimensión: "+ dimension +
                "\nCapacidad de Salida: "+ capacidadSalida +
                "\nVoltaje de Entrada: "+ voltajeEntrada +
                "\nEficiencia: "+ eficienciaProcentaje;
    }
}
