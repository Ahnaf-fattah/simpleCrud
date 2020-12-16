package io.project.controller;

import io.project.dao.impSales;
import io.project.dao.salesDAO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naaff
 */

@WebServlet(urlPatterns = "/")
public class home extends HttpServlet{
    salesDAO SalesDAO = new impSales();
    
     protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
           RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
           rd.forward(req, resp);
     }
    
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
           
//           HttpSession session = req.getSession();
//           session.setAttribute("sales", SalesDAO.getAllSales());

           req.setAttribute("Sales", SalesDAO.getAllSales());
           
           RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
           rd.forward(req, resp);
    }
    
}
