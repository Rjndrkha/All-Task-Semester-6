package Task;

import java.util.*;

public class Number1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] Array = new int[5];

        for (int i = 0; i < Array.length; i++) {
            System.out.print("Input Number ke-" + i + ": ");
            Array[i] = sc.nextInt();

        }
        for (int i = 4; i >= 0; i--) {
            System.out.println("Number ke-" + i + ": " + Array[i]);

        }
    }
}
