/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theory;

/**
 *
 * @author Rajendra Rakha
 */
public class TestBayaran {
    public static void main(String[] args) {
        
        Manajer man=new Manajer("Agus",800,50);
        Programmer prog=new Programmer("Budi", 600, 30);
        Bayaran br=new Bayaran();
        
        System.out.println("Bayaran Untuk Manager: $"+br.hitungBayaran(man));
        System.out.println("Bayaran Untuk Programmer: $"+br.hitungBayaran(prog));
    }
}
