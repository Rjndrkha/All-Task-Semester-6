/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet7;

/**
 *
 * @author Rajendra Rakha
 */
import java.util.*;

public class SearchingMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data[] = {10, 40, 30, 50, 70, 20, 100, 90};

        Searching sch = new Searching(data, 8);
        System.out.println("Array Data : ");
        sch.printData();
        System.out.println();
        System.out.print("Input Data Yang Ingin Dicari : ");
        int search = sc.nextInt();

        System.out.println("===============================");
        System.out.println("Sequential Search Algorithm");
        int position = sch.FindSeqSearch(search);
        sch.printPosition(search, position);
        System.out.println("===============================");
        System.out.println("FindBinary Search Algorithm");
        position = sch.FindBinarySearch(search, 1, data.length - 1);
        sch.printPosition(search, position);
        System.out.println("===============================");
    }
}
