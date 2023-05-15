<?php
include 'db.php';

if(isset($_POST['busqueda'])) {
    $busqueda = $_POST['busqueda'];

    $consulta = $conexion->query("SELECT * FROM recetas WHERE nombre LIKE '%$busqueda%'");

    if($consulta->num_rows > 0) {
        
        echo '<section class="articulos-recetas">';
        
        while ($row = $consulta->fetch_array()){
            
            echo '<article class="articulos-recetas">';
            echo '<h2>'.$row['nombre'].'</h2>';
            echo '<img src="Imagenes/receta'.$row['id'].'.jpg" alt="'.$row['nombre'].'">';
            echo '<p class="ingredientes">'.$row['ingredientes'].'</p>';
            echo '<a class="ver-receta" href="modeloreceta.html">Ver receta</a>';
            echo '</article>';
        }

        echo '</section>';
    } else {
        echo '<p class="no-resultados">No se encontraron resultados para la búsqueda realizada.</p>';
    }
}
?>
<link type="text/css" rel="stylesheet" href="Paquete\css\main.css" media="screen,projection"/>
