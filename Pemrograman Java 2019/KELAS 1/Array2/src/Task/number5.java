package Task;

import java.util.*;

public class number5 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int x, y;
        System.out.print("Input size baris matriks :");
        x = input.nextInt();
        System.out.print("Input size kolom matriks :");
        y = input.nextInt();
        int[][] arr = new int[x][y];

        System.out.println("Input elemen matriks  :");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("Matriks [" + i + "][" + j + "] : ");
                arr[i][j] = input.nextInt();
            }
            System.out.println("-----------------------------------");
            System.out.println();
        }
        System.out.println("Hasil output matriksnya adalah :");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("Hasil output matriks transpose adalah :");
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(arr[j][i] + " ");

            }
            System.out.println();
        }
    }
}
