package Task;

import java.util.*;

public class Pengayaan1 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int N, Input,hasil=0;
        System.out.print("Input Elemen Array : ");
        N = sc.nextInt();
        int array[] = new int[N];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Input Array Ke " + (i+1) + ": ");
            array[i] = sc.nextInt();

        }
        System.out.println("------------------------------------");
        System.out.print("Input Array Index Yang ingin Dicari: ");
        Input = sc.nextInt();
        System.out.println("------------------------------------");
        for (int i = 0; i < array.length; i++) {
            if (Input==array[i]){
                hasil=i;
                break;
            }
        }
        System.out.println("Key Ada Di Posisi Index ke: " +(hasil+1));
    }
}
