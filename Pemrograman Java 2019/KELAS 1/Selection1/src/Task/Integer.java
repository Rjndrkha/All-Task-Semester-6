/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task;

/**
 *
 * @author Rajendra Rakha
 */
import java.util.*;
    public class Integer {
    public static void main (String args []){
    
        int number1,number2;
        Scanner input=new Scanner (System.in);
        
        System.out.println("Input number 1 = ");
        number1 =input.nextInt();
        System.out.println("Input number 2 = ");
        number2 =input.nextInt();
        
        if(number1>=number2){
           System.out.println("Largest number" + number1);
        }
        else{
            System.out.println("Largest number" +number2); 
        }
}
}
