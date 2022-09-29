/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_Rajendra;

/**
 *
 * @author Rajendra Rakha
 */
import java.util.*;

public class Book_Rajendra {

    int code;
    public String title;
    public String publisher;
    public int stock;
    public int broken;

    public Book_Rajendra(int code, String title, String publisher, int stock, int broken) {
        this.code = code;
        this.title = title;
        this.publisher = publisher;
        this.stock = stock;
        this.broken = broken;
    }

    public int getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getBroken() {
        return broken;
    }

    public void setBroken(int broken) {
        this.broken = broken;
    }
}

class Util {
// Util class as Scanner Input data based on data type

    public static int getIntInput(String Command, Scanner input, int Length) {
        int DATA;
        boolean hasilMaksimal;
        do {
            System.out.print(Command);
            while (!input.hasNextInt()) {
                String inputted = input.next();
                System.out.printf("\"%s\" Is not a number !! \n", inputted);
                System.out.print(Command);
            }
            DATA = input.nextInt();
            hasilMaksimal = (Length) != 0 && DATA > Length;

            if (DATA < 0 || hasilMaksimal) {
                System.out.println("Enter the Appropriate number");
            }

            input.nextLine();

        } while (DATA < 0 || hasilMaksimal);
        return DATA;
    }

    //Input functions are numbers

    public static double getDoubleInput(String Command, Scanner input, int Length) {
        double DATA;
        boolean hasilMaksimal;
        do {
            System.out.print(Command);
            while (!input.hasNextDouble()) {
                String inputted = input.next();
                System.out.printf("\"%s\" Is not a number !! \n", inputted);
                System.out.print(Command);
            }
            DATA = input.nextDouble();
            hasilMaksimal = (Length) != 0 && DATA > Length;

            if (DATA <= 0 || hasilMaksimal) {
                System.out.println("Enter the Appropriate number");
            }

        } while (DATA <= 0 || hasilMaksimal);
        return DATA;
    }

    //Input functions are character
    public static boolean getCharInput(String Command, Scanner Length) {
        char DATA;
        do {
            System.out.print(Command);
            DATA = Character.toLowerCase(Length.next().charAt(0));
            if (DATA != 'y' && DATA != 't') {
                System.out.println("Enter the Appropriate Character");
            }
        } while (DATA != 'y' && DATA != 't');
        return DATA == 'y';
    }

     //Input functions are character
    public static String getStringInput(String Command, Scanner input) {
        String DATA;
        do {
            System.out.print(Command);
            DATA = input.nextLine();
            if (DATA.trim().isEmpty()) {
                System.out.println("Enter the Appropriate Character");
            }
        } while (DATA.trim().isEmpty());
        return DATA;
    }
}
