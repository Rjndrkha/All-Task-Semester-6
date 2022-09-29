/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practikum;

/**
 *
 * @author Rajendra Rakha
 */
public class practicum1 {

    public static void main(String args[]) {
        System.out.println("Faktorial Rekursif : "+hitungFaktorialRekursif(5));
        System.out.println("Faktorial Iteratif : "+hitungFaktorialIteratif(5));
    }

    static int hitungFaktorialRekursif(int n) {
        if (n > 1) {
            return n * hitungFaktorialRekursif(n - 1);
        } else {
            return n;
        }
    }

    static int hitungFaktorialIteratif(int n) {
        int fakt = 1;
        for (int i = n; n >= 1; n--) {
            fakt = fakt * n;
        }
        return fakt;
    }
}
