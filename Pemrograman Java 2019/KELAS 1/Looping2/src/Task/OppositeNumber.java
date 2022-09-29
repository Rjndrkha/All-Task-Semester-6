package Task;

import java.util.*;

public class OppositeNumber {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Number (Min2): ");
        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            if (i % 2 == 0) {
                for (int j = 1; j <= number; j++) {
                    System.out.print( j );
                }
                System.out.println(" ");
            } else {
                for (int k = number; k > 0; k--) {
                    System.out.print( k );
                }
                System.out.println(" ");
            }
        }
    }
}
