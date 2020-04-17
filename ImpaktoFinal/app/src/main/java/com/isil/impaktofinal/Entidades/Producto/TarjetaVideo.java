package com.isil.impaktofinal.Entidades.Producto;

public class TarjetaVideo  {
    private String nombre,discripcion;
    private int memoriaGB;
    private int frecuenciaMemoriaMhz;
    private String socketMemoria;
    private String busTarjeta;
    private String recomendPlaca;
    private double precio;
    private int stock;
    private int foto;
    private static double igv=0.18;

    public TarjetaVideo(String nombre, String discripcion, int memoriaGB, int frecuenciaMemoriaMhz, String socketMemoria, String busTarjeta, String recomendPlaca, double precio, int stock) {
        this.nombre = nombre;
        this.discripcion = discripcion;
        this.memoriaGB = memoriaGB;
        this.frecuenciaMemoriaMhz = frecuenciaMemoriaMhz;
        this.socketMemoria = socketMemoria;
        this.busTarjeta = busTarjeta;
        this.recomendPlaca = recomendPlaca;
        this.precio = precio;
        this.stock = stock;
    }

    public TarjetaVideo(String nombre, String discripcion, int foto) {
        this.nombre = nombre;
        this.discripcion = discripcion;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDiscripcion() {
        return discripcion;
    }

    public void setDiscripcion(String discripcion) {
        this.discripcion = discripcion;
    }

    public int getMemoriaGB() {
        return memoriaGB;
    }

    public void setMemoriaGB(int memoriaGB) {
        this.memoriaGB = memoriaGB;
    }

    public int getFrecuenciaMemoriaMhz() {
        return frecuenciaMemoriaMhz;
    }

    public void setFrecuenciaMemoriaMhz(int frecuenciaMemoriaMhz) {
        this.frecuenciaMemoriaMhz = frecuenciaMemoriaMhz;
    }

    public String getSocketMemoria() {
        return socketMemoria;
    }

    public void setSocketMemoria(String socketMemoria) {
        this.socketMemoria = socketMemoria;
    }

    public String getBusTarjeta() {
        return busTarjeta;
    }

    public void setBusTarjeta(String busTarjeta) {
        this.busTarjeta = busTarjeta;
    }

    public String getRecomendPlaca() {
        return recomendPlaca;
    }

    public void setRecomendPlaca(String recomendPlaca) {
        this.recomendPlaca = recomendPlaca;
    }



    public void setPrecio(double precio) {
        this.precio = precio;
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

    @Override
    public String toString(){
        return super.toString() +
                "------------"+
                "\nMemoria GB: "+ memoriaGB +
                "\nFrecuencia MHz: "+frecuenciaMemoriaMhz+
                "\nSocket Memoria: "+socketMemoria+
                "\nBus de Tarjeta:"+ busTarjeta+
                "\nPlaca Recomendada: "+ recomendPlaca;
    }
}
