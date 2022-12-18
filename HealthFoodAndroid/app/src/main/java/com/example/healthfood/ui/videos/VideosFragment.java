package com.example.healthfood.ui.videos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.healthfood.MainActivity;
import com.example.healthfood.databinding.FragmentVideosBinding;
import com.example.healthfood.databinding.FragmentVideosBinding;
import com.example.healthfood.model.Receta;
import com.example.healthfood.model.Video;

public class VideosFragment extends Fragment {

    private FragmentVideosBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        VideosViewModel homeViewModel =
                new ViewModelProvider(this).get(VideosViewModel.class);

        binding = FragmentVideosBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final RecyclerView rvVideos = binding.rvVideos;


        homeViewModel.getVideos().observe(getViewLifecycleOwner(), Videos -> {
            VideosAdapter videosAdapter = new VideosAdapter(Videos, new ClickVideoEvent() {
                @Override
                public void clickVideo(Video video) {
                    navigateToYoutube(video);
                }
            }, this.getContext());
            rvVideos.setHasFixedSize(true);
            rvVideos.setLayoutManager(new LinearLayoutManager(this.getContext()));
            rvVideos.setAdapter(videosAdapter);
        });
        return root;
    }

    public void navigateToYoutube(Video video){

        MainActivity activity = (MainActivity)this.getActivity();
        activity.verYoutubeVideo(video.getYoutubeId());


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}