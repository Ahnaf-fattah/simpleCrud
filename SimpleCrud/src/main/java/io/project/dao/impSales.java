/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.project.dao;


import io.project.model.sales;
import io.project.util.databaseUtility;
import io.project.util.generateID;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.Null;


/**
 *
 * @author naaff
 */
public class impSales implements salesDAO{
    
    @Override
    public void addStuff(sales Sales) {
        System.out.println("Add stuff Running...");
        System.out.println(Sales.getBarang());
        try(Connection connect = databaseUtility.getConnection()){
                System.err.println(Sales.getID());
                System.err.println(Sales.getBarang());
                
//                Sales.setID(GenerateID.generate());
                
                String query = "insert into sales values(?,?,?)";
                PreparedStatement preparedStatement = connect.prepareStatement(query);
                preparedStatement.setString(1, Sales.getID());
                preparedStatement.setString(2, Sales.getBarang());
                preparedStatement.setString(3, Sales.getJumlah());
                preparedStatement.executeUpdate();
            
        }
        catch(SQLException e){
            e.printStackTrace();
            System.err.println("Dao Error");
        }
    }

    @Override
    public List<sales> getAllSales() {
        List<sales> Sales = new ArrayList<sales>();
        
        try(Connection connect = databaseUtility.getConnection()) {
            String sql = "select id,barang,jumlah from sales";
            PreparedStatement preparedStatement = connect.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {                
                sales Salesobj = new sales();
                Salesobj.setID(resultSet.getString("id"));
                System.err.println(Salesobj.getID());
                
                Salesobj.setBarang(resultSet.getString("barang"));
                System.err.println(Salesobj.getBarang());
                
                Salesobj.setJumlah(resultSet.getString("jumlah"));
                System.err.println(Salesobj.getJumlah());
                
                Sales.add(Salesobj);
            }
        } 
        
        catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Maaf, Terjadi kesalahan di Proses penampilanDATA"+e.getMessage());
        }
        
        return Sales;
    }

    @Override
    public void generateID(sales Sales) {
        System.out.println("");
        System.out.println("Generate ID (Inpl Sales) is Running....");
        System.out.println("");
        
        try(Connection connection = databaseUtility.getConnection()) {
            
            String sql = "select id from sales";
            
            PreparedStatement ps = connection.prepareStatement(sql);
            
            ResultSet resultSet = ps.executeQuery();
            
            while(resultSet.next()){
                Sales.setID(resultSet.getString("ID"));
            }
            
        } catch (SQLException e) {
            System.out.println("");
            System.out.println("Generate ID (Inpl Sales) is Error....");
            System.out.println("");
            
            System.out.println(e.getMessage());
        }
    }
    
    public void editSales(sales Sales) {
        System.out.println("");
        System.out.println("Edit Sales Error");
        System.out.println("");
        
        try(Connection connection = databaseUtility.getConnection()) {
            String sql = "update sales set barang=? where id =?;";
            PreparedStatement preparestatStatement = connection.prepareStatement(sql);
            preparestatStatement.setString(1, Sales.getBarang());
            preparestatStatement.setString(2, Sales.getID());
            preparestatStatement.executeUpdate();
            
            sql = "update sales set jumlah=? where id =?;";
            preparestatStatement = connection.prepareStatement(sql);
            preparestatStatement.setString(1, Sales.getJumlah());
            preparestatStatement.setString(2, Sales.getID());
            preparestatStatement.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("");
            System.out.println("Edit Sales Error");
            System.out.println("");
            
            System.out.println(e.getMessage());
                                    
        }
    }

    @Override
    public void deleteSales(sales Sales) {
        try(Connection connection = databaseUtility.getConnection()) {
            String sql = "delete from sales where id=?;";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, Sales.getID());
            ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("");
            System.out.println("Delete Sales Error");
            System.out.println("");
            System.out.println(e.getMessage());
        }
    }
    
    
}
