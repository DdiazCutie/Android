package com.isil.impaktofinal.Entidades;

import com.isil.impaktofinal.Entidades.Producto.Producto;
import com.isil.impaktofinal.Entidades.Usuario.Cliente;

public class Venta {
    private String num_Boleta;
    private String Fecha;
    private String metodoPago;
    private String cod_Cli;
    private String cod_Tienda;


    public Venta(String num_Boleta, String fecha, String metodoPago, String cod_Cli,
                 String cod_Tienda) {
        this.num_Boleta = num_Boleta;
        this.Fecha = fecha;
        this.metodoPago = metodoPago;
        this.cod_Cli = cod_Cli;
        this.cod_Tienda = cod_Tienda;
    }
}
