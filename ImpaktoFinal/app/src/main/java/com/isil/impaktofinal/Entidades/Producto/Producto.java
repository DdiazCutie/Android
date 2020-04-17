package com.isil.impaktofinal.Entidades.Producto;

import android.support.annotation.IntegerRes;

import java.util.Objects;

public class Producto {
    protected String codigoProd, nombreModelo, fabricante, categoria,
              garantia;
    protected double precio ;
    protected int stock;
    private static double igv = 0.18;

    public Producto(String codigoProd, String nombreModelo, String fabricante, String categoria, String garantia, double precio, int stock) {
        this.codigoProd = codigoProd;
        this.nombreModelo = nombreModelo;
        this.fabricante = fabricante;
        this.categoria = categoria;
        this.garantia = garantia;
        this.precio = precio;
        this.stock = stock;
    }

    public int getStock() { return stock; }

    public double getPrecio() {
        return precio;
    }

    protected double CalcularPrecio(){
        precio = CalcularPrecio();
        precio += precio*(1-igv);
        return precio ;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producto)) return false;
        Producto producto = (Producto) o;
        return Double.compare(producto.getPrecio(), getPrecio()) == 0 &&
                getStock() == producto.getStock() &&
                Objects.equals(codigoProd, producto.codigoProd) &&
                Objects.equals(nombreModelo, producto.nombreModelo) &&
                Objects.equals(fabricante, producto.fabricante) &&
                Objects.equals(categoria, producto.categoria) &&
                Objects.equals(garantia, producto.garantia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoProd, nombreModelo, fabricante, categoria, garantia, stock, getPrecio());
    }

    @Override
    public String toString() {
        return  "Codigó Producto: " + codigoProd + "\n" +
                "Nombre/Modelo: " + nombreModelo + "\n" +
                "Fabricante: " + fabricante + "\n" +
                "Categoria: " + categoria + "\n" +
                "Garantia: " + garantia + "\n" +
                "Stock: " + stock + "\n" +
                "Precio: " + CalcularPrecio();
    }
}
