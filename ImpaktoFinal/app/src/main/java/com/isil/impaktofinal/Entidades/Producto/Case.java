package com.isil.impaktofinal.Entidades.Producto;

public class Case {
    private String dimension;
    private String materiales;
    private String soportePlaca;
    private int ranuraExpansion;
    private int foto;
    private double precio;
    private int stock;
    private static double igv=0.18;

    public Case(String dimension, String materiales, String soportePlaca, int ranuraExpansion, double precio, int stock) {
        this.dimension = dimension;
        this.materiales = materiales;
        this.soportePlaca = soportePlaca;
        this.ranuraExpansion = ranuraExpansion;
        this.precio = precio;
        this.stock = stock;
    }

    public Case(String dimension, String materiales, String soportePlaca, int ranuraExpansion, int foto) {
        this.dimension = dimension;
        this.materiales = materiales;
        this.soportePlaca = soportePlaca;
        this.ranuraExpansion = ranuraExpansion;
        this.foto = foto;
    }

    public Case(String dimension, String materiales, int foto) {
        this.dimension = dimension;
        this.materiales = materiales;
        this.foto = foto;

    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getMateriales() {
        return materiales;
    }

    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }

    public String getSoportePlaca() {
        return soportePlaca;
    }

    public void setSoportePlaca(String soportePlaca) {
        this.soportePlaca = soportePlaca;
    }

    public int getRanuraExpansion() {
        return ranuraExpansion;
    }

    public void setRanuraExpansion(int ranuraExpansion) {
        this.ranuraExpansion = ranuraExpansion;
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

    @Override
    public String toString(){
        return super.toString() +
                "------------"+
                "\nDimensión: "+ dimension +
                "\nMateriales: "+materiales+
                "\nSoporte de Placa: "+ soportePlaca+
                "\nRanuras de Expansión: "+ranuraExpansion;
    }
}
