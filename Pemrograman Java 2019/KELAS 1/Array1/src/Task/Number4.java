package Task;

import java.util.*;

public class Number4 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total element of array(MIN 2): ");
        int N = sc.nextInt();

        int[] Delete = new int[N];
        for (int i = 0; i < Delete.length; i++) {
            System.out.print("Enter the element " + (i + 1) + ": ");
            Delete[i] = sc.nextInt();
        }
        System.out.println("-----------------------------------------------------");
        System.out.print("Enter the position of element that you want to delete: ");
        int Elemen = sc.nextInt();

        for (int i = Elemen - 1; i < N - 1; i++) {
            Delete[i] = Delete[i + 1];
        }
        for (int i = 0; i < N - 1; i++) {
            System.out.println("==Result==");
            System.out.println(  Delete[i] );
        }
    }

}
