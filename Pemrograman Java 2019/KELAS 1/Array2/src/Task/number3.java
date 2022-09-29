
package Task;

import java.util.*;

public class number3 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        System.out.print("Input jumlah baris :");
        baris = sc.nextInt();
        System.out.print("Input jumlah kolom :");
        kolom = sc.nextInt();
        int[][] array = new int[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Input array baris ke " + i + " kolom ke " + j + " ");
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("Pilih menu");
        System.out.println("1. Nilai min");
        System.out.println("2. Nilai min dan jumlah");
        System.out.println("3. Temukan nilai");
        System.out.print("Masukan pilihan ");
        int pilih = sc.nextInt();
        switch (pilih) {
            case 1:
                Min(array);
                break;

            case 2:
                Min(array);
                Sum(array);
                break;

            case 3:
                Find(array);
                break;
        }
    }

    public static void Min(int[][] arr) {
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println("Nilai minimal array : " + min);
    }

    public static void Sum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum = sum + arr[i][j];
            }
        }
        System.out.println("Jumlah array : " + sum);
    }

    public static void Find(int[][] arr) {
        Scanner sc = new Scanner(System.in);
        int N = 0;
        System.out.print("Masukan nilai yang akan dicari :");
        int search = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != search) {
                    N += 1;
                } else if (arr[i][j] == search) {
                    System.out.print("ADA terletak pada index baris " + i + " index kolom ke " + j);
                    break;
                } else if (N == arr.length) {
                    System.out.print("TIDAK ADA");
                }
            }
        }
    }
}
