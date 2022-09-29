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
public class Calculator {

    public float getAngka1() {
        return Angka1;
    }

    public void setAngka1(float Angka1) {
        this.Angka1 = Angka1;
    }

    public float getAngka2() {
        return Angka2;
    }

    public void setAngka2(float Angka2) {
        this.Angka2 = Angka2;
    }

    private float Angka1;
    private float Angka2;
    private float hasil;

    public void Kali() {
        hasil = Angka1 * Angka2;
        System.out.print(hasil);
    }

    public void Tambah() {
        hasil = Angka1 + Angka2;
        System.out.print(hasil);
    }

    public void Bagi() {
        hasil = Angka1 / Angka2;
        System.out.print(hasil);
    }

    public void Kurang() {
        hasil = Angka1 - Angka2;
        System.out.print(hasil);
    }

    public void info() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input Angka 1  : ");
        int inp1=sc.nextInt();
        setAngka1(inp1);
        System.out.println("Input Angka 2 : ");
                
        setAngka1(Angka1);
        System.out.println("Angka1 = " + Angka1);
        System.out.println("Angka2 = " + Angka2);
        System.out.print("Hasil Kali = "  );
        Kali();
        System.out.println();
        System.out.print("Hasil Tambah = ");
        Tambah();
        System.out.println();
        System.out.print("Hasil Bagi = ");
        Bagi();
        System.out.println();
        System.out.print("Hasil Kurang =");
        Kurang();

    }
    public static void main(String[] args) {
        Calculator call=new Calculator();
        call.info();
    }

}


