/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepedademo;

/**
 *
 * @author Rajendra Rakha
 */
public class libraryDemo {

    public static void main(String[] args) {

        library call1 = new library();
        library call2 = new library();

        call1.setTitle("Kewarganegaraan");
        call1.Stok(5);
        call1.setPeminjam("Rajendra");
        call1.krgStok(1);
        call1.cetakStatue();

        System.out.println();

        call2.setTitle("Agama");
        call2.Stok(5);
        call2.setPeminjam("Ariono");
        call2.krgStok(1);
        call2.cetakStatue();
    }
}
