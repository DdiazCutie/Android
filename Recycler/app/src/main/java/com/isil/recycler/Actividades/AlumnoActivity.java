package com.isil.recycler.Actividades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.isil.recycler.Entidades.Alumno;
import com.isil.recycler.R;

import java.util.ArrayList;

public class AlumnoActivity extends AppCompatActivity {

    RecyclerView rvAlumnos;
    ArrayList<Alumno>listaAlumnos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alumno);

        rvAlumnos = findViewById(R.id.rvAlumnos);

        LinearLayoutManager layoutManager = new LinearLayoutManager(AlumnoActivity.this);

    }
}
