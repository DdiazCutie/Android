package com.isil.impaktofinal.Entidades.Adaptadores;


import android.os.Bundle;
import com.isil.impaktofinal.Entidades.Producto.Almacenamiento;
import com.isil.impaktofinal.Entidades.Producto.Case;
import com.isil.impaktofinal.R;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;



import java.util.ArrayList;



public class ListaCaseVH extends RecyclerView.Adapter<ListaCaseVH.ViewHolderCase> implements View.OnClickListener {
    ArrayList<Case> ListCase;

    public ListaCaseVH(ArrayList<Case> listCase) {
        this.ListCase = listCase;
    }

    @NonNull
    @Override
    public ViewHolderCase onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_lista_case,null,false);
        return  new ViewHolderCase(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderCase holder, int position) {
        holder.etiNombre.setText(ListCase.get(position).getDimension());
        holder.etiInformaciom.setText(ListCase.get(position).getMateriales());
        holder.foto.setImageResource(ListCase.get(position).getFoto());



    }

    @Override
    public int getItemCount() {
        return ListCase.size();
    }

    @Override
    public void onClick(View v) {

    }

    public class ViewHolderCase extends RecyclerView.ViewHolder {

        TextView etiNombre,etiInformaciom;
        ImageView foto;


        public ViewHolderCase(@NonNull View itemView) {
            super(itemView);

            etiNombre= (TextView) itemView.findViewById(R.id.idNombreC);
            etiInformaciom = (TextView) itemView.findViewById(R.id.idInfoC);
            foto = (ImageView) itemView.findViewById(R.id.idImagenC);




        }


    }
}
