/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments;

/**
 *
 * @author Rajendra Rakha
 */
import java.util.*;

public class no4 {

    int index = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlah;

        System.out.print("Total Population : ");
        jumlah = sc.nextInt();
        String data[][] = new String[jumlah][4];
        String ket[] = {"NIK", "Name", "Address", "Gender"};

            //proses input 
        for (int a = 0; a < jumlah; a++) {
            System.out.println("Resident " + (a + 1));
            for (int i = 0; i < ket.length; i++) {
                System.out.print(ket[i] + " : ");
                data[a][i] = sc.next();
            }
            System.out.println("");
        }
        System.out.println("Enter the data you want to search (According to NIK) : ");
        String Search = sc.next();

        no4 t4 = new no4();
        t4.pencarian(data, Search);

        if (t4.index != -1) {
            for (int i = 0; i < ket.length; i++) {
                System.out.println(ket[i] + " : " + data[t4.index][i]);
            }
        } else {
            System.out.println("Sorry, Data not found!!");
        }

    }

    public void pencarian(String data[][], String cari) {
        for (int a = 0; a < data.length; a++) {
            if (cari.equals(data[a][0])) {
                index = a;
            }
        }
    }
}
