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
public interface KaryawanDao {
    public ResultSet getDataKaryawan();
    public void insertDataKaryawan(int idKaryawan, String nama, String username, String password);
    public void updateDataKaryawan(int idKaryawan, String nama, String username, String password);
    public void deleteDataKaryawan(int idKaryawan);
}
