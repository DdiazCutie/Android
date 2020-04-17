package com.isil.impaktofinal.Entidades.Adaptadores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.isil.impaktofinal.Entidades.Producto.Case;
import com.isil.impaktofinal.Entidades.Producto.FuentePoder;
import com.isil.impaktofinal.R;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;



import java.util.ArrayList;



public class ListaFuentePoderVH extends RecyclerView.Adapter<ListaFuentePoderVH.ViewHolderFuentePoder> implements View.OnClickListener {
    ArrayList<FuentePoder> ListFuentePoder;

    public ListaFuentePoderVH(ArrayList<FuentePoder> listFuentePoder) {
        this.ListFuentePoder = listFuentePoder;
    }

    @NonNull
    @Override
    public ViewHolderFuentePoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_listafuentepoder,null,false);
        return  new ViewHolderFuentePoder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderFuentePoder holder, int position) {
        holder.etiNombre.setText(ListFuentePoder.get(position).getDimension());
        holder.etiInformaciom.setText(ListFuentePoder.get(position).getCapacidadSalida());
        holder.foto.setImageResource(ListFuentePoder.get(position).getFoto());



    }

    @Override
    public int getItemCount() {
        return ListFuentePoder.size();
    }

    @Override
    public void onClick(View v) {

    }

    public class ViewHolderFuentePoder extends RecyclerView.ViewHolder {

        TextView etiNombre,etiInformaciom;
        ImageView foto;


        public ViewHolderFuentePoder(@NonNull View itemView) {
            super(itemView);

            etiNombre= (TextView) itemView.findViewById(R.id.idNombreF);
            etiInformaciom = (TextView) itemView.findViewById(R.id.idInfoF);
            foto = (ImageView) itemView.findViewById(R.id.idImagenF);




        }


    }
}
