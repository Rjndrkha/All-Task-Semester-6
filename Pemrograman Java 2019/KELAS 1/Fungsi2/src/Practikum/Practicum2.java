
package Practikum;


import java.util.*;

public class Practicum2 {

    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return (1);
        } else {
            return (x * hitungPangkat(x, y - 1));
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number, rank;
        System.out.print("Bilangan Yang Dihitung: ");
        number = sc.nextInt();
        System.out.print("Pangkat: ");
        rank = sc.nextInt();
        System.out.println(hitungPangkat(number, rank));
    }

}
