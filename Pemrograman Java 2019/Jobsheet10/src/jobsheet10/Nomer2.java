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
public class Nomer2 {
    void perkalian(int a ,int b){
        System.out.println("1. "+a*b);
    }
    void perkalian(double a,double b){
        System.out.println("2. "+a*b);
    }
    public static void main(String[] args) {
        Nomer2 call=new Nomer2();
        
        call.perkalian(25, 43);
        call.perkalian(34.56, 23.7);
    }
}
