/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selection1;

/**
 *
 * @author Rajendra Rakha
 */
import java.util.Scanner;
public class Selection1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner (System.in);
        int number;
        System.out.print("Enter your number = ");
        number=input.nextInt();
        
        String output =(number%2==0)?"Even number" : "odd number";
        System.out.println(output);
        if (number%2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
    
}
