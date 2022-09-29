
package Task;

import java.util.*;
public class NumberTriangle {
    public static void main (String args []){
        Scanner sc=new Scanner (System.in);
        
        System.out.print("Input Number: ");
        int number=sc.nextInt();
        
        for (int i=1;i<=number;i++){
            for (int g=number;g>=i;g--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print(k);
                
            }
            System.out.println(" ");
        }
        
    }
}
