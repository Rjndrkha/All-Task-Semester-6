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
public class Segitiga {

    private int sudut;

    public int totalSudut(int sudutA) {
        this.sudut = 180 - sudutA;
        return this.sudut;
    }

    public int totalSudut(int sudutA, int sudutB) {
        this.sudut = 180 - (sudutA + sudutB);
        return this.sudut;
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA * sisiB * sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        return Math.sqrt(Math.pow(sisiA, 2)) + Math.sqrt(Math.pow(sisiB, 2));
    }

    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();
        System.out.println("Total Sudut 1 parameter : " + segitiga.totalSudut(30));
        System.out.println("Total Sudut 2 parameter : " + segitiga.totalSudut(10, 20));
        System.out.println("Keliling 2 parameter : " + segitiga.keliling(10, 15));
        System.out.println("Keliling 3 parameter : " + segitiga.keliling(7, 8, 9));
    }
}
