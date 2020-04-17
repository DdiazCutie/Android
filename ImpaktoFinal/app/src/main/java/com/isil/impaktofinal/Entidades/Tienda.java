package com.isil.impaktofinal.Entidades;

public class Tienda {
    private String direccion_tienda, horario_tienda, aforo_tienda,
            ultima_venta, nombre_tienda, cod_Tienda;

    public Tienda(String direccion_tienda, String horario_tienda, String aforo_tienda,
                  String ultima_venta, String nombre_tienda, String cod_Tienda) {
        this.direccion_tienda = direccion_tienda;
        this.horario_tienda = horario_tienda;
        this.aforo_tienda = aforo_tienda;
        this.ultima_venta = ultima_venta;
        this.nombre_tienda = nombre_tienda;
        this.cod_Tienda = cod_Tienda;
    }
}
