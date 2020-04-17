package com.isil.recycler.actividades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.isil.recycler.R;
import com.isil.recycler.adaptaddores.AlumnoAdapter;
import com.isil.recycler.entidades.Alumno;

import java.util.ArrayList;

public class AlumnosActivity extends AppCompatActivity {

    RecyclerView rvAlumnos;
    ArrayList<Alumno> listaAlumnos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alumnos);

        Alumno a1 = new Alumno("Juan", "Perez", 15,16,17, R.drawable.juan);
        Alumno a2 = new Alumno("María", "Ramos", 14,16,18, R.drawable.maria);
        Alumno a3 = new Alumno("Marco", "Arellano", 13,17,19, R.drawable.marco);

        listaAlumnos.add(a1);
        listaAlumnos.add(a2);
        listaAlumnos.add(a3);

        for(int i=0; i<1000;i++){
            listaAlumnos.add(a1);
            listaAlumnos.add(a2);
            listaAlumnos.add(a3);
        }

        rvAlumnos = findViewById(R.id.rvAlumnos);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        AlumnoAdapter alumnoAdapter = new AlumnoAdapter(listaAlumnos);

        rvAlumnos.setLayoutManager(layoutManager);
        rvAlumnos.setAdapter(alumnoAdapter);
    }
}
