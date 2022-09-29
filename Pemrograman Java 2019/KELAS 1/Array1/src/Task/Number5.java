package Task;

import java.util.Scanner;

public class Number5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int el, sum, max, i, p = 1;
        System.out.print("Input Isi Array : ");
        el = sc.nextInt();
        int[] in = new int[el];

        for (i = 0; i < in.length; i++) {
            System.out.print("Input Array ke -" + i + " : ");
            in[i] = sc.nextInt();
        }
        max = in[1];
        for (i = 0; i < el; i++) {
            if (in[i] > max) {
                max = in[i];
                p = i + 1;
            }
        }
        System.out.print("The Biggest number Is : " + max + " ,In The Elemen : " + p);
    }
}
