/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author Rajendra Rakha
 */
public class DataClass {

    public String Nama,author,penerbit;
    
    public int ISBN,stok;
    

    void tampil() {
        System.out.println("Nama Buku = " + Nama);
        System.out.println("Author = " + author);
        System.out.println("Penerbit = " + penerbit);
        System.out.println("ISBN = " + ISBN);
        System.out.println("Stok = "+stok);
    }

}
