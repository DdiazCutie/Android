package com.isil.impaktofinal.Entidades;

import android.view.View;
import android.widget.Button;

public class Categorias {
    private String nombre, info, descripciom;
    private int foto;


    public Categorias(String nombre, String info, int foto) {
        this.nombre = nombre;
        this.info = info;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getDescripciom() {
        return descripciom;
    }

    public void setDescripciom(String descripciom) {
        this.descripciom = descripciom;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}




