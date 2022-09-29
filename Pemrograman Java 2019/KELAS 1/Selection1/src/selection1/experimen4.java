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
import java.util.*;
public class experimen4 {
    public static void main(String args []){
        
        Scanner sc=new Scanner (System .in);
      
      double number1, number2,result;
      char operator;
      
        System.out.println("Enter your first number: ");
        number1 =sc.nextDouble();
        System.out.println("Enter your second number: ");
        number2 =sc.nextDouble();
        System.out.println("Enter your operator (+ - * /): ");
        operator = sc.next ().charAt (0);
        switch (operator){
            
            case '+' :
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;
            case '*' :
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;
            
            default :
                System.out.println("The operator yout entered is incorrect");
        }
    }
    
}
