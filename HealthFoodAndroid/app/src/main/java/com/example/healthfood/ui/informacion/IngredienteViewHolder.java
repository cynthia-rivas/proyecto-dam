package com.example.healthfood.ui.informacion;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.healthfood.R;

public class IngredienteViewHolder
        extends RecyclerView.ViewHolder {
    TextView textViewTitulo;
    TextView textViewDescripcion;
    ImageView imagenView;
    View view;

    IngredienteViewHolder(View itemView)
    {
        super(itemView);
        textViewTitulo
                = (TextView)itemView
                .findViewById(R.id.textViewTitulo);
        textViewDescripcion
                = (TextView)itemView
                .findViewById(R.id.textViewDescripcion);
        imagenView
                = (ImageView) itemView
                .findViewById(R.id.imageView);
        view  = itemView;
    }
}