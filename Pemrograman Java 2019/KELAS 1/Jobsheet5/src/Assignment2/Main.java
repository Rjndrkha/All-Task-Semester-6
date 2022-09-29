/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

/**
 *
 * @author Rajendra Rakha
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner bilangan = new Scanner(System.in);
        Scanner huruf = new Scanner(System.in);

        System.out.println("Liga Inggris Tahun 2020");
        System.out.println("	");
        System.out.println();

        KlasemenBola data = new KlasemenBola();
        System.out.println();
        System.out.println("Data Liga Inggris 1/2 Musim Tahun 2020");
        System.out.println("======================================");
        System.out.println();
        data.klubBola();
        System.out.println();

        System.out.println("Data Liga Inggris Tahun 2020 Berdasarkan Pencapaian Poin");
        System.out.println("================insertionSort_Ascending=============== ");
        data.InsertionSortAscending();
        data.tampil();

        System.out.println();

        System.out.println("Data Liga Inggris Tahun 2020 Berdasarkan Pencapaian Poin");
        System.out.println("================insertionSort_Descending==============");
        System.out.println();
        data.InsertionSortDescending();
        data.tampil();
    }
}
