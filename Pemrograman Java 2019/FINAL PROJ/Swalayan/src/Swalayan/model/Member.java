/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swalayan.model;

/**
 *
 * @author Rimuru
 */
public class Member {
    public int idMember;
    public String namaMember, alamatMember;

    public Member() {
    }

    public Member(int idMember, String namaMember, String alamatMember) {
        this.idMember = idMember;
        this.namaMember = namaMember;
        this.alamatMember = alamatMember;
    }

    public int getIdMember() {
        return idMember;
    }

    public void setIdMember(int idMember) {
        this.idMember = idMember;
    }

    public String getNamaMember() {
        return namaMember;
    }

    public void setNamaMember(String namaMember) {
        this.namaMember = namaMember;
    }

    public String getAlamatMember() {
        return alamatMember;
    }

    public void setAlamatMember(String alamatMember) {
        this.alamatMember = alamatMember;
    }
    
    
}
