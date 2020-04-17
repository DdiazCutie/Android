package com.example.tareasesion12.Entidades;

public class Arma {
    protected double dañoAtaque;

    public Arma(double dañoAtaque) {
        this.dañoAtaque = dañoAtaque;
    }

    @Override
    public String toString() {
        return "Arma{" +
                "dañoAtaque=" + dañoAtaque +
                '}';
    }
}
