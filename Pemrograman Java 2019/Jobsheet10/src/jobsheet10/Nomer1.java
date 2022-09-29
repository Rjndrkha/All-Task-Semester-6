/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet10;

/**
 *
 * @author Rajendra Rakha
 */
public class Nomer1 {

    void perkalian(int a, int b) {
        System.out.println("1." + a * b);

    }

    void perkalian(int a, int b, int c) {
        System.out.println("2." + a * b * c);
    }
    public static void main(String[] args) {
        Nomer1 call =new Nomer1();
        
        call.perkalian(25, 43);
        call.perkalian(5, 10, 15);
    }
}
