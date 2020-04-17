package com.isil.impaktofinal;
import com.isil.impaktofinal.Entidades.Producto.Almacenamiento;
import com.isil.impaktofinal.Entidades.Producto.Case;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.isil.impaktofinal.Entidades.Adaptadores.ListaAlmacenamientoVH;
import com.isil.impaktofinal.Entidades.Adaptadores.ListaCaseVH;



import java.util.ArrayList;
public class CatalogoCase extends AppCompatActivity implements Parcelable {
    ArrayList<Case> listaCase;
    RecyclerView recycler;

    protected CatalogoCase(Parcel in) {
    }

    public static final Creator<CatalogoCase> CREATOR = new Creator<CatalogoCase>() {
        @Override
        public CatalogoCase createFromParcel(Parcel in) {
            return new CatalogoCase(in);
        }

        @Override
        public CatalogoCase[] newArray(int size) {
            return new CatalogoCase[size];
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo_case);
            if(getIntent().hasExtra("select_note")){

                CatalogoCase catalogoCase = getIntent().getParcelableExtra("select_note");
            }


        listaCase = new ArrayList<>();
        recycler = (RecyclerView)findViewById(R.id.cRecyclerViewC);
        recycler.setLayoutManager(new LinearLayoutManager(this));

        llenarCase();
        ListaCaseVH adapter =  new ListaCaseVH(listaCase);
        recycler.setAdapter(adapter);




    }
    private void llenarCase () {




        listaCase.add(new Case("ANTRIX FX GALAXY",".",R.drawable.caseantrixfxgalaxy));
        listaCase.add(new Case("COOLER MASTER MASTERBOX","",R.drawable.casecoolermastermasterbox));
        listaCase.add(new Case("DEEP COOL MASTER XX70","",R.drawable.casedeepcoolmatrexx70));
        listaCase.add(new Case("THERMALTAKE VERSA J21","",R.drawable.casethermaltakeversaj21));
        listaCase.add(new Case("THERMALTAKE VERSA J25"," ",R.drawable.casethermaltakeversaj25));



    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }
}
