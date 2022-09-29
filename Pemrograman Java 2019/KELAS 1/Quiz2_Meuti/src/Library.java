/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MeiMei
 */
public class Library {
    String name, author; 
    int stock;
     Library next;

    public Library(String name, String author, int stock, Library next) {
        this.name = name;
        this.author = author;
        this.stock = stock;
        this.next = next;
    }    
}
