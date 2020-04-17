package com.isil.impaktofinal.Entidades.Adaptadores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.isil.impaktofinal.Entidades.Producto.FuentePoder;
import com.isil.impaktofinal.Entidades.Producto.PlacaMadre;
import com.isil.impaktofinal.R;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;



import java.util.ArrayList;



public class ListaPlacaMadreVH extends RecyclerView.Adapter<ListaPlacaMadreVH.ViewHolderPlacaMadre> implements View.OnClickListener {
    ArrayList<PlacaMadre> ListPlacaMadre;

    public ListaPlacaMadreVH(ArrayList<PlacaMadre> listPlacaMadre) {
        this.ListPlacaMadre = listPlacaMadre;
    }

    @NonNull
    @Override
    public ViewHolderPlacaMadre onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_lista_placamadre,null,false);
        return  new ViewHolderPlacaMadre(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderPlacaMadre holder, int position) {
        holder.etiNombre.setText(ListPlacaMadre.get(position).getSocketCPU());
        holder.etiInformaciom.setText(ListPlacaMadre.get(position).getChipset());
        holder.foto.setImageResource(ListPlacaMadre.get(position).getFoto());



    }

    @Override
    public int getItemCount() {
        return ListPlacaMadre.size();
    }

    @Override
    public void onClick(View v) {

    }

    public class ViewHolderPlacaMadre extends RecyclerView.ViewHolder {

        TextView etiNombre,etiInformaciom;
        ImageView foto;


        public ViewHolderPlacaMadre(@NonNull View itemView) {
            super(itemView);

            etiNombre= (TextView) itemView.findViewById(R.id.idNombreP);
            etiInformaciom = (TextView) itemView.findViewById(R.id.idInfoP);
            foto = (ImageView) itemView.findViewById(R.id.idImagenP);




        }


    }
}
