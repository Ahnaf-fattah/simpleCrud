/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.project.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author naaff
 */
public class databaseUtility {
    
    
    public static Connection getConnection(){
        
        //Set paramater koneksi di Database kleann....
        String user="naf";
        String password="om906la";
        String url="jdbc:mysql://localhost:3306/crudApp";
        String driver="com.mysql.cj.jdbc.Driver";
        
        //Buat Koneksi.... 
        Connection connection = null;
        try{
            Class.forName(driver);
            connection = DriverManager.getConnection(url,user,password);
            System.err.println("Koneksi Tersambung....");
            
        }catch(ClassNotFoundException e){
            e.printStackTrace();
            System.err.println("ups... Koneksi Tidak Tersambung !");
        }
        catch(SQLException e){
            e.printStackTrace();
            System.err.println("ups... Koneksi Tidak Tersambung !");
        }
        
        return connection;
    }
    
////        Cek dahulu Koneksi ANDA !!!
//        public static void main(String[] args) {
//        Connection connection = getConnection();
//    }

}