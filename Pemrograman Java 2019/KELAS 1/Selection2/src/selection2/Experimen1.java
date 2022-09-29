package selection2;

/**
 *
 * @author Rajendra Rakha
 */
import java.util.*;

public class Experimen1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score;

        System.out.println("Enter test score (0-100): ");
        score = sc.nextInt();

        if (score >= 0 || score <= 100) {
            if (score >= 90 && score <= 100) {
                System.out.println("Score A,EXCELLENT!");
            } else if (score >= 80 && score <= 89) {
                System.out.println("Score B, keep your achievments!");
            } else if (score >= 60 && score <= 79) {
                System.out.println("Score C, keep your achievments!");
            } else if (score >= 50 && score <= 59) {
                System.out.println("Score D, keep your achievement!");
            } else if (score == 0 && score < 1) {
                System.out.println("The value you entered is less than 0");
            } else if (score >= 100 && score == 100) {
                System.out.println("The value you entered is more tham 100");
            } else {
                System.out.println("Score E, do not pass!");
            }
        } else if (score == 0 && score < 0) {
            System.out.println("The value you entered is less than 0");
        } else if (score >= 100) {
            System.out.println("The value you entered is more tham 100");
        } else {
            System.out.println("The value you entered is invalid");
        }
    }
}
