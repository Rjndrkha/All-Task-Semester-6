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
import java.util.*;

public class nomer2Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        //instansiasi objek//
        nomer2 call = new nomer2();
        System.out.print("Masukkan kalimat: ");
        input = sc.nextLine();
        call.kalimat(input);
        call.simpanKalimat();
        call.simpanSize();
        call.konversi();
        call.print();
    }
}
