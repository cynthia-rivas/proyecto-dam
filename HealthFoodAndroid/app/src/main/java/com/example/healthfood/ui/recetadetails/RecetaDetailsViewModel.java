package com.example.healthfood.ui.recetadetails;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.healthfood.model.Receta;

public class RecetaDetailsViewModel extends ViewModel {

    public final MutableLiveData<Receta> mReceta;

    public RecetaDetailsViewModel() {
        mReceta = new MutableLiveData<>();
    }

    public LiveData<Receta> getRecetaLiveData() {
        return mReceta;
    }
}