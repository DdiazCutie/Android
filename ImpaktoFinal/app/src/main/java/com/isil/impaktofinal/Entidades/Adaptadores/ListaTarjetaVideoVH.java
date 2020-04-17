package com.isil.impaktofinal.Entidades.Adaptadores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.isil.impaktofinal.Entidades.Producto.Ram;
import com.isil.impaktofinal.Entidades.Producto.TarjetaVideo;
import com.isil.impaktofinal.R;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;



import java.util.ArrayList;



public class ListaTarjetaVideoVH extends RecyclerView.Adapter<ListaTarjetaVideoVH.ViewHolderTarjetaVideo> implements View.OnClickListener {
    ArrayList<TarjetaVideo> ListTarjetaVideo;

    public ListaTarjetaVideoVH(ArrayList<TarjetaVideo> listTarjetaVideo) {
        this.ListTarjetaVideo = listTarjetaVideo;
    }

    @NonNull
    @Override
    public ViewHolderTarjetaVideo onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_lista_tarjeta_video,null,false);
        return  new ViewHolderTarjetaVideo(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderTarjetaVideo holder, int position) {
        holder.etiNombre.setText(ListTarjetaVideo.get(position).getNombre());
        holder.etiInformaciom.setText(ListTarjetaVideo.get(position).getDiscripcion());
        holder.foto.setImageResource(ListTarjetaVideo.get(position).getFoto());



    }

    @Override
    public int getItemCount() {
        return ListTarjetaVideo.size();
    }

    @Override
    public void onClick(View v) {

    }

    public class ViewHolderTarjetaVideo extends RecyclerView.ViewHolder {

        TextView etiNombre,etiInformaciom;
        ImageView foto;


        public ViewHolderTarjetaVideo(@NonNull View itemView) {
            super(itemView);

            etiNombre= (TextView) itemView.findViewById(R.id.idNombreT);
            etiInformaciom = (TextView) itemView.findViewById(R.id.idInfoT);
            foto = (ImageView) itemView.findViewById(R.id.idImagenT);




        }


    }
}
