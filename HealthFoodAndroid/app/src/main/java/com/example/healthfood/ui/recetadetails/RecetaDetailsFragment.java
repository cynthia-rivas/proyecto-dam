package com.example.healthfood.ui.recetadetails;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModelProvider;

import com.bumptech.glide.Glide;
import com.example.healthfood.databinding.FragmentRecetaDetailsBinding;
import com.example.healthfood.model.Receta;

public class RecetaDetailsFragment extends Fragment {


    private FragmentRecetaDetailsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        RecetaDetailsViewModel recetaDetailsViewModel =
                new ViewModelProvider(this).get(RecetaDetailsViewModel.class);

        binding = FragmentRecetaDetailsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        recetaDetailsViewModel.getRecetaLiveData().observe(getViewLifecycleOwner(), receta -> {

            binding.tituloTextView.setText(receta.getTitulo());
            binding.preparacionTextView.setText(receta.getPreparacion());

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getContext(), android.R.layout.simple_spinner_item, receta.getIngredientes());

            // Here, you set the data in your ListView
            binding.ingredientesListView.setAdapter(adapter);


            Glide.with(this.getContext())
                    .load(receta.getUrl())
                    .into( binding.recetaImageView);

            adapter.notifyDataSetChanged();

                });
        Receta receta = RecetaDetailsFragmentArgs.fromBundle(getArguments()).getReceta();

        recetaDetailsViewModel.mReceta.setValue(receta);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


}