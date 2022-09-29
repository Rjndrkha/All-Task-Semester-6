package Task;

import java.util.*;

public class HourGlass {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int Number, i, j, k;
        System.out.print("Input Number1 (Min2): ");
        Number = sc.nextInt();

        for (i = 1; i <= Number-1; i++) {
            for (j = 50; j > i-1; j++) {
                System.out.print(" ");
            }
            for (k = 1; k < ((2 * j)-1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 1; i <= Number; i++) {
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
