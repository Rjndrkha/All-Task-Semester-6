package Task;

import java.util.*;

public class PineTree {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input Number: ");
        int N = sc.nextInt();

        int i, j, k;

        for (i = 1; i <= N; i++) {
            for (j = 50; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k < (2 * j); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 1; i <= N; i++) {
            for (j = 50; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k < (2 * j); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 1; i <= N; i++) {
            for (j = 50; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k < (2 * j); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
