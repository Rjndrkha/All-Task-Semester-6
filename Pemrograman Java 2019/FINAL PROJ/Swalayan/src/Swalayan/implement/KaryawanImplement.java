/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swalayan.implement;

import Swalayan.dao.KaryawanDao;
import static Swalayan.implement.BarangImplement.buka_koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class KaryawanImplement implements KaryawanDao{

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
    public ResultSet getDataKaryawan() {
        buka_koneksi();
        Statement s = null;
        ResultSet resultSet = null;
        try {
            s = koneksi.createStatement();
            String sql = "Select * from karyawan";
            resultSet = s.executeQuery(sql);
            s.close();
        } catch (SQLException ex) {
            Logger.getLogger(KaryawanImplement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultSet; 
    }

    @Override
    public void insertDataKaryawan(int idKaryawan, String nama, String username, String password) {
        buka_koneksi();
        String sqlkode = "Insert into karyawan(idkaryawan,namakaryawan,username, password)"
                + "values('" + idKaryawan + "',"
                + "'" + nama + "',"
                + "'" + username + "',"
                + "'" + password + "')";
        
        try {
            PreparedStatement mStatement = koneksi.prepareStatement(sqlkode);
            mStatement.executeUpdate();
            mStatement.close();
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        } catch (SQLException ex) {
            Logger.getLogger(KaryawanImplement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void updateDataKaryawan(int idKaryawan, String nama, String username, String password) {
        buka_koneksi();
        String sqlkode = "update karyawan set "
                + "idkaryawan=" + idKaryawan + ","
                + "nama='" + nama + "',"
                + "username='" + username + "',"
                + "password='" + password + "'"
                + " where idkaryawan = " + idKaryawan;

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
    public void deleteDataKaryawan(int idKaryawan) {
        buka_koneksi();
        String sqlkode = "delete from karyawan where idbarang=" + idKaryawan;
        try {
            PreparedStatement mStatement = koneksi.prepareStatement(sqlkode);
            mStatement.executeUpdate();
            mStatement.close();
            getDataKaryawan();
            JOptionPane.showMessageDialog(null, "Data Berhasil dihapus !!!");
        } catch (SQLException ex) {
            Logger.getLogger(BarangImplement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
