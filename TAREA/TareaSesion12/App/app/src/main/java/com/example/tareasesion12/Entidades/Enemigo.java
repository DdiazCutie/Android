package com.example.tareasesion12.Entidades;

import com.example.tareasesion12.Interfaces.Damageable;

public abstract class Enemigo implements Damageable {
    protected double puntosVida;
    protected double armadura;
    protected double distanciaAtaque;
    protected String estado;

    public Enemigo(double puntosVida, double armadura, double distanciaAtaque, String estado) {
        this.puntosVida = puntosVida;
        this.armadura = armadura;
        this.distanciaAtaque = distanciaAtaque;
        this.estado = estado;
    }

    @Override
    public double RecibirDaño() {
        return 0;
    }

    @Override
    public String VidaCero() {
        return ((puntosVida <= 0)?"MUERTO":"VIVO");
    }

    @Override
    public double TakeDamage() {
        return 0;
    }

    @Override
    public String toString() {
        return "Enemigo{" +
                "puntosVida=" + puntosVida +
                ", armadura=" + armadura +
                ", distanciaAtaque=" + distanciaAtaque +
                ", estado='" + estado + '\'' +
                '}';
    }
}

