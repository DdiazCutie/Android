package com.example.tareasesion5;

public class Factura {
    //ATRIBUTOS
    String fecha;
    double importe_compra, importe_total;
    int nroFactura;
    static double igv = 1.18;
    Vendedor vendedor;
    Empresa empresa;
    Cliente cliente;

    //CONSTRUCTOR

    public Factura(String fecha, double importe_compra, double importe_total,int nroFactura, Vendedor vendedor, Empresa empresa, Cliente cliente) {
        this.fecha = fecha;
        this.importe_compra = importe_compra;
        this.importe_total = importe_total;
        this.nroFactura = nroFactura;
        this.vendedor = vendedor;
        this.empresa = empresa;
        this.cliente = cliente;
    }

    //METODO
    //GENERAR FACTURA

    String mensaje_historial;
    public void  generarFactura(String fecha, int nroFactura, double importe_compra, double importe_total,
                                Vendedor vendedor, Empresa empresa, Cliente cliente) {
        if (importe_compra <= 0 || importe_total <= 0) {
             mensaje_historial = "El importe es erronéo, por favor vuelve a ingresar valores";
        } else {
             importe_total = importe_compra*igv;
             mensaje_historial= "Nro de Factura"+ nroFactura+"\n"+
                                "Importe de compra"+ importe_compra+ "\n"+
                                "Importe total de factura"+importe_total+"\n";
        }

    }

    public void Historial(){

    }
}

