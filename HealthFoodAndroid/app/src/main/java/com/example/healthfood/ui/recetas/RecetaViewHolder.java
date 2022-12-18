package com.example.healthfood.ui.recetas;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.healthfood.R;

public class RecetaViewHolder
        extends RecyclerView.ViewHolder {
    TextView textViewTitulo;
    TextView textViewPreparacion;
    ImageView imagenView;
    View view;

    RecetaViewHolder(View itemView)
    {
        super(itemView);
        textViewTitulo
                = (TextView)itemView
                .findViewById(R.id.textViewTitulo);
        textViewPreparacion
                = (TextView)itemView
                .findViewById(R.id.textViewPreparacion);
        imagenView
                = (ImageView) itemView
                .findViewById(R.id.imageView);
        view  = itemView;
    }
}