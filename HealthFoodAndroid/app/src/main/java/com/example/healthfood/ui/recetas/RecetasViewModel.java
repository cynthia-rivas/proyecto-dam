package com.example.healthfood.ui.recetas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.healthfood.model.Receta;

import java.util.ArrayList;
import java.util.List;

public class RecetasViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    private final MutableLiveData<List<Receta>> mRecetas;

    public RecetasViewModel() {
        mText = new MutableLiveData<>();
        mRecetas = new MutableLiveData<>();
        mText.setValue("este es el fragment home");


        List<Receta> recetasEjemplo = new ArrayList<>();

        recetasEjemplo.add(
            new Receta(
                "Pollo con crema de espinaca",
                   new String[]{"Aceite de coco", "2 piezas de pollo cocido", "1 taza de espinaca", "Queso","Un puñado de almendras","Sal de mar" },
                "Prepara en una bandeja untandole con aceite de coco, coloca el pollo. Mezclar en el procesador el queso, las almendras, las espinacas y la sal a tu gusto, luego verter esta mezcla sobre el pollo. poner en el Horno unos 10-15 minutos a 175º C-",
                "https://www.cardamomo.news/__export/1647463199513/sites/debate/img/2022/03/16/pollo_con_crema_y_espinacas_crop1647463178056.jpeg_172596871.jpeg")
            );


        recetasEjemplo.add(
                new Receta(
                        "Pollo al limon con ajo y albahaca",
                        new String[]{"4 pechugas de pollo", "1 diente de ajo","2 cucharadas de aceite de coco", "Pimienta","3 cucharaditas de jugo de limon", "5 cucharadas de albahaca fresca","Sal"},
                        "calienta el horno a 177ºC. Pica el ajo, combina el aceite de coco, la pimienta, el ajo, el jugo de limon, la albahaca y la sal en un recipiente. Agrega las pechugas de pollo y deja reposar de 10-15 minutos. Coloca las pechugas ya aderezadas en un recipiente para meter al horno y cocelas por 30 minutos. ",
                        "https://www.gourmet4life.com/image0428/8b/8bd3ce3ee7cc5be312cb74b067645fd3.jpg")
        );

        recetasEjemplo.add(
                new Receta(
                        "Salmon al Horno",
                        new String[]{"1 pieza de salmon", "3 dientes de ajo", "1 cucharada de aceite de oliva", "2 cucharadas de jugo de Limon", "1//2 cucharada de eneldo", "1//2 cucharada de perejil" },
                        "Calienta el horno a 160º,a continuacion pica el ajo, combina el ajo, el aciete de oliva, el jugo de limon y hierbas en un plato hondo. En un recipiente apto para horno, esparce aceite de oliva para evitar que se pegue, coloca el salmon con la piel hacia abajo y ponlo al horno entre 15-20 minutos ",
                        "https://mejorconsalud.as.com/wp-content/uploads/2018/11/preparar-salmon-al-horno-768x512.jpg?auto=webp&quality=45&width=1920&crop=16:9,smart,safe")
        );

        recetasEjemplo.add(
                new Receta(
                        "Pescado encocado",
                        new String[]{"2 filetes de pescado", "1 huevo", "1//2 taza de coco rallado", "1//2 taza de almendras","1 cucharada de aceite de coco" },
                        "Mezcla el coco con la almendra en una licuadora y que quede listo como pan para empanizar. Poner a calentar el aceite de coco en una sarten, Luego coge el pescado pasarlo por el huevo y pasalo por la mezcla de coco con Almendra. Cuando el aceite este caliente poner a freir el pescado",
                        "https://www.recetasdecamaron.com/wp-content/uploads/2021/07/Pescado-Empanizado-Crujiente.png")
        );


        recetasEjemplo.add(
                new Receta(
                        "Pechuga de pollo con arroz de coliflor",
                        new String[]{"Pechuga de pollo en filetes", "Aceite de oliva", "Sal y pimienta al gusto","1 coliflor rayada","1 ajo picado","1//2 cebolla picada","Pimientos de colores","Aceite de coco" },
                        "En una sarten agrega aceite de coco, el ajo y la cebolla, despúes pon los pimientos de colores, por último añade la coliflor rayada, agrega sal y pimienta al gusto y tapa por unos 4-5 minutos. Sirve con la pechuga asada. ",
                        "https://i0.wp.com/naturallynatalia.net/wp-content/uploads/2017/10/20171007_154238.jpg?w=720&ssl=1")
        );

        recetasEjemplo.add(
                new Receta(
                        "Puré de coliflor",
                        new String[]{"1 cabeza grande coliflor", "5 dientes de ajo", "1//3 de taza de hierbas(albahaca y cebollin)","1 pizca de sal de mar" },
                        "Corta la colifor en pequeños pedazos. Pela los dientes de ajo y cortalos a la mitad, cuece al vapor la coliflor y el ajo por aproximadamente 15 minutos o hasta que este tierno, luego combina la coliflor, el ajo, las hierbas y la sal en la licuadora hasta que todos los ingredientes se mezclen y formen la consistencia de puré ",
                        "https://elmundoenrecetas.s3.amazonaws.com/uploads/recipe/main_image/508/como_hacer_pure_de_coliflor.webp")
        );

        recetasEjemplo.add(
                new Receta(
                        "Ensalada de Zanahoria",
                        new String[]{"4 zanahorias","Jugo de 2 naranjas","Nuez en trozos","Hojas de menta" },
                        "Rayar las 4 zanahorias, añadir el jugo de las naranjas, decorar con nuez y las hojas de menta",
                        "https://www.hogarmania.com/archivos/201501/5493-2-ensalada-de-zanahorias-xl-668x400x80xX.jpg")
        );

        recetasEjemplo.add(
                new Receta(
                        "Ensalada mexicana",
                        new String[]{"300 gramos de col rayada","1 cebolla picada","1 manojo de cilantro picado","4 cucharadas de aceite de oliva","1 cucharada de oregano","1//4 de vinagre de manzana","1 aguacate en tiras","Sal al gusto" },
                        "En una ensaladera mezcla todos los ingredientes y adorna con las tiras de aguacate ",
                        "https://canalcocina.es/medias/users/33437/npcsdsur2rg6og3c04bo.jpg")
        );

        recetasEjemplo.add(
                new Receta(
                        "Espaguetti de calabaza",
                        new String[]{"1 calabaza","Mantequilla al gusto","Sal y pimienta negra al gusto" },
                        "Precalienta el horno a 175ºC. Corta la calabaza a la mitad, Pon la calabaza con los lados cortados hacia abajo, en una sarten con 1.3 centimetros de agua, Horneala alrededor de 1 hora, permite que la calabaza enfrie y saca las tiras de pulpa poco a poco con un tenedor, mezclalo con mantequilla, sal y Pimienta ",
                        "https://assets.kraftfoods.com/recipe_images/opendeploy/61689_MXM_K42674V0_OR1_OH_640x428.jpg")
        );

        recetasEjemplo.add(
                new Receta(
                        "Ensalada fácil de pollo",
                        new String[]{"Pollo desmenuzado","Nuez picada","Apio","Mayonesa","Sal de mar" },
                        "Mezclar todos los ingredientes al gusto personal y servir, podeis acompañar con lechuga o tortitas de maiz. ",
                        "https://www.cardamomo.news/__export/1649012519815/sites/debate/img/2022/04/03/ensalada-de-pollo.jpg_976912859.jpg")
        );

        mRecetas.setValue(recetasEjemplo);
    }

    public LiveData<String> getText() {
        return mText;
    }
    public LiveData<List<Receta>> getRecetas() {
        return mRecetas;
    }


}