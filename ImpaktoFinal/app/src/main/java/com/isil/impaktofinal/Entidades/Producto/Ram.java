package com.isil.impaktofinal.Entidades.Producto;

public class Ram  {
    private String tipoMemoria;
    private String tamañoMemoria;
    private int frecuenciaMHz;
    private double precio;
    private int stock;
    private int foto ;
    private static double igv=0.18;


    public Ram(String tipoMemoria, String tamañoMemoria, int frecuenciaMHz, double precio, int stock) {
        this.tipoMemoria = tipoMemoria;
        this.tamañoMemoria = tamañoMemoria;
        this.frecuenciaMHz = frecuenciaMHz;
        this.precio = precio;
        this.stock = stock;

    }

    public Ram(String tipoMemoria, String tamañoMemoria, int foto) {
        this.tipoMemoria = tipoMemoria;
        this.tamañoMemoria = tamañoMemoria;
        this.foto = foto;
    }

    public String getTipoMemoria() {
        return tipoMemoria;
    }

    public void setTipoMemoria(String tipoMemoria) {
        this.tipoMemoria = tipoMemoria;
    }

    public String getTamañoMemoria() {
        return tamañoMemoria;
    }

    public void setTamañoMemoria(String tamañoMemoria) {
        this.tamañoMemoria = tamañoMemoria;
    }

    public int getFrecuenciaMHz() {
        return frecuenciaMHz;
    }

    public void setFrecuenciaMHz(int frecuenciaMHz) {
        this.frecuenciaMHz = frecuenciaMHz;
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

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public static double getIgv() {
        return igv;
    }

    public static void setIgv(double igv) {
        Ram.igv = igv;
    }

    @Override
    public String toString(){
        return super.toString() +
                "------------"+
                "\nTipo de Memoria: "+ tipoMemoria +
                "\nTamaño de Memoria GB: "+tamañoMemoria+
                "\nFrecuencia MHz: "+ frecuenciaMHz;
    }
}
