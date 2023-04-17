package com.example.healthfood.ui.informacion;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.healthfood.model.Ingrediente;

import java.util.ArrayList;
import java.util.List;

public class InformacionViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    private final MutableLiveData<List<Ingrediente>> mIngredientes;

    public InformacionViewModel() {
        mText = new MutableLiveData<>();
        mIngredientes = new MutableLiveData<>();
        mText.setValue("este es el fragment info");


        List<Ingrediente> ingredientesEjemplo = new ArrayList<>();

        ingredientesEjemplo.add(
                new Ingrediente(
                        "Tomate seco",
                        "",
                        "213 kcal cada 100gr.",
                        "https://biotrendies.com/wp-content/uploads/2016/09/tomate-seco-400x300.jpg"
                )
        );

        ingredientesEjemplo.add(
                new Ingrediente(
                        "Yuca",
                        "",
                        "160 kcal cada 100gr.",
                        "https://biotrendies.com/wp-content/uploads/2015/07/yuca-400x300.jpg"
                )
        );

        ingredientesEjemplo.add(
                new Ingrediente(
                        "Maíz Dulce",
                        "",
                        "86 kcal cada 100gr.",
                        "https://biotrendies.com/wp-content/uploads/2015/06/maiz.jpg"
                )
        );

        ingredientesEjemplo.add(
                new Ingrediente(
                        "Boniato",
                        "",
                        "86 kcal cada 100gr.",
                        "https://biotrendies.com/wp-content/uploads/2015/07/boniato-400x300.jpg"
                )
        );

        ingredientesEjemplo.add(
                new Ingrediente(
                        "Patata",
                        "",
                        "77 kcal cada 100gr.",
                        "https://biotrendies.com/wp-content/uploads/2015/06/patata-400x300.jpg"
                )
        );

        ingredientesEjemplo.add(
                new Ingrediente(
                        "Chirivía",
                        "",
                        "75 kcal cada 100gr.",
                        "https://biotrendies.com/wp-content/uploads/2015/07/chirivia.jpg"
                )
        );

        ingredientesEjemplo.add(
                new Ingrediente(
                        "Puerro",
                        "",
                        "61 kcal cada 100gr.",
                        "https://biotrendies.com/wp-content/uploads/2015/06/puerro-400x300.jpg"
                )
        );

        ingredientesEjemplo.add(
                new Ingrediente(
                        "Col verde",
                        "",
                        "49 kcal cada 100gr.",
                        "https://biotrendies.com/wp-content/uploads/2015/07/col-verde1.jpg"
                )
        );

        ingredientesEjemplo.add(
                new Ingrediente(
                        "Alcachofa",
                        "",
                        "47 kcal cada 100gr.",
                        "https://biotrendies.com/wp-content/uploads/2015/07/alcachofa-400x300.jpg"
                )
        );

        ingredientesEjemplo.add(
                new Ingrediente(
                        "Remolacha",
                        "",
                        "43 kcal cada 100gr.",
                        "https://biotrendies.com/wp-content/uploads/2015/06/remolacha-400x300.jpg"
                )
        );

        mIngredientes.setValue(ingredientesEjemplo);
    }

    public LiveData<String> getText() {
        return mText;
    }
    public LiveData<List<Ingrediente>> getIngredientes() {
        return mIngredientes;
    }


}