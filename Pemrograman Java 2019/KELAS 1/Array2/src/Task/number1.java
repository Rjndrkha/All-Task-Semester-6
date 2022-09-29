package Task;

import java.util.*;

public class number1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[3][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print("input Array baris ke [" + i + "],[" + j + "] :");
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("======================================================");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println("======================================================");
        int max, max1;

        for (int i = 0; i < array.length; i++) {
            max = 0;
            for (int j = 0; j < array.length; j++) {
                if (max <= array[i][j]) {
                    max = array[i][j];
                }
            }
            System.out.println(" Nilai max dari kolom " + i + " adalah " + max);
        }
        System.out.println("======================================================");
        for (int i = 0; i < array.length; i++) {
            max1 = 0;
            for (int j = 0; j < array.length; j++) {
                if (max1 <= array[j][i]) {
                    
                }
            }
            System.out.println(" Nilai max dari baris " + i + " adalah " + max1);
        }
    }
}
