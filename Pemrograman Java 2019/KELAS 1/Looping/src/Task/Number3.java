package Task;

public class Number3 {

    public static void main(String args[]) {

        int a = 0, b = 1, fib, c = 0;
        System.out.print(a);
        System.out.print(" " + b);
        while (c <= 1) {

            fib = a + b;
            System.out.print(" " + fib);
            a = fib + b;
            System.out.print(" " + a);
            b = a + fib;
            System.out.print(" " + b);
            c++;
        }
    }
}
