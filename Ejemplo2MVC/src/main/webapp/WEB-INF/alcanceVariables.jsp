
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alcance variables</title>
    </head>
    <body>
        <h1>Alcance variables</h1>
        <br/>
        Variables request (Por el tipo de peticion no lee variables en el alcance de request ):
        <br/>
        Base: ${rectanguloRequest.base}
        Altura:  ${rectanguloRequest.altura}
        Area  ${rectanguloRequest.area}
        <br/>
        <br/>
        Variables sesion
        Base: ${rectanguloSesion.base}
        Altura:  ${rectanguloSesion.altura}
        Area  ${rectanguloSesion.area}
        <br/>
        <br/>
        Variables app
        Base: ${rectanguloAplicacion.base}
        Altura:  ${rectanguloAplicacion.altura}
        Area  ${rectanguloAplicacion.area}
        <br/>
        <br/>
        <a href="${pageContext.request.contextPath}/index.jsp">Regresar al incio</a>
    </body>
</html>
