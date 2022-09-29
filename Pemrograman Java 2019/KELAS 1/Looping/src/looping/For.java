/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looping;

/**
 *
 * @author Rajendra Rakha
 */
import java.util.*;
public class For {
    public static void main (String args []){
        int number,fac,i;
        Scanner sc=new Scanner (System.in);
        System.out.println("====PROGRAM CALCULATE FACTORIAL VALUES WITH FOR====");
        System.out.print("Enter Number : ");
        number=sc.nextInt();
        fac = 1;
        for (i=1; i<=number;i++)
        {
            fac = fac*i;
            
        }
        System.out.printf("Factorial value of that number is : %d \n",fac);
    }  
}
