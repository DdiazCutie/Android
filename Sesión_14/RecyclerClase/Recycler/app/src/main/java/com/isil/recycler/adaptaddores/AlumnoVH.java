package com.isil.recycler.adaptaddores;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.isil.recycler.R;

public class AlumnoVH extends RecyclerView.ViewHolder {

    public View padre;
    public ImageView foto;
    public TextView nombre, notas, promedio, estado;

    public AlumnoVH(@NonNull View itemView) {
        super(itemView);

        padre = itemView;
        foto = padre.findViewById(R.id.imgFoto);
        nombre = padre.findViewById(R.id.tvNombre);
        notas = padre.findViewById(R.id.tvNotas);
        promedio = padre.findViewById(R.id.tvPromedio);
        estado = padre.findViewById(R.id.tvEstado);
    }
}
