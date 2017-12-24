package Servlets;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet (name = "Servlet", urlPatterns = {"/Servlet"})

public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("Metodo doGet no soportado en el servlet");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Leemos los parametros del formulario
        //Por default el formulario nes de tipo get
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        
        //Se muestra en consola glassfish
        System.out.println("Usuario: "+usuario);
        System.out.println("Password: "+password);
        
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("El parametro usuario es: "+usuario);
        out.println("<br>");
        out.println("El parametro password es: "+password);
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
    
    
}