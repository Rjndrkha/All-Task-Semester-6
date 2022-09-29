/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swalayan.dao;

import java.sql.ResultSet;


/**
 *
 * @author User
 */
public interface BarangDao {
    public ResultSet getDataBarang();
    public void insertDataBarang(int idBarang, String namaBarang, int stok, int harga);
    public void updateDataBarang(int idBarang, String namaBarang, int stok, int harga);
    public void deleteDataBarang(int idBarang);
    public ResultSet ComboBox();
    
    
   
}
