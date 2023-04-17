package com.example.healthfood.ui.informacion;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.healthfood.R;
import com.example.healthfood.model.Ingrediente;
import com.example.healthfood.model.Video;

import java.util.Collections;
import java.util.List;

public class IngredientesAdapter
        extends RecyclerView.Adapter<IngredienteViewHolder> {

    List<Ingrediente> list
            = Collections.emptyList();

    Context context;

    public IngredientesAdapter(List<Ingrediente> list, Context context)
    {
        this.list = list;
        this.context = context;
    }

    @Override
    public IngredienteViewHolder
    onCreateViewHolder(ViewGroup parent,
                       int viewType)
    {

        Context context
                = parent.getContext();
        LayoutInflater inflater
                = LayoutInflater.from(context);

        // Inflate the layout

        View itemView
                = inflater
                .inflate(R.layout.ingrediente_view,
                        parent, false);

        IngredienteViewHolder viewHolder
                = new IngredienteViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void
    onBindViewHolder(final IngredienteViewHolder viewHolder,
                     @SuppressLint("RecyclerView") final int position)
    {
        viewHolder.textViewTitulo
                .setText(list.get(position).getNombre());
        viewHolder.textViewDescripcion
                .setText(list.get(position).getCalorias());


        Glide.with(context)
                .load(list.get(position).getUrl())
                .into( viewHolder.imagenView);



    }

    @Override
    public int getItemCount()
    {
        return list.size();
    }

    @Override
    public void onAttachedToRecyclerView(
            RecyclerView recyclerView)
    {
        super.onAttachedToRecyclerView(recyclerView);
    }


}