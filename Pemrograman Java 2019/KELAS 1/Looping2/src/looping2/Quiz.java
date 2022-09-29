package looping2;

import java.util.Scanner;
import java.util.Random;

public class Quiz {

    public static void main(String args[]) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        char menu = 'y';
        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = sc.nextInt();
                success = (answer == number);
                if (answer<number){
                    System.out.println("Lebih Kecil");
                }else if (answer>number){
                    System.out.println("Lebih Besar");
                }
            } while (!success);
            System.out.println("Apakah Anda ingin mengulang permaina(Y/y)? ");
            menu = sc.findInLine(".").charAt(0);
            sc.nextLine();
        } while (menu == 'y' || menu == 'Y');
    }
}
