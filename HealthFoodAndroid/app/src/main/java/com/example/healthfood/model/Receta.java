package com.example.healthfood.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Receta implements Parcelable {

    private int id = 0;
    private String titulo;
    private String[] ingredientes;
    private String preparacion;
    private String url;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.titulo);
        dest.writeArray(this.ingredientes);
        dest.writeString(this.preparacion);
        dest.writeString(this.url);
    }
    public Receta() {
    }


    protected Receta(Parcel in) {
        this.id = in.readInt();
        this.titulo = in.readString();
        in.readStringArray(this.ingredientes);
        this.preparacion = in.readString();
        this.url = in.readString();

    }

    public Receta(String titulo, String[] ingredientes, String preparacion, String url) {
        this.titulo = titulo;
        this.ingredientes = ingredientes;
        this.preparacion = preparacion;
        this.setUrl(url);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public static final Parcelable.Creator<Receta> CREATOR = new Parcelable.Creator<Receta>() {
        @Override
        public Receta createFromParcel(Parcel source) {
            return new Receta(source);
        }

        @Override
        public Receta[] newArray(int size) {
            return new Receta[size];
        }
    };

}
