package com.isil.impaktofinal.Entidades.Producto;

public class Procesador  {
    private String nombre;
    private double frecuenciaGhz;
    private String descripcion;
    private int nucleos;
    private double cacheMb;
    private String socket;
    private int foto;
    private double precio;
    private int stock;
    private static double igv=0.18;

    public Procesador(String nombre, double frecuenciaGhz, String descripcion, int nucleos, double cacheMb, String socket, double precio, int stock) {
        this.nombre = nombre;
        this.frecuenciaGhz = frecuenciaGhz;
        this.descripcion = descripcion;
        this.nucleos = nucleos;
        this.cacheMb = cacheMb;
        this.socket = socket;
        this.precio = precio;
        this.stock = stock;
    }

    public Procesador(double frecuenciaGhz, String descripcion, int nucleos, double cacheMb, String socket, int foto) {
        this.frecuenciaGhz = frecuenciaGhz;
        this.descripcion = descripcion;
        this.nucleos = nucleos;
        this.cacheMb = cacheMb;
        this.socket = socket;
        this.foto = foto;
    }


    public Procesador(String nombre, double frecuenciaGhz, String descripcion, int nucleos, double cacheMb, String socket, int foto) {
        this.nombre = nombre;
        this.frecuenciaGhz = frecuenciaGhz;
        this.descripcion = descripcion;
        this.nucleos = nucleos;
        this.cacheMb = cacheMb;
        this.socket = socket;
        this.foto = foto;
    }

    public Procesador(String nombre, String descripcion, int foto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.foto = foto;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getFrecuenciaGhz() {
        return frecuenciaGhz;
    }

    public void setFrecuenciaGhz(double frecuenciaGhz) {
        this.frecuenciaGhz = frecuenciaGhz;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public double getCacheMb() {
        return cacheMb;
    }

    public void setCacheMb(double cacheMb) {
        this.cacheMb = cacheMb;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
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
        Procesador.igv = igv;
    }

    @Override
    public String toString(){
        return super.toString() +
               "------------"+
               "\nFrecuencia GHz: "+frecuenciaGhz+
               "\nNº Núcleos: "+nucleos+
               "\nMemoria Caché MB:"+ cacheMb+
               "\nSocket: "+ socket;
    }
}
