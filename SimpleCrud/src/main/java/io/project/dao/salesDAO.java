/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.project.dao;

import io.project.model.sales;
import java.util.List;

/**
 *
 * @author naaff
 */

public interface salesDAO {
    
    public void addStuff(sales Sales);
    
    public List <sales> getAllSales();
    
    public void generateID(sales Sales);
    
    public void editSales(sales Sales);
    
    public void deleteSales(sales Sales);
}
