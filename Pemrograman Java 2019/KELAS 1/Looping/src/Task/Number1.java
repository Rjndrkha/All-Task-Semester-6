package Task;

import java.util.*;

public class Number1 {

    public static void main(String args[]) {
        int range, i, genap1, total=0;
        float jumlah;
        System.out.println("CALCULATE THE SUM OF THE SQUARES OF EVEN NUMBER OF N NUMBER");
        System.out.println("____________________________________________________________");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number range = ");
        range = sc.nextInt();

        genap1 = range / 2;
        System.out.println("The number of even number from 1 to " + range + " is " + genap1);
        for (i = 0; i <= range; i+=2) {
            total+=i;
        }
        System.out.println("Total of even number from 1 to " + range + " = " +total);
        jumlah=total/genap1;
        System.out.println("The average of even numbers from 1 to " + range + " = " + jumlah );
    }
}
