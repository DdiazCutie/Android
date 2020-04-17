package com.isil.impaktofinal.Entidades.Adaptadores;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.isil.impaktofinal.Entidades.Producto.Procesador;
import com.isil.impaktofinal.Entidades.Producto.Ram;
import com.isil.impaktofinal.R;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;



import java.util.ArrayList;



public class ListaRamVH extends RecyclerView.Adapter<ListaRamVH.ViewHolderRam> implements View.OnClickListener {
    ArrayList<Ram> ListRam;

    public ListaRamVH(ArrayList<Ram> listRam) {
        this.ListRam = listRam;
    }

    @NonNull
    @Override
    public ViewHolderRam onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_lista_ram,null,false);
        return  new ViewHolderRam(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderRam holder, int position) {
        holder.etiNombre.setText(ListRam.get(position).getTipoMemoria());
        holder.etiInformaciom.setText(ListRam.get(position).getTamañoMemoria());
        holder.foto.setImageResource(ListRam.get(position).getFoto());



    }

    @Override
    public int getItemCount() {
        return ListRam.size();
    }

    @Override
    public void onClick(View v) {

    }

    public class ViewHolderRam extends RecyclerView.ViewHolder {

        TextView etiNombre,etiInformaciom;
        ImageView foto;


        public ViewHolderRam(@NonNull View itemView) {
            super(itemView);

            etiNombre= (TextView) itemView.findViewById(R.id.idNombreR);
            etiInformaciom = (TextView) itemView.findViewById(R.id.idInfoR);
            foto = (ImageView) itemView.findViewById(R.id.idImagenR);




        }


    }
}
