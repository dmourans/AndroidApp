package com.br.revrecycleview.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.br.revrecycleview.R;
import com.br.revrecycleview.model.Animal;

import static com.br.revrecycleview.view.MainActivity.ANIMAL_KEY;

public class DetalheAnimalListener extends AppCompatActivity {

    private ImageView imagem;
    private TextView nome;
    private TextView descricao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_animal_listener);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        Animal animal = bundle.getParcelable(ANIMAL_KEY);

        initViews();

        if (getIntent() != null && getIntent().getExtras() != null){

            Drawable drawable = getResources().getDrawable(animal.getImagemAnimal());
            imagem.setImageDrawable(drawable);
            nome.setText(animal.getNome());
            descricao.setText(animal.getEspecie());

        }


    }

    private void initViews(){
        imagem = findViewById(R.id.imageView);
        nome = findViewById(R.id.textViewNome);
        descricao = findViewById(R.id.textViewDescri);
    }
}
