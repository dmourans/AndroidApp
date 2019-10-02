package com.br.revrecycleview.adapter;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.br.revrecycleview.R;
import com.br.revrecycleview.interfaces.ItemClickListener;
import com.br.revrecycleview.model.Animal;
import com.br.revrecycleview.view.DetalheAnimalListener;

import java.util.List;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.ViewHolder> {

    private List<Animal> listaAnimal;
    private ItemClickListener itemClickListener;

    public AnimalAdapter(List<Animal> listaAnimal, ItemClickListener itemClickListener) {
        this.listaAnimal = listaAnimal;
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycle_view_item,viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {

        final Animal animal = listaAnimal.get(position);
        viewHolder.onBind(animal);

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onClick(animal);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listaAnimal.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView txtEspecie;
        private ImageView imgAnimal;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgAnimal = itemView.findViewById(R.id.imageView);
            txtEspecie = itemView.findViewById(R.id.textViewNome);
        }

        //Método que seta as informações nos componentes
        public void onBind(Animal animal){

            Drawable drawable = itemView.getResources().getDrawable(animal.getImagemAnimal());

            imgAnimal.setImageDrawable(drawable);
            txtEspecie.setText(animal.getNome());

        }
    }

}
