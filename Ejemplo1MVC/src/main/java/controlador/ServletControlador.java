package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import modelo.Rectangulo;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        //Procesamos parametros
        
        //Creamos los javaBeans
        Rectangulo rec = new Rectangulo(3,6);
        
        //Agregamos al JavaBeans a algun alcance 
        request.setAttribute("mensaje", "saludos desde el servlet");
        HttpSession sesion = request.getSession();
        sesion.setAttribute("rectangulo", rec);
        
        //redirrecionamos a la vista seleccionada
        RequestDispatcher rd = request.getRequestDispatcher("vista/desplegarVariables.jsp");
        rd.forward(request, response);
    }
}
