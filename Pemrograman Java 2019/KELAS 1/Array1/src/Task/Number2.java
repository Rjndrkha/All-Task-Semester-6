package Task;

import java.util.*;

public class Number2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] array;
        int i;
        System.out.print("Input Jumlah Array: ");
        int N = sc.nextInt();
        array = new int[N];

        for (i = 0; i < array.length; i++) {
            System.out.print("Input Array ke-" + i + ": ");
            array[i] = sc.nextInt();
        }
        System.out.println("           Genap          ");
        System.out.println("--------------------------");
        for (i = 0; i < N; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
        System.out.println("           Ganjil          ");
        System.out.println("--------------------------");
        for (i = 0; i < N; i++) {
            if (array[i] % 2 == 1) {
                System.out.println(array[i]);
            }
        }
    }
}
