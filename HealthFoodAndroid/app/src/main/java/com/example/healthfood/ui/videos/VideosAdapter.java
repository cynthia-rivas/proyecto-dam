package com.example.healthfood.ui.videos;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.healthfood.R;
import com.example.healthfood.model.Video;
import com.example.healthfood.ui.recetas.ClickRecetaEvent;

import java.util.Collections;
import java.util.List;

public class VideosAdapter
        extends RecyclerView.Adapter<VideoViewHolder> {

    List<Video> list
            = Collections.emptyList();

    ClickVideoEvent event;
    Context context;

    public VideosAdapter(List<Video> list, ClickVideoEvent event,
                         Context context)
    {
        this.list = list;
        this.event = event;
        this.context = context;
    }

    @Override
    public VideoViewHolder
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
                .inflate(R.layout.video_view,
                        parent, false);

        VideoViewHolder viewHolder
                = new VideoViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void
    onBindViewHolder(final VideoViewHolder viewHolder,
                     @SuppressLint("RecyclerView") final int position)
    {
        viewHolder.textViewTitulo
                .setText(list.get(position).getTitulo());
        viewHolder.textViewDescripcion
                .setText(list.get(position).getDescription());


        Glide.with(context)
                .load(list.get(position).getUrlImagen())
                .into( viewHolder.imagenView);

        viewHolder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                event.clickVideo(list.get(position));
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