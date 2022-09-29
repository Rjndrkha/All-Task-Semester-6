/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swalayan.implement;

import Swalayan.dao.BarangDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import Swalayan.GUI.Barang;

/**
 *
 * @author User
 */
public class BarangImplement implements BarangDao {

    private static Connection koneksi;

    public static void buka_koneksi() {
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/dbSwalayan";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
            } catch (SQLException t) {
                System.out.println("Error membuat koneksi");
            }
        }
    }

    @Override
    public ResultSet getDataBarang() {
        buka_koneksi();
        Statement s = null;
        ResultSet resultSet = null;
        try {
            s = koneksi.createStatement();
            String sql = "Select * from barang";
            resultSet = s.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(BarangImplement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultSet;
    }
    
    private void fillcombo(){
        Statement s = null;
        ResultSet resultSet = null;
        try {
            s = koneksi.createStatement();
            String sql = "Select * from barang";
            resultSet = s.executeQuery(sql);
            
            
        } catch (Exception e) {
        }
    }

    @Override
    public void insertDataBarang(int idBarang, String namaBarang, int Stok, int Harga) {
        buka_koneksi();
        String sqlkode = "Insert into barang(idBarang,namabarang,stok, harga)"
                + "values('" + idBarang + "',"
                + "'" + namaBarang + "',"
                + "'" + Stok + "',"
                + "'" + Harga + "')";
        try {
            PreparedStatement mStatement = koneksi.prepareStatement(sqlkode);
            mStatement.executeUpdate();
            mStatement.close();
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan !!!");
        } catch (SQLException ex) {
            Logger.getLogger(BarangImplement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void updateDataBarang(int idBarang, String namaBarang, int stok, int harga) {
        buka_koneksi();
        String sqlkode = "update barang set "
                + "idBarang=" + idBarang + ","
                + "namabarang='" + namaBarang + "',"
                + "stok=" + stok + ","
                + "harga=" + harga
                + " where idbarang = " + idBarang;

        try {
            PreparedStatement mStatement = koneksi.prepareStatement(sqlkode);
            mStatement.executeUpdate();
            mStatement.close();
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            JOptionPane.showMessageDialog(null, "Data Berhasil diubah !!!");
        } catch (SQLException ex) {
            Logger.getLogger(BarangImplement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteDataBarang(int idBarang) {
        buka_koneksi();
        String sqlkode = "delete from barang where idbarang=" + idBarang;
        try {
            PreparedStatement mStatement = koneksi.prepareStatement(sqlkode);
            mStatement.executeUpdate();
            mStatement.close();
            getDataBarang();
            JOptionPane.showMessageDialog(null, "Data Berhasil dihapus !!!");

        } catch (SQLException ex) {
            Logger.getLogger(BarangImplement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ResultSet ComboBox() {
        buka_koneksi();
        Statement s = null;
        ResultSet resultSet = null;
        try {
            s = koneksi.createStatement();
            String sql = "Select * from barang";
            resultSet = s.executeQuery(sql);
            
            while(resultSet.next()){
                String name = resultSet.getString("idBarang");
                //combo1.addItem(name);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(BarangImplement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultSet;
    }

}
