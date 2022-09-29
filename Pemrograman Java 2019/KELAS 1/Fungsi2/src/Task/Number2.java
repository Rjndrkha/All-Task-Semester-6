package Task;

import java.util.*;

public class Number2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai n :");
        int input = sc.nextInt();
        PenjumlahanRekursif(input);
        show(input, 1);
        System.out.print(PenjumlahanRekursif(input));
    }

    static void show(int n, int i) {
        if (n == 0) {
            return;
        }
        if (n == 1) {
            System.out.print(i + "=");
        } else if (n != 0) {
            System.out.print(i + "+");
            i++;
        }
        show(n - 1, i);
    }

    static int PenjumlahanRekursif(int n) {
        if (n > 1) {
            return n + PenjumlahanRekursif(n - 1);
        } else {
            return n;
        }
    }
}
