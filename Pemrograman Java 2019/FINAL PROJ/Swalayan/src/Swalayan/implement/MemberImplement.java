/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swalayan.implement;

import Swalayan.dao.MemberDao;
import static Swalayan.implement.BarangImplement.buka_koneksi;
import static Swalayan.implement.KaryawanImplement.buka_koneksi;
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
public class MemberImplement implements MemberDao{

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
    public ResultSet getDataMember() {
        buka_koneksi();
        Statement s = null;
        ResultSet resultSet = null;
        try {
            s = koneksi.createStatement();
            String sql = "Select * from member";
            resultSet = s.executeQuery(sql);
            s.close();
        } catch (SQLException ex) {
            Logger.getLogger(MemberImplement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultSet; 
    }

    @Override
    public void insertDataMember(int idMember, String namaMember, String alamatMember) {
        buka_koneksi();
        String sqlkode = "Insert into member(idmember,namamember, alamat)"
                + "values('" + idMember + "',"
                + "'" + namaMember + "',"
                + "'" + alamatMember +"')";
        
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
    public void updateDataMember(int idMember, String namaMember, String alamatMember) {
       buka_koneksi();
        String sqlkode = "update member set "
                + "idmember=" + idMember + ","
                + "namamember='" + namaMember + "',"
                + "alamatmember=" + alamatMember +""
                + " where idmember = " + idMember;

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
    public void deleteDataMember(int idMember) {
        buka_koneksi();
        String sqlkode = "delete from member where idmember=" + idMember;

        try {
            PreparedStatement mStatement = koneksi.prepareStatement(sqlkode);
            mStatement.executeUpdate();
            mStatement.close();
            getDataMember();
            JOptionPane.showMessageDialog(null, "Data Berhasil dihapus !!!");

        } catch (SQLException ex) {
            Logger.getLogger(BarangImplement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
