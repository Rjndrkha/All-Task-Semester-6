package Task;

import java.util.*;

public class Number1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan  nilai n : ");
        int n = input.nextInt();
        int hasil = n;
        show(n, hasil);
    }

    static void show(int n, int hasil) {
        if (n == -1) {
            return;
        }
        System.out.print(hasil + " ");
        hasil--;
        show(n - 1, hasil);

    }
}
