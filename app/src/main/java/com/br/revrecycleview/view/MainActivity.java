package com.br.revrecycleview.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Animatable;
import android.os.Bundle;

import com.br.revrecycleview.R;
import com.br.revrecycleview.adapter.AnimalAdapter;
import com.br.revrecycleview.model.Animal;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AnimalAdapter adapter;
    private List<Animal> listaAnimal = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerViewAnimais);

        //Iniciando o adapter
        adapter = new AnimalAdapter(retornaListaAnimais());

        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    public List<Animal> retornaListaAnimais(){
        listaAnimal.add(new Animal("Gato","Gato", R.drawable.gato));
        listaAnimal.add(new Animal("Leão","Leão",R.drawable.leao));
        listaAnimal.add(new Animal("Cachorro","Cachorro",R.drawable.cachorro));

        return listaAnimal;
    }



}
