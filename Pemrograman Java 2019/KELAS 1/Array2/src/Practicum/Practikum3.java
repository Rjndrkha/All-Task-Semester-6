package Practicum;

import java.util.*;

public class Practikum3 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int value[][] = new int[2][3];
        int i = 0;
        while (i < 2) {
            int j = 0;
            while (j < 3) {
                System.out.print("Enter Value number-[" + i + "][" + j + "] ");
                value[i][j] = sc.nextInt();
                j++;
            }
            System.out.println("------------------------------------");
            i++;
        }
        int h = 0;
        while (h < 2) {
            int k = 0;
            while (k < 3) {
                System.out.print(value[h][k] + " ");
                k++;
            }
            System.out.println();
            h++;
        }

    }
}
