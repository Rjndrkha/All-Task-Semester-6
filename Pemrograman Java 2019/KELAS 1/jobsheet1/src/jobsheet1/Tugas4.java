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
import java.util.*;

class Menu {
    
    Scanner sc = new Scanner(System.in);
    int sisi, cara2;//Declare Variable Global
    double phi = 3.15, cara1, alas, tinggi;

    public void luasSegitiga() {//Rumus Luas Segitiga
        System.out.println("==Perhitungan Luas Segitiga==");
        System.out.print("Input Alas: ");
        alas = sc.nextDouble();
        System.out.print("Input Tinggi: ");
        tinggi = sc.nextDouble();
        cara1 = 0.5 * (alas * tinggi);
        System.out.println("Luas Segitiga Adalah : " + cara1);
        System.out.println();
    }

    public void luasSegiempat() {//Rumus Luas Persegi
        System.out.println("==Perhitungan Luas Segiempat==");
        System.out.println("Input Sisi: ");
        sisi = sc.nextInt();
        cara2 = sisi * 4;
        System.out.println("Luas Segiempat Adalah: " + cara2);
        System.out.println();
    }

    public void luasLingkaran() {//Rumus Lingkaran
        System.out.println("==Perhitungan Luas Lingkaran==");
        System.out.println("Input Jari Jari Lingkaran: ");
        int jari = sc.nextInt();
        double cara3 = phi * (jari * jari);
        System.out.println("Luas Lingkaran Adalah: " + cara3);
        System.out.println();
    }
}

public class Tugas4 {

    public static void main(String[] args) {
        int menu;
        Menu data = new Menu();//Menghubungkan Class Menu
        do {
            System.out.println("---------------------------------");
            System.out.println("            Menu Perhitungan             ");
            System.out.println("----------------------------------");
            System.out.println(" 1. Menghitung Luas Segitiga ");
            System.out.println(" 2. Menghitung Luas Segiempat ");
            System.out.println(" 3. Menghitung Luas Lingkaran ");
            System.out.println(" 4. EXIT");

            System.out.println("");
            System.out.println("===================================");
            System.out.println("");
            Scanner pilih = new Scanner(System.in);
            System.out.print("Enter Menu Options = ");
            menu = pilih.nextInt();
            System.out.println("");

            switch (menu) {
                case 1: {
                    System.out.println("Menu - 1. Luas Segitiga ");
                    System.out.println("------------------------");
                    data.luasSegitiga();//Menghubungkan Dengan Rumus Segitiga
                }
                break;
                case 2: {
                    System.out.println("Menu - 2. LuasSegiempat ");
                    System.out.println("------------------------");
                    data.luasSegiempat();//Menghubungkan Dengan Rumus Persegi
                }
                break;
                case 3: {
                    System.out.println("Menu - 3. Luas Lingkaran ");
                    System.out.println("------------------------");
                    data.luasLingkaran();//menghubungkan Dengan Rumus Luas Lingkaran
                }
                break;
            }
        } while (menu > 0 && menu < 4);//Looping apabila pilih 4 programm end

        System.out.println("==========================================  ");
        System.out.println("                   THANK YOU                        ");
        System.out.println("                Rajendra Rakha A.P                 ");
        System.out.println("==========================================  ");
    }
}
