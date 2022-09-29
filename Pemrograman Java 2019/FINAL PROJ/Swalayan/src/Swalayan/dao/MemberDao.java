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
public interface MemberDao {
    public ResultSet getDataMember();
    public void insertDataMember(int idMember, String namaMember, String alamatMember);
    public void updateDataMember(int idMember, String namaMember, String alamatMember);
    public void deleteDataMember(int idMember);
}
