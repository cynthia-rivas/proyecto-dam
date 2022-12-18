package com.example.healthfood.ui.videos;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.healthfood.R;

public class VideoViewHolder
        extends RecyclerView.ViewHolder {
    TextView textViewTitulo;
    TextView textViewDescripcion;
    ImageView imagenView;
    View view;

    VideoViewHolder(View itemView)
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