/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet2;

/**
 *
 * @author Rajendra Rakha
 */
public class TestMahasiswa {
    public static void main(String[] args) {
        
        Mahasiswa call1 = new Mahasiswa();
        call1.nim=101;
        call1.nama="Rajendra";
        call1.alamat="Sawojajar B3 C22";
        call1.kelas="2H";
        call1.tampilBiodata();
        System.out.println();
        
        Mahasiswa call2 = new Mahasiswa();
        call2.nim=102;
        call2.nama="Rio";
        call2.alamat="Turen Blok 22";
        call2.kelas="2H";
        call2.tampilBiodata();
        System.out.println();
        
        Mahasiswa call3 = new Mahasiswa();
        call3.nim=103;
        call3.nama="Alif";
        call3.alamat="Tumpang C3";
        call3.kelas="2H";
        call3.tampilBiodata();
        System.out.println();
    }
}



