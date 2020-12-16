/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.project.model;

/**
 *
 * @author naaff
 */

public class sales {
    
    private String ID;
    private String barang;
    private String jumlah;

    public sales() {
    }
    
    
    public sales(String ID, String barang, String jumlah) {
        this.ID = ID;
        this.barang = barang;
        this.jumlah = jumlah;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getBarang() {
        return barang;
    }

    public void setBarang(String barang) {
        this.barang = barang;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    @Override
    public String toString() {
        return "sales{" + "ID=" + ID + ", barang=" + barang + ", jumlah=" + jumlah + '}';
    }
    
    
    
    
    
}
