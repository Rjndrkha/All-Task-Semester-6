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
import java.util.*;

public class nomer1 {
    //membuat variabel global
    public double phi = 3.14;
    public double r;

    double hitungLuas() {//cara
        return phi * r * r;
    }

    double hitungKeliling() {//cara
        return 2 * phi * r * r;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);//inisialisasi utk input data
        nomer1 lingkaran = new nomer1();//membuat variabel lingkaran

        System.out.print("Input Jari Jari= ");
        lingkaran.r = sc.nextDouble();
        System.out.println();
        System.out.println("Luas : " + lingkaran.hitungLuas());//memanggil .hitungLus
        System.out.println("Keliling : " + lingkaran.hitungKeliling());//memanggil .hitungKeliling
    }
}
