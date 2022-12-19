package com.example.healthfood.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import com.example.healthfood.R;
import com.example.healthfood.databinding.FragmentHomeBinding;
import com.example.healthfood.databinding.FragmentNotificationsBinding;
import com.example.healthfood.ui.recetas.RecetasFragmentDirections;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel notificationsViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.buttonRecetas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToRecetas();
            }
        });

        binding.buttonEjercicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToVideos();
            }
        });



        return root;
    }

    public void navigateToRecetas(){
        NavController navController = Navigation.findNavController(this.getActivity(), R.id.nav_host_fragment_activity_main);
        @NonNull NavDirections action = HomeFragmentDirections.actionNavigationHomeToNavigationRecetas();
        navController.navigate(action);
    }


    public void navigateToVideos(){
        NavController navController = Navigation.findNavController(this.getActivity(), R.id.nav_host_fragment_activity_main);
        @NonNull NavDirections action = HomeFragmentDirections.actionNavigationHomeToNavigationVideos();
        navController.navigate(action);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}