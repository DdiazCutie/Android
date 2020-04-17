package com.isil.impaktofinal.Entidades;

import com.isil.impaktofinal.Entidades.Venta;

public class DetalleVenta  {
    private String cod_DetVenta;
    private int cantidad_prod;
    private String Num_Boleta;
    private String cod_Prod;

    public DetalleVenta(String cod_DetVenta, int cantidad_prod, String num_Boleta, String cod_Prod)
      {
        this.cod_DetVenta = cod_DetVenta;
        this.cantidad_prod = cantidad_prod;
        Num_Boleta = num_Boleta;
        this.cod_Prod = cod_Prod;
    }
}
