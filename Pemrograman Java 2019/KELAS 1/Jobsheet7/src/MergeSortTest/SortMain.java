/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MergeSortTest;

/**
 *
 * @author Rajendra Rakha
 */
public class SortMain {

    public static void main(String args[]) {

        int data[] = {10, 40, 30, 50, 70, 20, 100, 90};
        System.out.println("Sorting With Merge Sort ");
        MergeSort mSort = new MergeSort();
        System.out.println("Data Array");
        mSort.printArray(data);

        System.out.println("After Sorting....");
        mSort.mergeSort(data);
        mSort.printArray(data);
    }
}
