/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet5;

/**
 *
 * @author Rajendra Rakha
 */
import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        ListAchievementStudentsClass data = new ListAchievementStudentsClass();
        int totalSdt = 5;
        for (int i = 0; i < totalSdt; i++) {
            System.out.print("Name= ");
            String name = s.next();
            System.out.print("Year Of Entry= ");
            int year = s.nextInt();
            System.out.print("Age= ");
            int age = s.nextInt();
            System.out.print("GPA= ");
            double gpa = s.nextDouble();

            StudentClass m = new StudentClass(name, year, age, gpa);
            data.add(m);
        }
        System.out.println("Student Data Before Sorting");
        data.print();
        System.out.println("Student Data After Sorting with Bubble Sort based GPA");
        data.bubbleSort();
        data.print();
        System.out.println("Student Data After Sorting with Selection Sort based GPA");
        data.selectionSort();
        data.print();
        System.out.println("Student Data After Sorting with Insertion Sort based GPA");
        data.insertionSort(true);
        data.print();
    }
}
