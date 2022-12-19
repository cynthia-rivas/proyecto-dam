package com.example.healthfood.ui.informacion;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InformacionViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public InformacionViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is informacion fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}