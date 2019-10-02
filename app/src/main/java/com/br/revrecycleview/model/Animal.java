package com.br.revrecycleview.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;

public class Animal implements Parcelable {

    private String nome;
    private String especie;
    private int imagemAnimal;

    public Animal(String nome, String especie, int imagemAnimal) {
        this.nome = nome;
        this.especie = especie;
        this.imagemAnimal = imagemAnimal;
    }

    public Animal() {
    }

    protected Animal(Parcel in) {
        nome = in.readString();
        especie = in.readString();
        imagemAnimal = in.readInt();
    }

    public static final Creator<Animal> CREATOR = new Creator<Animal>() {
        @Override
        public Animal createFromParcel(Parcel in) {
            return new Animal(in);
        }

        @Override
        public Animal[] newArray(int size) {
            return new Animal[size];
        }
    };

    public int getImagemAnimal() {
        return imagemAnimal;
    }

    public void setImagemAnimal(int imagemAnimal) {
        this.imagemAnimal = imagemAnimal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nome);
        dest.writeString(especie);
        dest.writeInt(imagemAnimal);
    }
}
