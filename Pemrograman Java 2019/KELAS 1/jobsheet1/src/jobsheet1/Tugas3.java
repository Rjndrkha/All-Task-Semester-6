/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet1;

/**
 *
 * @author Rajendra Rakha
 */


public class Tugas3 {

    public static void main(String args[]) {

        //membuat array
        String nama[] = {"M", "I", "S", "S", "I", "S", "S", "I", "P", "I"};//Memasukkan kata MISSISSIPI
        int M = 0, I = 0, S = 0, P = 0;//Deklarasi Default dari 0
        for (int a = 0; a < nama.length; a++) {//Looping .length untuk menghitung jumlah karakter
            switch(nama[a]){
                case "M":
                    M++;
                    break;
                case "I":
                    I++;
                    break;
                case "S":
                    S++;
                    break;
                case "P":
                    P++;
                    break;
            }
            
        }
                //OUTPUT
        System.out.println("Total Kata di 'MISSISSIPI' Adalah :");
        System.out.println("M : "+ M +"\nI  : "+ I +"\nS : "+ S +"\nP : "+ P);
    }
}
