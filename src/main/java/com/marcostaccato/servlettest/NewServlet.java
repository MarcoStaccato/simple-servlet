/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marcostaccato.servlettest;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Marco
 */
@WebServlet(name = "NewServlet", urlPatterns = {"/servlet1"})
public class NewServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html lang=\"en\">"); 
            out.println("<head>"); 
            out.println("<meta charset=\"UTF-8\">"); 
            out.println("<title>Just a servlet</title>"); 
            out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">"); 
            out.println("</head>"); 
            out.println("<body>"); 
            out.println("<div class=\"jumbotron\">"); 
            out.println("<div class=\"container\">"); 
            out.println("<a href=\"https://github.com/MarcoStaccato/simple-servlet\"><h1>github source</h1></a>"); 
            out.println("<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Laborum modi pariatur esse quia quo eius cum explicabo eveniet velit voluptas!</p>"); 
            out.println("</div>"); 
            out.println("</div>"); 
            out.println("<div class=\"container\">"); 
            out.println("<div class=\"col-md-4\">"); 
            out.println("<h1>Headings</h1>"); 
            out.println("<h1>h1 heading</h1>"); 
            out.println("<h2>h2 heading</h2>"); 
            out.println("<h3>h3 heading</h3>"); 
            out.println("</div>"); 
            out.println("<div class=\"col-md-4\">"); 
            out.println("<h1>unordered list</h1>"); 
            out.println("<div class=\"list-group\">"); 
            out.println("<ul>"); 
            out.println("<li class=\"list-group-item\">item1</li>"); 
            out.println("<li class=\"list-group-item\">item2</li>"); 
            out.println("<li class=\"list-group-item\">item3</li>"); 
            out.println("</ul>"); 
            out.println("</div>"); 
            out.println("</div>"); 
            out.println("<div class=\"col-md-4\">"); 
            out.println("<h1>table</h1>"); 
            out.println("<table class=\"table table-bordered table-striped\">"); 
            out.println("<thead>"); 
            out.println("<tr>"); 
            out.println("<th>head1</th>"); 
            out.println("<th>head2</th>"); 
            out.println("<th>head3</th>"); 
            out.println("</tr>"); 
            out.println("</thead>"); 
            out.println("<tbody>"); 
            out.println("<tr><td>data1</td><td>data2</td><td>data3</td></tr>"); 
            out.println("<tr><td>data1</td><td>data2</td><td>data3</td></tr>"); 
            out.println("<tr><td>data1</td><td>data2</td><td>data3</td></tr>"); 
            out.println("</tbody>"); 
            out.println("</table>"); 
            out.println("</div>"); 
            out.println("</div>"); 
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
