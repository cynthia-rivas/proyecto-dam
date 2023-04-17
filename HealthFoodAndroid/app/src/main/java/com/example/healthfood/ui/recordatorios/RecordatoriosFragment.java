package com.example.healthfood.ui.recordatorios;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.preference.SwitchPreference;
import androidx.annotation.Nullable;
import androidx.preference.PreferenceFragmentCompat;

import com.example.healthfood.R;

public class RecordatoriosFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey);
    }
}