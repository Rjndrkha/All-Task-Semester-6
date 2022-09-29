package Task;

import java.util.*;

public class Number2 {

    public static void main(String args[]) {

        int range, i, odd;
        float jumlah, total = 0;
        System.out.println("CALCULATE THE SUM OF THE SQUARES OF ODD NUMBER OF N NUMBER");
        System.out.println("____________________________________________________________");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number range = ");
        range = sc.nextInt();

        odd = range / 2 + 1;
        System.out.println("The number of odd number from 1 to " + range + " is " + odd);
        for (i = 0; i <= range; i += 2) {
            total += range + (i * i);
        }
        System.out.println("Total of odd number from 1 to " + range + " = " + total);
        jumlah = total / odd;
        System.out.printf("The average of odd numbers from 1 to " + range + " = " + " %.2f ", jumlah);
    }
}
