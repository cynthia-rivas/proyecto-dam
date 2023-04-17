package com.example.healthfood.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Ingrediente implements Parcelable {

    private int id = 0;
    private String nombre;
    private String descripcion;
    private String calorias;
    private String url;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.nombre);
        dest.writeString(this.descripcion);
        dest.writeString(this.calorias);
        dest.writeString(this.url);
    }
    public Ingrediente() {
    }


    protected Ingrediente(Parcel in) {
        this.id = in.readInt();
        this.nombre = in.readString();
        this.descripcion = in.readString();
        this.calorias = in.readString();
        this.url = in.readString();

    }

    public Ingrediente(String nombre, String descripcion, String calorias, String url) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.calorias = calorias;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCalorias() {
        return calorias;
    }

    public void setCalorias(String calorias) {
        this.calorias = calorias;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public static final Creator<Ingrediente> CREATOR = new Creator<Ingrediente>() {
        @Override
        public Ingrediente createFromParcel(Parcel source) {
            return new Ingrediente(source);
        }

        @Override
        public Ingrediente[] newArray(int size) {
            return new Ingrediente[size];
        }
    };

}
