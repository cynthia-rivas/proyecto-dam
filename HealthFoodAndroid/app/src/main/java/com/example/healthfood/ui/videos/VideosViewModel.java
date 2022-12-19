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
                "Abdominales",
                    "Una rutina de abdominales para hacer en casa y tonificar el abdomen. \n",
                    "sxuZzi9sqL0"
            )
        );

        videosEjemplo.add(
                new Video(
                        "Tonificar brazos",
                        "Una rutina de entrenamiento con ejercicios de brazos con mancuernas para tonificarlos.",
                        "ZIm_qrJSOds"
                )
        );

        videosEjemplo.add(
                new Video(
                        "Tonificar Piernas",
                        "Una rutina de entrenamiento con ejercicios de piernas para tonificar y adelgazar la zona.",
                        "00KGwSXbnzQ"
                )
        );

        videosEjemplo.add(
                new Video(
                        "Eliminar la flacidez de los brazos ",
                        "Una rutina de ejercicios para los brazos para tonificar y eliminar los rollitos.",
                        "qMg-5gNRxgA"
                )
        );

        videosEjemplo.add(
                new Video(
                        "Rutina de ejercicios",
                        "Una rutina de ejercicios para tonificar vuestro cuerpo con unos entrenamientos de brazos, hombros y abdomen.",
                        "jGmyNlqFKSk"
                )
        );

        videosEjemplo.add(
                new Video(
                        "Glúteos fuertes y abdomen plano",
                        "Una rutina para tonificar y endurecer glúteos y piernas y abdominales de 18 minutos para realizar en casa.",
                        "zzH07PoU1dI"
                )
        );

        videosEjemplo.add(
                new Video(
                        "CARDIO 30 MINUTOS",
                        "una rutina de cardio con ejercicios para reducir la cintura de 30 minutos además de eliminar grasas y quemar esas calorías que nos sobran.",
                        "0YRX4pEP6pY"
                )
        );

        videosEjemplo.add(
                new Video(
                        "Calentamiento",
                        "Una rutina de ejercicios para calentar con estiramientos para realizar antes de empezar tu tabla de ejercicios.",
                        "mHP_rcA0xEc"
                )
        );

        videosEjemplo.add(
                new Video(
                        "Reducir grasa abdominal",
                        "Una rutina de entrenamiento con ejercicios de cardio intenso para adelgazar el abdomen.",
                        "cNbaF0TFDtI"
                )
        );

        videosEjemplo.add(
                new Video(
                        "Reducir cintura y abdomen",
                        "una rutina de ejercicios perfecta para reducir cintura y tonificar el abdomen.",
                        "uop6F7EwFHw"
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