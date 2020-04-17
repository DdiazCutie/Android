package com.example.tareasesion12.Entidades;

import com.example.tareasesion12.Interfaces.Damageable;

public class Cofre implements Damageable {
    private String tipoCofre;
    private double puntosVida;
    private String estado;

    public Cofre(String tipoCofre, double puntosVida, String estado) {
        this.tipoCofre = tipoCofre;
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
        return ((puntosVida <= 0)?"ABIERTO":"CERRADO");
    }

    @Override
    public String toString() {
        return "Cofre{" +
                "tipoCofre='" + tipoCofre + '\'' +
                ", puntosVida=" + puntosVida +
                ", estado=" + VidaCero() +
                '}';
    }
}
