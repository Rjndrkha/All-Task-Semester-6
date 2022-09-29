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
public class no3 {

    int biggest = 0;
    int biggestAmnt = 0;
    int index[] = new int[10];
    int i = 0;

    public static void main(String[] args) {

        int data[] = {12, 17, 2, 1, 70, 50, 90, 17, 2, 90};

        System.out.println("Data Before Sorted :");
        //proses sorted
        for (int x = 0; x < data.length; x++) {
            System.out.print(data[x] + " ");
        }
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (data[i] < data[j]) {
                    int hasil = data[i];
                    data[i] = data[j];
                    data[j] = hasil;
                }
            }
        }
        System.out.println("");

        System.out.println("Data After Sorted :");
        for (int x = 0; x < data.length; x++) {
            System.out.print(data[x] + " ");
        }

        no3 t3 = new no3();
        t3.search(data);

        System.out.println("");
        System.out.println("==================================================");
        System.out.print("The biggest data               : " + t3.biggest + "\n");
        System.out.print("Many of the biggest data   : " + t3.biggestAmnt + "\n");
        System.out.print("The biggest data is in the index  ");

        for (int i = 0; i < t3.i; i++) {
            System.out.print("| " + t3.index[i] + " | ");
        }

        System.out.println("");
        System.out.println("==================================================");
    }
    
//Binary Search

    public void search(int data[]) {
        for (int a = 0; a < data.length; a++) {
            if (data[a] >= biggest) {
                biggest = data[a];
            }
        }
        for (int a = 0; a < data.length; a++) {
            if (data[a] == biggest) {
                biggestAmnt++;
                index[i] = a;
                i++;
            }
        }
    }

}
