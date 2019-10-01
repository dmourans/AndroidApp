package com.br.revrecycleview.model;

import android.widget.ImageView;

public class Animal {

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



}
