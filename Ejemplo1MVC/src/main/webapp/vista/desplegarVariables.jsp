<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Despliegue de variables</title>
    </head>
    <body>
        <h1>Despliegue De Variables</h1>
        variable en alacance request: ${mensaje}
        <br/><br/>
        Variable en el alcance sesion
        <br/>
        Rectangulo : 
        <!<!-- No accede directamente a la variable si no al metodo get -->
        base ${rectangulo.base}
        altura ${rectangulo.altura}
        area: ${rectangulo.area}
        
    </body>
</html>
