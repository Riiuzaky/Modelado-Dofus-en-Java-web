/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Logica.*;

/**
 *
 * @author Estudiantes
 */
public class Dofus extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        Clase personaje = null;
        
        switch (request.getParameter("Raza")) {
            case "Yopuka":
                personaje = new Yopuka();
            break;
            case "Ocra":
                personaje = new Ocra();
             break;
            case "Sacro":
                personaje = new Sacro();
            break;
            
            
        }
        
        switch (request.getParameter("Escudo")){
            case "Hispanico":
                personaje.setEscudo(new EscudoHispanico());
            break;
            case "Minotobola":
                personaje.setEscudo(new EscudoDeLaMinotobola());
            break;
            case "CapitanAmakna":
                personaje.setEscudo(new EscudoDelCapitanAmakna());
            break;      
        }
        
        switch (request.getParameter("Sombrero")){
            case "Objevivo":
                personaje.setSombrero(new SombreroObjevivo());
            break;
            case "Gultar":
                personaje.setSombrero(new SomberoDelGultar());
            break;
            case "Robleblando":
                personaje.setSombrero(new SombreroDelRobleblando());
            break;      
        }
        
        switch (request.getParameter("Capa")){
            case "No":
                personaje.setCapa(new CapaDeNo());
            break;
            case "Velotinta":
                personaje.setCapa(new CapaDeVeloTinta());
            break;
            case "Maxilubo":
                personaje.setCapa(new CapaDeMaxilubo());
            break;      
        }
        
       
        
        

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Dofus</title>");
            out.println("<link rel=stylesheet href=estilos2.css>");
            out.println("</head>");
            out.println("<body>");
            out.println("<Div>");
            out.println("<center><h1> Usted a Creado la Siguiente raza y Asigno el Siguiente Equipo  </h1><br/><br/><br/></center>");
            out.println("<center><table class=\"egt\" BGCOLOR=\"White\">");
            out.println("<tr>");
            out.println("<td>");
            out.println("<img src=\""+personaje.getSombrero().getRutaimagen()+"\">");
            out.println("</td>");
            out.println("<td rowspan=\"3\">");
            out.println("<img src=\""+personaje.getRutaimagen()+"\">");
            out.println("</td>");
            out.println("<td> ");
            out.println("<p> Raza: " + personaje.getPoder()   +   "<br/><br/> Efecto Sombrero: " + personaje.getSombrero().getEfecto()  + " </p>" );
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<img src=\""+personaje.getEscudo().getRutaimagen()+"\">");
            out.println("</td>");
           
            out.println("<td> ");
            out.println("<p> Efecto Escudo: " + personaje.getEscudo().getEfecto()    +   "</p>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<img src=\""+personaje.getCapa().getRutaimagen()+"\">");
            out.println("</td>");
            
            out.println("<td> ");
            out.println("<p> Efecto Capa: " + personaje.getCapa().getEfecto()    +   "</p>");
            out.println("</td>");
            out.println("</tr>");
            out.println("</table></center>");
            out.println("<Div>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
