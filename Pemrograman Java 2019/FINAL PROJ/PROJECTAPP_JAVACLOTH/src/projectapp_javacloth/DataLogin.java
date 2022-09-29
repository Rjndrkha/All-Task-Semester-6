/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectapp_javacloth;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Njol~
 */
public class DataLogin extends login1{
    Connection conn;
    Statement stm;
    ResultSet rs;
    

    public Connection setKoneksi(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost/projectapp_javacloth","root","");
            stm=conn.createStatement();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Koneksi Gagal:"+e);
        }
        return conn;
    }
    @Override
    public boolean Validasi(String username, String password) {
        setKoneksi();
        LOGIN lgn = new LOGIN();
        try{
        String sql = "SELECT * FROM login WHERE username='"+lgn.txtusername.getText()+"' AND password='"+lgn.txtpw.getText()+"'";
        rs = stm.executeQuery(sql);
        if (username != null && password != null) {
            return true;
        }
        
        } catch(Exception e){
            JOptionPane.showMessageDialog(lgn,e.getMessage());
        }
    return false;
    }

    @Override
    public boolean cekData(String username, String password) {
        setKoneksi();
        LOGIN lgn = new LOGIN();
        try{
        String sql = "SELECT * FROM login WHERE username='"+lgn.txtusername.getText()+"' AND password='"+lgn.txtpw.getText()+"'";
        rs = stm.executeQuery(sql);
        if (username != null && password != null) {
            return true;
        }
        
        } catch(Exception e){
            JOptionPane.showMessageDialog(lgn,e.getMessage());
        }
    return false;
    }
}
