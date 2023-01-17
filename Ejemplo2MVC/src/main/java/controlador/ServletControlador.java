package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import modelo.Rectangulo;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Procesamos parametros
        String accion = request.getParameter("accion");

        //Creamos los javaBeans
        Rectangulo recRequest = new Rectangulo(1, 2);
        Rectangulo recSesion = new Rectangulo(3, 4);
        Rectangulo recApp = new Rectangulo(5, 6);

        //Agregamos al JavaBeans a algun alcance 
        //Revisamos la accion proporcionada
        if ("agregaVariables".equals(accion)) {
            //alcance de request
            request.setAttribute("rectanguloRequest", recRequest);
            //alcance de sesion
            HttpSession sesion = request.getSession();
            sesion.setAttribute("rectanguloSesion", recSesion);
            //Alcance de app
            ServletContext app = this.getServletContext();
            app.setAttribute("rectanguloAplicacion", recApp);
            //que se solicito
            request.setAttribute("mensaje", "Las variables fueron agregadas");
            //redireccionar jsp
            request.getRequestDispatcher("index.jsp").forward(request, response);

        } else if ("listarVariables".equals(accion)) {
            //Redireccionar al JSP que despliega las variables
            //getdispatcher propaga objetos de request y response
            request.getRequestDispatcher("WEB-INF/alcanceVariables.jsp").forward(request, response);
        } else {
            // Redireccionar a la pagina de incio
            request.setAttribute("mensaje", "Accion no proporcioanda o desconocidad");
            request.getRequestDispatcher("index.jsp").forward(request, response);

            /*reponse.sendRedirect("index,jsp") no comparte informacion */
        }

    }
}
