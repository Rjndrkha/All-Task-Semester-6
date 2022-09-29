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

public class no1Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data[] = {100, 90, 80, 70, 60, 50, 40, 30};
        no1 a = new no1(data, 8);
        System.out.print("Array Data : ");
        a.printData();

        System.out.println("===============================");
        System.out.println("After Sorting....");
        System.out.print("Data Array : ");
        a.printArray(data);
        System.out.println();
        System.out.print("Input Number : ");
        int search = sc.nextInt();
        System.out.println();
        System.out.println("===============================");
        System.out.println("Sequential Search Algorithm");
        int position = a.FindSeqSearch(search);
        a.printPosition(search, position);
        System.out.println("===============================");
        System.out.println("FindBinary Search Algorithm");
        a.mergeSort();
        a.printData();
        position = a.FindBinarySearch(search, 0, data.length - 1);
        a.printPosition(search, position);
        System.out.println("===============================");

    }
}
