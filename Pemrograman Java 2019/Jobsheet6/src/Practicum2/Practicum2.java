/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicum2;

/**
 *
 * @author Rajendra Rakha
 */
class ClassA {

    int x;
    int y;

    public void setX(int x) {
        this.x = x;

    }

    public void setY(int y) {
        this.y = y;
    }

    public void getNilai() {
        System.out.println("Nilai x: " + x);
        System.out.println("Nilai y: " + y);

    }
}

class ClassB extends ClassA {

    private int z;

    public void setZ(int z) {
        this.z = z;
    }

    public void getNilaiZ() {

        System.out.println("Nilai z: " + z);

    }

    public void getJumlah() {
        System.out.println("Jumlah: " + (x + y + z));
    }
}

public class Practicum2 {

    public static void main(String[] args) {
        ClassB hitung = new ClassB();
        hitung.setX(20);
        hitung.setY(30);
        hitung.setZ(5);

        hitung.getNilai();
        hitung.getNilaiZ();
        hitung.getJumlah();
    }
}
