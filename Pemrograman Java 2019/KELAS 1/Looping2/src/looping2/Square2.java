package looping2;

import java.util.Scanner;

public class Square2 {

    public static void main(String args[]) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();
        for (int iOuter = 1; iOuter <= N; iOuter++) {
            for (i = 1; i >= N; i--) {
                System.out.print(" ");

            } for (int k = 1; k <= iOuter; k++) {
                System.out.print("*");
            }
             System.out.println();
        }
        
    }
}
