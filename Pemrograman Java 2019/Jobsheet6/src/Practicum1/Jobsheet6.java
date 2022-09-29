/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicum1;

/**
 *
 * @author Rajendra Rakha
 */
class ClassA {

    public int x;
    public int y;

    public void getNilai() {
        System.out.println("Nilai x : " + x);
        System.out.println("Nilai Y : " + y);
    }

}

class ClassB extends ClassA{
    public int z;
    public void getNilai2(){
        System.out.println("Nilai z : "+z);
    }
    public void getJumlah(){
        System.out.println("Jumlah : "+(x+y+z));
    }
}

public class Jobsheet6{
    public static void main(String[] args) {
        
        ClassB hitung=new ClassB();
        hitung.x=20;
        hitung.y=30;
        hitung.z=5;
        hitung.getNilai();
        hitung.getNilai2();
        hitung.getJumlah();
    }
}
