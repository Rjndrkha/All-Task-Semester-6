/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rajendra Rakha
 */
import java.util.*;

public class StackModif {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah isi stack: ");
        int n = sc.nextInt();
        int data[] = new int[n];
        stack tumpukan = new stack(n);
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan isi stack ke-" + (i + 1) + " : ");
            data[i] = sc.nextInt();
            tumpukan.push(data[i]);
        }
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
