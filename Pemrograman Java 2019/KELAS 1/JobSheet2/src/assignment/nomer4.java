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

class Data {
    //deklarasi global
    int x, y, width, height;

    void moveLeft(int M) {
        int g = M - 1;
        x = g;
    }

    void moveRight(int M) {
        int g = M + 1;
        x = g;
    }

    void moveUp(int V) {
        int f = V - 1;
        y = f;
    }

    void moveDown(int V) {//cara
        int f = V + 1;
        y = f;
    }

    void printPosisi() {
        System.out.println("Koordinat Terbaru : " + x + ", " + y);
    }

    void input() {//void untuk input
        Scanner sc = new Scanner(System.in);
        Data PM = new Data();
        System.out.print("Masukkan Lebar: ");
        PM.width = sc.nextInt();
        System.out.print("Masukkan Panjang: ");
        PM.height = sc.nextInt();
        System.out.print("Masukkan Koordinat X : ");
        PM.x = sc.nextInt();
        System.out.print("Masukkan Koordinat Y : ");
        PM.y = sc.nextInt();

        if ((PM.x > 0 && PM.x < PM.width) && (PM.y > 0 && PM.y < PM.height)) {
            PM.moveLeft(PM.x);//panggil .moveLeft
            PM.moveUp(PM.y);
            PM.printPosisi();

        }
    }
}

public class nomer4 {

    public static void main(String args[]) {
        Data muncul = new Data();//Menghubungkan Class
        muncul.input();//memanggil .input

    }
}

