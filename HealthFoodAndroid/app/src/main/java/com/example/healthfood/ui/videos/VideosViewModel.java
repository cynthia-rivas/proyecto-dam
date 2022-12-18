package com.example.healthfood.ui.videos;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.healthfood.model.Video;

import java.util.ArrayList;
import java.util.List;

public class VideosViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    private final MutableLiveData<List<Video>> mVideos;

    public VideosViewModel() {
        mText = new MutableLiveData<>();
        mVideos = new MutableLiveData<>();
        mText.setValue("este es el fragment home");


        List<Video> videosEjemplo = new ArrayList<>();

        videosEjemplo.add(
            new Video(
                "Video 1",
                    "Description 1",
                    "2tXQbi16EdI"
            )
        );

        videosEjemplo.add(
                new Video(
                        "Video 2",
                        "Description 2",
                        "2tXQbi16EdI"
                )
        );

        mVideos.setValue(videosEjemplo);
    }

    public LiveData<String> getText() {
        return mText;
    }
    public LiveData<List<Video>> getVideos() {
        return mVideos;
    }


}