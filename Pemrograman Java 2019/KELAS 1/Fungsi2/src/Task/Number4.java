package Task;

import java.util.*;

public class Number4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka pertama = ");
        int num1 = sc.nextInt();
        System.out.print("Masukkan angka kedua = ");
        int num2 = sc.nextInt();
        System.out.println("FPB dari " + num1 + " dan " + num2 + " adalah " + FPB(num1, num2));
    }

    static int FPB(int a, int b) {
        if ((b <= a) && (a % b == 0)) {
            return b;
        } else if (a < b) {
            return FPB(b, a);
        } else {
            return FPB(b, a % b);
        }
    }
}
