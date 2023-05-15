
<?php
    include('db.php');
    $USUARIO=$_POST['usuario'];
    $PASSWORD=$_POST['contraseña'];

    $consulta = "INSERT INTO login (usuario, contraseña) VALUES ('$USUARIO', '$PASSWORD')";
    $resultado = mysqli_query($conexion, $consulta);

    if($resultado){
        echo "Usuario agregado correctamente";
    } else {
        echo "Error al agregar el usuario";
    }

    mysqli_close($conexion);
?>