/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.project.util;

import io.project.model.sales;

/**
 *
 * @author naaff
 */
public  class generateID  {
    public static int secID=22;
    sales Sales = new sales();
    
    // Menampung sebuah data dari database
    String id;
    
    public generateID(sales Sales) {
        
        System.out.println();
        System.out.println("generateID class is Running....");
        System.out.println();
        
        this.Sales = Sales;
        
        System.out.println(Sales.getID());

        generate(Sales.getID()); 
    }
    
    public  String generate(String id){
        String stringID = null;
        int intID = 0;
                
        // Split the ID form Database
        String [] splitID = id.split("(?<=\\D)(?=\\d)");
        
        stringID = splitID[0];
        intID =  Integer.parseInt(splitID[1]);
        
        //Cek sebuah splitID sudah terpisah
//        System.out.println(stringID);
//        System.out.println(intID);
        
        intID++;
        id = stringID+intID;
        
//        System.out.println(id);
        
        Sales.setID(id);
        
        //Cek Apakah variable Sudah tergabung dan di Increment
        System.out.println(Sales.getID());
        
        return id;
    }
    
//    public static void main(String[] args) {
//        String nama = "Ahnaf Fattah";
//        
//        System.out.println(nama);
//        
//        
//        String [] pisah= nama.split("//s");
//        
//        for(String w:pisah){
//        System.out.print(w);
//        System.out.print(" ");
//        }
//    }   
}
