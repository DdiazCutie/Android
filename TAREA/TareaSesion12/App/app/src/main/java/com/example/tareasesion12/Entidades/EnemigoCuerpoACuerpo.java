package com.example.tareasesion12.Entidades;

public class EnemigoCuerpoACuerpo extends Enemigo {
    private Arma arma;

    public EnemigoCuerpoACuerpo(double puntosVida, double armadura, double distanciaAtaque,
                                String estado, Arma arma) {
        super(puntosVida, armadura, distanciaAtaque, estado);
        this.arma = arma;
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
        return Arma.dañoAtaque;
    }

    @Override
    public String toString() {
        return "EnemigoCuerpoACuerpo{" +
                "arma=" + arma +
                ", puntosVida=" + puntosVida +
                ", armadura=" + armadura +
                ", distanciaAtaque=" + distanciaAtaque +
                ", estado='" + estado + '\'' +
                '}';
    }
}
