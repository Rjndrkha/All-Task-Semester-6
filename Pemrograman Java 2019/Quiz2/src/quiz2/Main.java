/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

/**
 *
 * @author Rajendra Rakha
 */

public class Main {
    public static void main(String[] args) {
        
        Manusia Manusia1 = new Manusia("Rajendra");
        JenisElektro Je= new JenisElektro("Laptop", 1000000);
        
        Manusia Manusia2 = new Manusia("Ariono");
        JenisBinatang Jb =new JenisBinatang("Kucing", 500000);
        
        Elektronik el=new Elektronik();
        Binatang bi=new Binatang();
        Manusia1.infoElek();
        Je.infoElek();
        System.out.println("--------------------------------------");
        Manusia2.infoBina();
        Jb.infoBina();
        System.out.println("--------------------------------------");
        
       
    }
}
