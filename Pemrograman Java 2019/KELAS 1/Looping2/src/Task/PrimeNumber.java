
package Task;

import java.util.*;
public class PrimeNumber {
    public static void main (String args []){
        Scanner sc=new Scanner(System.in);
        System.out.println("==Display Prime Number==");
      
        int input, s, t = 0;
        System.out.print("Input Number: ");
        input = sc.nextInt();
        s = input*10;
        
        for (int i = 2; i < s; i++){
        boolean isPrima = true;
        for (int j = 2; j < i; j++) {
             if(i%j==0){
                 isPrima = false;
                 break;
            }
        }
        if(isPrima==true){
            System.out.print(i+" ");
            t+=1;
        }
        if (t==input){
                break;
            }
        }
    }
}
