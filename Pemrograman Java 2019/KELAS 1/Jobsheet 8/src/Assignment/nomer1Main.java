/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

/**
 *
 * @author Rajendra Rakha
 */
public class nomer1Main {

    public static void main(String[] args) {
        //instansiasi objek//
        nomer1 tumpukan = new nomer1(6);
        //pengisian data pada Stack dengan cara memanggil method push//
        tumpukan.push("merah");
        tumpukan.push("kuning");
        tumpukan.push("hijau");
        tumpukan.push("biru");
        tumpukan.push("putih");
        tumpukan.push("hitam");
        //menampilkan data yang telah diisikan//
        tumpukan.print();
        //pemanggilan method pop untuk mengeluarkan sebuah data//
        tumpukan.pop();
        //cek data teratas dengan method peek//
        tumpukan.peek();
        //menampilkan kembali seluruh data//
        tumpukan.print();
    }
}
