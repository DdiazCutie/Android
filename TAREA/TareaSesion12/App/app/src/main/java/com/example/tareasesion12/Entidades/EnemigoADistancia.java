package com.example.tareasesion12.Entidades;

public class EnemigoADistancia extends Enemigo {
    private double dañoProyectil;
    private double velocidadProyectil;

    public EnemigoADistancia(double puntosVida, double armadura, double distanciaAtaque,
                             String estado, double dañoProyectil, double velocidadProyectil) {
        super(puntosVida, armadura, distanciaAtaque, estado);
        this.dañoProyectil = dañoProyectil;
        this.velocidadProyectil = velocidadProyectil;
    }

    @Override
    public double RecibirDaño() {
        return super.RecibirDaño();
    }

    @Override
    public String VidaCero() {
        return super.VidaCero();
    }

    @Override
    public double TakeDamage() {
        return dañoProyectil;
    }

    @Override
    public String toString() {
        return "EnemigoADistancia{" +
                "dañoProyectil=" + dañoProyectil +
                ", velocidadProyectil=" + velocidadProyectil +
                ", puntosVida=" + puntosVida +
                ", armadura=" + armadura +
                ", distanciaAtaque=" + distanciaAtaque +
                ", estado='" + estado + '\'' +
                '}';
    }
}
