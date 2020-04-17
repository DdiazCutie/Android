package com.isil.impaktofinal.Entidades.Adaptadores;
import com.isil.impaktofinal.Entidades.Producto.Almacenamiento;
import com.isil.impaktofinal.R;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;



public class ListaAlmacenamientoVH extends RecyclerView.Adapter<ListaAlmacenamientoVH.ViewHolderAlmacenamiento> implements View.OnClickListener {
    ArrayList<Almacenamiento> ListAlmancenamiento;

    public ListaAlmacenamientoVH(ArrayList<Almacenamiento> listAlmancenamiento) {
        this.ListAlmancenamiento = listAlmancenamiento;
    }

    @NonNull
    @Override
    public ViewHolderAlmacenamiento onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_lista_almacenamiento,null,false);
        return  new ViewHolderAlmacenamiento(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderAlmacenamiento holder, int position) {
        holder.etiNombre.setText(ListAlmancenamiento.get(position).getTipo());
        holder.etiInformaciom.setText(ListAlmancenamiento.get(position).getCapacidad());
        holder.foto.setImageResource(ListAlmancenamiento.get(position).getFoto());



    }

    @Override
    public int getItemCount() {
        return ListAlmancenamiento.size();
    }

    @Override
    public void onClick(View v) {

    }

    public class ViewHolderAlmacenamiento extends RecyclerView.ViewHolder {

        TextView etiNombre,etiInformaciom;
        ImageView foto;


        public ViewHolderAlmacenamiento(@NonNull View itemView) {
            super(itemView);

            etiNombre= (TextView) itemView.findViewById(R.id.idNombreA);
            etiInformaciom = (TextView) itemView.findViewById(R.id.idInfoA);
            foto = (ImageView) itemView.findViewById(R.id.idImagenA);




        }


    }
}
