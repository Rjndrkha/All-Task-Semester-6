/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet2;

/**
 *
 * @author Rajendra Rakha
 */
class Lingkaran {

    public double phi;
    public double r;

    public double hitungLuas() {
        double luas = phi * r * r;
        return luas;
    }

    public double hitungKeliling() {
        double keliling = 2 * phi * r;
        return keliling;
    }
}

public class Circle {

    public static void main(String[] args) {
        Lingkaran call = new Lingkaran();
        
        call.phi = 22.7;
        call.r = 14;
        
        double keliling = call.hitungKeliling();
        double luas = call.hitungLuas();
        System.out.println("       PROGRAM PERHITUNGAN \n"
                + "   LUAS & KELILING LINGKARAN ");
        System.out.println("\n----------------------------");
        System.out.println("Phi\t: " + call.phi);
        System.out.println("Jari-jari\t: " + call.r);
        System.out.println("----------------------------");
        System.out.println("Luas lingkaran  : " + luas);
        System.out.println("Luas keliling     : " + keliling);
        System.out.println("----------------------------");
    }
}


