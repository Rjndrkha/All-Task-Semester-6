/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculate;

/**
 *
 * @author Rajendra Rakha
 */
import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import static java.lang.Math.sqrt;

class BangunDatar {

    public float luas() {
        return 0;
    }

    public float keliling() {
        return 0;

    }
}

class Segitiga extends BangunDatar {

    public float alas;
    public float tinggi;

    @Override
    public float luas() {
        float luas = (alas * tinggi) / 2;
        System.out.println("Luas Segitiga\t: " + luas);
        return luas;
    }

    @Override
    public float keliling() {
        float m = (float) sqrt((alas * alas) + (tinggi * tinggi));
        float keliling = m + alas + tinggi;
        System.out.printf("Keliling Segitiga\t: %.2f\n", keliling);
        return keliling;
    }
}

class PersegiPanjang extends BangunDatar {

    public float lebar;
    public float panjang;

    @Override
    public float luas() {
        float luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang\t: " + luas);
        return luas;
    }

    @Override
    public float keliling() {
        float kll = 2 * panjang + 2 * lebar;
        System.out.println("Keliling Persegi Panjang\t: " + kll);
        return kll;
    }
}

class Lingkaran extends BangunDatar {

    public float r;

    @Override
    public float luas() {
        float luas = (float) (Math.PI * r * r);
        System.out.printf("Luas lingkaran\t: %.2f\n", luas);
        return luas;
    }

    @Override
    public float keliling() {
        float keliling = (float) (2 * Math.PI * r);
        System.out.printf("Keliling Lingkaran\t: %.2f\n", keliling);
        return keliling;
    }
}

public class Calculate {

    public static void main(String[] args) {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("------" + formattedDate + "------");
        System.out.println("      ---------WELCOME----------");
        System.out.println("               Rajendra Rakha A.P\n");

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        Lingkaran lingkaran = new Lingkaran();
        Segitiga segitiga = new Segitiga();
        Scanner sc = new Scanner(System.in);

        // Persegi Panjang
        System.out.println("----Persegi panjang----");
        System.out.print("Input Panjang \n>> ");
        float pp = sc.nextFloat();
        System.out.print("Input Lebar \n>> ");
        float pl = sc.nextFloat();

        // Lingkaran
        System.out.println("\n----Lingkaran----");
        System.out.print("Input Jari-Jari \n>> ");
        float jr = sc.nextFloat();

        // Segitiga
        System.out.println("\n----Segitiga----");
        System.out.print("Input Alas \n>> ");
        float sa = sc.nextFloat();
        System.out.print("Input Tinggi \n>> ");
        float st = sc.nextFloat();

        System.out.println("\n-----------Luas & Keliling Persegi Panjang-----------");

        persegiPanjang.lebar = pp;
        persegiPanjang.panjang = pl;
        persegiPanjang.luas();
        persegiPanjang.keliling();
        System.out.println("----------------------------------------------------\n");

        System.out.println("\n--------------Luas & Keliling Lingkaran--------------");

        lingkaran.r = jr;
        lingkaran.luas();
        lingkaran.keliling();

        System.out.println("----------------------------------------------------\n");

        System.out.println("\n---------------Luas & Keliling Segitiga---------------");
        segitiga.alas = sa;
        segitiga.tinggi = st;
        segitiga.luas();
        segitiga.keliling();

        System.out.println("----------------------------------------------------\n");
    }

}
