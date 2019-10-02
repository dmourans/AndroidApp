package com.br.revrecycleview.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.os.Bundle;

import com.br.revrecycleview.R;
import com.br.revrecycleview.adapter.AnimalAdapter;
import com.br.revrecycleview.interfaces.ItemClickListener;
import com.br.revrecycleview.model.Animal;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ItemClickListener {

    private RecyclerView recyclerView;
    private AnimalAdapter adapter;
    private List<Animal> listaAnimal = new ArrayList<>();
    public static final String ANIMAL_KEY = "animal";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerViewAnimais);
        adapter = new AnimalAdapter(retornaListaAnimais(), this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    public List<Animal> retornaListaAnimais(){
        listaAnimal.add(new Animal("Gato","Gato de botas do filme bonitinho", R.drawable.gato));
        listaAnimal.add(new Animal("Leão","Leão Scar do filme rei leao",R.drawable.leao));
        listaAnimal.add(new Animal("Cachorro","Cachorro vira latas toma tudo",R.drawable.cachorro));

        return listaAnimal;
    }

    @Override
    public void onClick(Animal animal) {
        Intent intent = new Intent( MainActivity.this, DetalheAnimalListener.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable(ANIMAL_KEY, animal);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
