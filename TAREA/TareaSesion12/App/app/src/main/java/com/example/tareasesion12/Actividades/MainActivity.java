package com.example.tareasesion12.Actividades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.tareasesion12.Entidades.Arma;
import com.example.tareasesion12.Entidades.Cofre;
import com.example.tareasesion12.Entidades.Enemigo;
import com.example.tareasesion12.Entidades.EnemigoADistancia;
import com.example.tareasesion12.Entidades.EnemigoCuerpoACuerpo;
import com.example.tareasesion12.Entidades.Jugador;
import com.example.tareasesion12.Entidades.Muro;
import com.example.tareasesion12.Interfaces.Damageable;
import com.example.tareasesion12.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Jugador jugador = new Jugador(1800,65, 50 , 150, "");
        Arma espadaCreep = new Arma(15);
        Arma espadaMegaCreep = new Arma(35);
        EnemigoCuerpoACuerpo CreepMelee = new EnemigoCuerpoACuerpo(500,10,
                50, "",espadaCreep);
        EnemigoADistancia CreepRange = new EnemigoADistancia(200,15,
                400,"",25,1500);
        Muro muro = new Muro("Épico",8000,"");
        Cofre cofre = new Cofre("Raro", 4000,"");

        Enemigo MegaCreepMelee = new EnemigoCuerpoACuerpo(1000,20,50,"",
                espadaMegaCreep);
        Enemigo MegaCreepRange = new EnemigoADistancia(450, 25,400,"",
                50,1500);

    }

    public double HacerDano(Damageable damageable){
        return damageable.TakeDamage();
    }
}
