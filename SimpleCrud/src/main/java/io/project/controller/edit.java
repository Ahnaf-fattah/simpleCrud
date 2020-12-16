/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.project.controller;

import io.project.dao.impSales;
import io.project.dao.salesDAO;
import io.project.model.sales;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author naaff 
 */
@WebServlet(urlPatterns = "/edit")
public class edit extends HttpServlet{
    salesDAO dao = new impSales();
    sales Sales = new sales();
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("ID");
        
        HttpSession session = req.getSession();
        session.setAttribute("id", id);
               
        
        RequestDispatcher rd = req.getRequestDispatcher("edit.jsp");
        rd.include(req, resp);
                
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("");
        System.out.println("Edit data Running....");
        System.out.println("");
        
        Sales.setID(req.getParameter("id"));
        Sales.setBarang(req.getParameter("barang"));
        Sales.setJumlah(req.getParameter("jumlah"));
        
        dao.editSales(Sales);
        
        resp.sendRedirect("simplecrud");

                
    }
    
    
    
    
}
