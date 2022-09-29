package Practicum;

import java.util.*;

public class Practicum4 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rowA, columnA;
        System.out.print("Enter Row Size of Matrix A: ");
        rowA = sc.nextInt();
        System.out.print("Enter Column size of Matrix A: ");
        columnA = sc.nextInt();

        int matrixA[][] = new int[rowA][columnA];
        System.out.println("==Input Element Matrix A==");
        int i=0;
        while (i < rowA) {
            int j=0;
            while (j < columnA) {
                System.out.print("Matrix A[" + i + "][" + j + "]: ");
                matrixA[i][j] = sc.nextInt();
                j++;
            }
                
            System.out.println();
            i++;
        }
        System.out.println("The Matrix Output is: ");
        int h=0;
        while (h < rowA) {
            int k=0;
            while (k < columnA) {
                System.out.print(matrixA[h][k] + " ");
                k++;
            }
            System.out.println();
            h++;
        }
    }
}
