/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lcrd.heroku.app;

/**
 *
 * @author laura
 */
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author laura
 */

@WebServlet(urlPatterns = {"/respuestas"})
public class Respuestas extends HttpServlet {

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
            out.println("[{\"id\":1,\"answer\":\"1. Se hace una prueba para ver que falla\n" +
            "2. Se hace un código básico para que la prueba pase\n" +
            "3. Se refactoriza ese código básico\"}\n" +
            ",{\"id\":2,\"answer\":\"get, post, put y delete\"}\n" +
            ",{\"id\":3,\"answer\":\"AJAX y XML\"}\n" +
            ",{\"id\":4,\"answer\":\"Es una función que pasa a otra función como argumento\"}\n" +
            ",{\"id\":5,\"answer\":\"Como registra los cambios de forma local y push actualiza remotamente\"}]");
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
    
     private void setAccessControlHeaders(HttpServletResponse resp) {
      resp.setHeader("Access-Control-Allow-Origin", "http://lcrd4unisabana.herokuapp.com/respuestas");
      resp.setHeader("Access-Control-Allow-Methods", "GET");
  }

}

