package com.example.healthfood.ui.recetas;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.healthfood.R;
import com.example.healthfood.model.Receta;

import java.util.Collections;
import java.util.List;

public class RecetasAdapter
        extends RecyclerView.Adapter<RecetaViewHolder> {

    List<Receta> list
            = Collections.emptyList();

    ClickRecetaEvent event;

    Context context;

    public RecetasAdapter(List<Receta> list, ClickRecetaEvent event,
                                Context context)
    {
        this.list = list;
        this.event = event;
        this.context = context;
    }

    @Override
    public RecetaViewHolder
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
                .inflate(R.layout.receta_view,
                        parent, false);

        RecetaViewHolder viewHolder
                = new RecetaViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void
    onBindViewHolder(final RecetaViewHolder viewHolder,
                     @SuppressLint("RecyclerView") final int position)
    {
        viewHolder.textViewTitulo
                .setText(list.get(position).getTitulo());
        viewHolder.textViewPreparacion
                .setText(list.get(position).getPreparacion());


        Glide.with(context)
                .load(list.get(position).getUrl())
                .into( viewHolder.imagenView);

        viewHolder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                event.clickReceta(list.get(position));
            }
        });


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