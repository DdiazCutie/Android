package com.isil.impaktofinal.Entidades.Producto;

public class PlacaMadre  {
    private String socketCPU;
    private String chipset;
    private String estandarMemoria;
    private int memoriaMaximaGB;
    private int foto;
    private double precio;
    private int stock;
    private static double igv=0.18;

    public PlacaMadre(String socketCPU, String chipset, String estandarMemoria, int memoriaMaximaGB, double precio, int stock) {
        this.socketCPU = socketCPU;
        this.chipset = chipset;
        this.estandarMemoria = estandarMemoria;
        this.memoriaMaximaGB = memoriaMaximaGB;
        this.precio = precio;
        this.stock = stock;
    }

    public PlacaMadre(String socketCPU, String chipset, String estandarMemoria, int memoriaMaximaGB, int foto) {
        this.socketCPU = socketCPU;
        this.chipset = chipset;
        this.estandarMemoria = estandarMemoria;
        this.memoriaMaximaGB = memoriaMaximaGB;
        this.foto = foto;

    }

    public PlacaMadre(String socketCPU, String chipset, int foto) {
        this.socketCPU = socketCPU;
        this.chipset = chipset;
        this.foto = foto;
    }


    public String getSocketCPU() {
        return socketCPU;
    }

    public void setSocketCPU(String socketCPU) {
        this.socketCPU = socketCPU;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getEstandarMemoria() {
        return estandarMemoria;
    }

    public void setEstandarMemoria(String estandarMemoria) {
        this.estandarMemoria = estandarMemoria;
    }

    public int getMemoriaMaximaGB() {
        return memoriaMaximaGB;
    }

    public void setMemoriaMaximaGB(int memoriaMaximaGB) {
        this.memoriaMaximaGB = memoriaMaximaGB;
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
        PlacaMadre.igv = igv;
    }

    @Override
    public String toString() {
        return  toString()+"\n"+
                "-----------"+
                "\nSocket CPU:"+ socketCPU +
                "\nChipset"+ chipset +
                "\nEstándar de Memoria:"+ estandarMemoria +
                "\nMemoria Máxima GB: "+ memoriaMaximaGB;
    }
}
