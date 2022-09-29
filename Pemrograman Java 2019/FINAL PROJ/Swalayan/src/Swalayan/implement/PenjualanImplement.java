/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swalayan.implement;

import Swalayan.dao.PenjualanDao;
import static Swalayan.implement.BarangImplement.buka_koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class PenjualanImplement implements PenjualanDao{

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
    public ResultSet getDataPenjualan() {
        buka_koneksi();
        Statement s = null;
        ResultSet resultSet = null;
        try {
            s = koneksi.createStatement();
            String sql = "Select * from penjualan";
            resultSet = s.executeQuery(sql);
            s.close();
        } catch (SQLException ex) {
            Logger.getLogger(PenjualanImplement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultSet; 
    }    
}
