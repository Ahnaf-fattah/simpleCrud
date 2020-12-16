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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author naaff
 */
@WebServlet(urlPatterns = "/del")
public class delete extends HttpServlet{
    sales Sales = new sales();
    salesDAO da0 = new impSales();
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        Sales.setID(req.getParameter("ID"));
        da0.deleteSales(Sales);
        
        resp.sendRedirect("simplecrud");

    }
    
}
