package com.isil.recycler.adaptaddores;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.isil.recycler.R;
import com.isil.recycler.entidades.Alumno;

import java.util.ArrayList;

public class AlumnoAdapter extends RecyclerView.Adapter {
    private ArrayList<Alumno> lista;

    public AlumnoAdapter(ArrayList<Alumno> lista) {
        this.lista = lista;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View plantilla = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.alumno_item, viewGroup, false);
        RecyclerView.ViewHolder vh = new AlumnoVH(plantilla);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        Alumno alumno = lista.get(i);
        AlumnoVH vh = (AlumnoVH) viewHolder;

        vh.nombre.setText(alumno.getNombre()+" "+alumno.getApellido());
        vh.notas.setText(alumno.DetalleNotas());
        vh.promedio.setText(alumno.Promedio()+"");
        vh.estado.setText(alumno.Estado());
        vh.foto.setImageResource(alumno.getFoto());
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }
}
