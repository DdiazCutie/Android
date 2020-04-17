package com.isil.recycler.adapatadores;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.isil.recycler.Entidades.Alumno;
import com.isil.recycler.Entidades.AlumnoVH;
import com.isil.recycler.R;

import java.util.ArrayList;

public class AlumnoAdapter extends RecyclerView.Adapter {
    private ArrayList<Alumno> lista;

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View plantilla= LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.alumno_item,viewGroup,false);
        RecyclerView.ViewHolder vh = new AlumnoVH(plantilla);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        Alumno alumno = lista.get(i);
        AlumnoVH vh = (AlumnoVH) viewHolder;

        vh.nombre.setText(alumno.getNombre()+" "+alumno.getApellido());
        vh.notas.setText(alumno.DetalleNotas());
        vh.promedio.setText((int) alumno.Promedio());
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }
}
