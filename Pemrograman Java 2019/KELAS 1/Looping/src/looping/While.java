
package looping;

import java.util.*;
public class While {
    public static void main (String args []){
        int number,fac,i;
        Scanner sc=new Scanner (System.in);
        System.out.println("====PROGRAM CALCULATE FACTORIAL VALUES WITH WHILE====");
        System.out.print("Enter Number : ");
        number=sc.nextInt();
        
        fac = 1;
        i=1;
        while (i<=number)
        {
            fac = fac*i;
            i++;
            
        }
        System.out.printf("Factorial Value Of that number iss : %d \n",fac);
    }  
}
