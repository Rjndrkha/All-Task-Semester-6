
package looping;

import java.util.*;
public class DoWhile {
    public static void main (String args []){
        int number,fac,i;
        Scanner sc=new Scanner (System.in);
        System.out.println("====PROGRAM CALCULATE FACTORIAL VALUES WITH DO-WHILE====");
        System.out.print("Enter Number : ");
        number=sc.nextInt();
        
        fac = 1;
        i=1;
        do
        
        {
            fac = fac*i;
            i++;
            
        }
        while (i<=number);
        System.out.printf("Factorial value of that number is : %d \n",fac);
    }  
}
