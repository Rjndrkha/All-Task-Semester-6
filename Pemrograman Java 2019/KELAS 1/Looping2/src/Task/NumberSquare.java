package Task;

import java.util.*;

public class NumberSquare {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Number (Min3): ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i <= number) {
                if (i == number || i == 1) {
                    for (int j = 0; j <= number; j++) {
                        System.out.print(number);
                    }
                    System.out.println(" ");
                } else {
                    int m, s;
                    for (m = 0; m < 1; m++) {
                        System.out.print(number);
                    }
                    for (s = number - 2; s >= 0; s--) {
                        if (number > 9) {
                            System.out.print("  ");
                        } else if (number > 99) {
                            System.out.print("   ");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    for (m = number; m > number - 1; m--) {
                        System.out.print(number);
                    }
                    System.out.println("");
                }
            }

        }
    }
}
