package com.example.tareasesion12.Entidades;

import com.example.tareasesion12.Interfaces.Damageable;

public class Jugador implements Damageable {
    private double puntosVida;
    private double armadura;
    private double distanciaAtaque;
    private double daño;
    private String estado;
    private double dañoHecho;
    private double dañoRecibido;

    public Jugador(double puntosVida, double armadura, double distanciaAtaque, double daño, String estado) {
        this.puntosVida = puntosVida;
        this.armadura = armadura;
        this.distanciaAtaque = distanciaAtaque;
        this.daño = daño;
        this.estado = estado;
    }

    @Override
    public double RecibirDaño() {
        return 0  ;
    }

    @Override
    public String VidaCero() {
        return ((puntosVida <= 0)?"MUERTO":"VIVO");
    }

    @Override
    public double TakeDamage() {
        return daño;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "puntosVida=" + puntosVida +
                ", armadura=" + armadura +
                ", distanciaAtaque=" + distanciaAtaque +
                ", daño=" + daño +
                ", estado='" + estado + '\'' +
                '}';
    }
}
