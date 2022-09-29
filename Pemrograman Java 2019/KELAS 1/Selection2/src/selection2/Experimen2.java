package selection2;

/**
 *
 * @author Rajendra Rakha
 */
import java.util.*;

public class Experimen2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String category;
        int penghasilan, gajiBersih;
        double tax = 0;

        System.out.print("Enter category: ");
        category = sc.nextLine();
        System.out.print("Enter the salary amount: ");
        penghasilan = sc.nextInt();

        if(penghasilan ==0 && penghasilan <=0){
            System.out.println("the income entered is invalid!");
        }else{
            
        }
                
        if (category.equalsIgnoreCase("workers")) {
            if (penghasilan <= 2000000) {
                tax = 0.1;
            } else if (penghasilan <= 3000000) {
                tax = 0.15;

            } else {
                tax = 0.2;
            }
            gajiBersih = (int) (penghasilan - (penghasilan * tax));
            System.out.println("Net salary that you receive: " + gajiBersih);

        } else if (category.equals("Business people")) {
            if (penghasilan <= 2500000) {
                tax = 0.15;
            } else if (penghasilan <= 3500000) {
                tax = 0.2;

            } else {
                tax = 0.25;
            }
            gajiBersih = (int) (penghasilan - (penghasilan * tax));
            System.out.println("Net salary that you receive: " + gajiBersih);
        } else {
            System.out.println("The category you entered is incorrect");
        }

    }
}
