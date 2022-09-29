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

public class no2Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data[][] = {{45, 78, 7, 200, 80}, {90, 1, 17, 100, 50}, {21, 2, 40, 18, 65}};
        no2 b = new no2(data, 3, 5);
        System.out.println("Array Data : ");
        b.printData();

        System.out.println("===============================");
        System.out.print("Input Number : ");
        int search = sc.nextInt();
        System.out.println("Sequential Search Algorithm");
        int position = b.FindSeqSearch(search);
        b.printPosition(search, position);
        System.out.println("===============================");
    }
}
