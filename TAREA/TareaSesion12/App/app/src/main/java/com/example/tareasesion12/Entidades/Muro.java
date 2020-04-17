package com.example.tareasesion12.Entidades;

import com.example.tareasesion12.Interfaces.Damageable;

public class Muro implements Damageable {
    private String tipoMuro;
    private double puntosVida;
    private String estado;

    public Muro(String tipoMuro, double puntosVida, String estado) {
        this.tipoMuro = tipoMuro;
        this.puntosVida = puntosVida;
        this.estado = estado;
    }

    @Override
    public double TakeDamage() {
        return 0;
    }

    @Override
    public double RecibirDaño() {
        return 0;
    }

    @Override
    public String VidaCero() {
        String resultado;
        return ((puntosVida <= 0)?"DESTRUIDO":"NORMAL");
    }

    @Override
    public String toString() {
        return "Muro{" +
                "tipoMuro='" + tipoMuro + '\'' +
                ", puntosVida=" + puntosVida +
                ", estado='" + VidaCero() + '\'' +
                '}';
    }
}
