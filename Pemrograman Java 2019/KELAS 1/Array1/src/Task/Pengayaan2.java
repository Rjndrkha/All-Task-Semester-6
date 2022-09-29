package Task;

import java.util.*;

public class Pengayaan2 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int penampung;
        System.out.print("Input Jumlah Elemen Array : ");
        int arr = sc.nextInt();
        int[] data = new int[arr];
        for (int i = 0; i < data.length; i++) {
            System.out.print("Input Data ke-" + i + " : ");
            data[i] = sc.nextInt();
        }
        for (int i : data) {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("Data setelah diurutkan : ");
        for (int i = 0; i < data.length; i++) {
            for (int j = 1; j < data.length - i; j++) {
                if (data[j - 1] > data[j]) {
                    penampung = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = penampung;
                }
            }
        }
        for (int i : data) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}
