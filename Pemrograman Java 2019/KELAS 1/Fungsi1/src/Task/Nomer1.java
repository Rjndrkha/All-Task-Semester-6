package Task;

public class Nomer1 {

    static int Max3(int bil1, int bil2, int bil3) {
        int big, max = 0;
        int[] a = {bil1, bil2, bil3};
        for (int i = 0; i < a.length; i++) {
            big = a[0];
            if (a[i] > a[0]) {
                big = a[i];
                max = big;
            }
        }
        return max;
    }

    public static void main(String args[]) {
        int bil1 = 3, bil2 = 5, bil3 = 8, max;
        max = Max3(bil1, bil2, bil3);
        System.out.println("Nilai Max : " + max);
    }
}
