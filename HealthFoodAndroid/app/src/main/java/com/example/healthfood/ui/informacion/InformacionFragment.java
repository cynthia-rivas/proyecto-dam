package com.example.healthfood.ui.informacion;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.healthfood.databinding.FragmentInformacionBinding;
import com.example.healthfood.model.Ingrediente;

public class InformacionFragment extends Fragment {

    private FragmentInformacionBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        InformacionViewModel homeViewModel =
                new ViewModelProvider(this).get(InformacionViewModel.class);

        binding = FragmentInformacionBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final RecyclerView rvIngredientes = binding.rvIngredientes;


        homeViewModel.getIngredientes().observe(getViewLifecycleOwner(), ingredientes -> {
            IngredientesAdapter ingredientesAdapter = new IngredientesAdapter(ingredientes, this.getContext());
            rvIngredientes.setHasFixedSize(true);
            rvIngredientes.setLayoutManager(new LinearLayoutManager(this.getContext()));
            rvIngredientes.setAdapter(ingredientesAdapter);
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}