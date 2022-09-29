package Task;

import java.util.*;

public class Nomer2 {

    static int CircleArea(int r) {
        int luas = (int) (3.14 * r * r);
        return luas;
    }

    static int kelilinglingkaran(int r) {
        int keliling = (int) (3.14 * (r + r));
        return keliling;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan jari jari lingkaran : ");
        int r = sc.nextInt();
        System.out.println("Kelilingnya lingkaran adalah : " + kelilinglingkaran(r));
        System.out.println("Luas lingkaran adalah : " + CircleArea(r));
    }
}
