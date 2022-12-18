package com.example.healthfood.ui.recetas;

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
import com.example.healthfood.databinding.FragmentRecetasBinding;
import com.example.healthfood.databinding.FragmentVideosBinding;
import com.example.healthfood.model.Receta;

public class RecetasFragment extends Fragment {

    private FragmentRecetasBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        RecetasViewModel homeViewModel =
                new ViewModelProvider(this).get(RecetasViewModel.class);

        binding = FragmentRecetasBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final RecyclerView rvRecetas = binding.rvRecetas;


        homeViewModel.getRecetas().observe(getViewLifecycleOwner(), recetas -> {
            RecetasAdapter recetasAdapter = new RecetasAdapter(recetas, new ClickRecetaEvent() {
                @Override
                public void clickReceta(Receta receta) {
                    navigateToRecetaFragmentDetails(receta);
                }
            }, this.getContext());
            rvRecetas.setHasFixedSize(true);
            rvRecetas.setLayoutManager(new LinearLayoutManager(this.getContext()));
            rvRecetas.setAdapter(recetasAdapter);
        });
        return root;
    }

    public void navigateToRecetaFragmentDetails(Receta receta){

        MainActivity activity = (MainActivity)this.getActivity();
        activity.navigateToDetails(receta);


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}