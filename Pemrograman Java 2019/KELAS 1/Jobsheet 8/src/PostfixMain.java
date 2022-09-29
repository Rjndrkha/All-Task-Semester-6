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

public class PostfixMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P, Q;
        System.out.println("Masukkan ekspresi matematika: ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";
        //membuat variabel total untuk menghitung banyaknya karaketer pada variabel Q//
        int total = Q.length();
        //instansiasi objek dengan nama post dan nilai parameternya adalah total//
        Postfix post = new Postfix(total);
        //memanggil method konversi //
        P = post.konversi(Q);
        System.out.println("Postfix: " + P);
    }
}
