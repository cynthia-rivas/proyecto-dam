package com.example.healthfood.ui.recordatorios;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RecordatoriosViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public RecordatoriosViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is recordatorios fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}