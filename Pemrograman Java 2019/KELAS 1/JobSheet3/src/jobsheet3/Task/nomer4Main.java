/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet3.Task;

/**
 *
 * @author Rajendra Rakha
 */
public class nomer4Main {

    public int paslon1, paslon2, paslon3, paslon4, suara[], n;

    nomer4Main(int n) {
        this.n = n;//Kata kunci this digunakan sebagai referensi dari class itu sendiri.
        this.suara = new int[n];
    }

    int pemilihan(int a) {//Cara DC
        if (a == n) {
            return 0;
        } else {
            if (suara[a] == 1) {
                paslon1 += 1;
            } else if (suara[a] == 2) {
                paslon2 += 1;
            } else if (suara[a] == 3) {
                paslon3 += 1;
            } else if (suara[a] == 4) {
                paslon4++;
            }
            return pemilihan(a + 1);
        }
    }
}
