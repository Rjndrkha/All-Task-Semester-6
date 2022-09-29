/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rajendra Rakha
 */
public class StackMain {
    public static void main(String[] args) {
        //instansiasi objek//
        stack tumpukan = new stack(6);
        //pengisian data pada Stack dengan cara memanggil method push//
        tumpukan.push(15);
        tumpukan.push(31);
        tumpukan.push(9);
        tumpukan.push(12);
        tumpukan.push(17);
        tumpukan.push(98);
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
