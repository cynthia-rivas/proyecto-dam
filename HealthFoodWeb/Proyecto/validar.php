<?php

    include('db.php');
    $USUARIO=$_POST['usuario'];
    $PASSWORD=$_POST['contraseña'];

    $consulta = "SELECT * FROM login where usuario = '$USUARIO' and contraseña = '$PASSWORD'";
    $resultado= mysqli_query($conexion, $consulta);

    $filas = mysqli_num_rows($resultado);

    if($filas){
        header("location:perfil.html");

    } else {
        include("inicio_sesion.html");
        ?>
        <h1>ERROR DE AUTENTIFICACION</h1>
        <?php
    }
    mysqli_free_result($resultado);
    mysqli_close($conexion);

?>