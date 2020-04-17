package com.isil.impaktofinal.Entidades.Adaptadores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.isil.impaktofinal.Entidades.Producto.PlacaMadre;
import com.isil.impaktofinal.Entidades.Producto.Procesador;
import com.isil.impaktofinal.R;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;



import java.util.ArrayList;



public class ListaProcesadorVH extends RecyclerView.Adapter<ListaProcesadorVH.ViewHolderProcesador> implements View.OnClickListener {
    ArrayList<Procesador> ListProcesador;

    public ListaProcesadorVH(ArrayList<Procesador> listProcesador) {
        this.ListProcesador = listProcesador;
    }

    @NonNull
    @Override
    public ViewHolderProcesador onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_lista_procesador,null,false);
        return  new ViewHolderProcesador(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderProcesador holder, int position) {
        holder.etiNombre.setText(ListProcesador.get(position).getNombre());
        holder.etiInformaciom.setText(ListProcesador.get(position).getDescripcion());
        holder.foto.setImageResource(ListProcesador.get(position).getFoto());



    }

    @Override
    public int getItemCount() {
        return ListProcesador.size();
    }

    @Override
    public void onClick(View v) {

    }

    public class ViewHolderProcesador extends RecyclerView.ViewHolder {

        TextView etiNombre,etiInformaciom;
        ImageView foto;


        public ViewHolderProcesador(@NonNull View itemView) {
            super(itemView);

            etiNombre= (TextView) itemView.findViewById(R.id.idNombrePr);
            etiInformaciom = (TextView) itemView.findViewById(R.id.idInfoPr);
            foto = (ImageView) itemView.findViewById(R.id.idImagenPr);




        }


    }
}

