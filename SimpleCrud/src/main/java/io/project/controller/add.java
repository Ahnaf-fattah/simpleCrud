/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.project.controller;

import io.project.dao.impSales;
import io.project.dao.salesDAO;
import io.project.model.sales;
import io.project.util.generateID;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author naaff
 */
@WebServlet(urlPatterns = "/add")
public class add extends HttpServlet{
    sales Sales = new sales();
    salesDAO dao = new impSales();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        addData(req, resp);
    }
    
    
    
    @Override 
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        redirectPage(req, resp);
        
    }
    
    public void redirectPage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("add.jsp");
        requestDispatcher.forward(req, resp);
    }
    
     public void addData(HttpServletRequest request, HttpServletResponse response) throws  ServletException, IOException{
        System.out.println("");
        System.out.println("Add Data Running");
        System.out.println("");
        
        String barang = request.getParameter("barang");
        String jumlah = request.getParameter("jumlah");
        
        //  Melakukan Cek, apakah Data barang dan jumlah, sudah tertangkap
//        System.out.println(barang);
//        System.out.println(jumlah);
        

        //Melakukan Geneate id
        dao.generateID(Sales);
        generateID GenerateID = new generateID(Sales);
        
        Sales.setBarang(barang);
        Sales.setJumlah(jumlah);
        
        //  Melakukan Cek, apakah Data barang dan jumlah, sudah Masuk ke package MOdel
//        System.out.println(Sales.getBarang());
//        System.out.println(Sales.getJumlah());
       
       dao.addStuff(Sales);
       
//       RequestDispatcher rd = request.getRequestDispatcher("/");
//       rd.include(request, response);
       
        response.sendRedirect("simplecrud");
       
        
    }
     
      
     
    
     
    
    
    
}