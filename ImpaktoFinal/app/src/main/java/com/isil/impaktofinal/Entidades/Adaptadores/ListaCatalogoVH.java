package com.isil.impaktofinal.Entidades.Adaptadores;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.isil.impaktofinal.R;


import com.isil.impaktofinal.Entidades.Categorias;


import java.util.ArrayList;

public class ListaCatalogoVH extends RecyclerView.Adapter<ListaCatalogoVH.ViewHolderCatalogo> implements View.OnClickListener {
    ArrayList<Categorias> listaCategorias;
    onNoteListener listaCategoriasListener;

    public ListaCatalogoVH(ArrayList<Categorias> listCategorias , onNoteListener onNoteListener) {
        this.listaCategorias = listCategorias;
        this.listaCategoriasListener = onNoteListener;
    }

    @NonNull
    @Override
    public ViewHolderCatalogo onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.lista_catalogo,null,false);
        return  new ViewHolderCatalogo(view,listaCategoriasListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderCatalogo holder, int position) {
        holder.etiNombre.setText(listaCategorias.get(position).getNombre());
        holder.etiInformaciom.setText(listaCategorias.get(position).getInfo());
        holder.foto.setImageResource(listaCategorias.get(position).getFoto());



    }

    @Override
    public int getItemCount() {
        return listaCategorias.size();
    }

    @Override
    public void onClick(View v) {

    }

    public class ViewHolderCatalogo extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView etiNombre,etiInformaciom;
        ImageView foto;
        onNoteListener onNoteListener;


        public ViewHolderCatalogo(@NonNull View itemView , onNoteListener onNoteListener) {
            super(itemView);

          etiNombre= (TextView) itemView.findViewById(R.id.idNombre);
          etiInformaciom = (TextView) itemView.findViewById(R.id.idInfo);
          foto = (ImageView) itemView.findViewById(R.id.idImagen);
          this.onNoteListener = onNoteListener;
          itemView.setOnClickListener(this);




        }


        @Override
        public void onClick(View v) {
            onNoteListener.onNoteClick(getAdapterPosition());

        }
    }

    public interface onNoteListener {
        void onNoteClick(int position);

    }
}
