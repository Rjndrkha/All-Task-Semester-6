/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_rajendra;

/**
 *
 * @author Rajendra Rakha
 */
public class DataClass {

    public String bookName, author, Penerbit;
    public int ISBN, stock;

    public DataClass(String name, int isbn, String pemilik, String penerbit, int stk) {
        ISBN = isbn;
        bookName = name;
        author = pemilik;
        Penerbit = penerbit;
        stock = stk;
    }

    public void print() {
        System.out.println("Name: " + bookName);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Pemilik: " + author);
        System.out.println("Penerbit: " + Penerbit);
        System.out.println("Stock: " + stock);
    }

}
