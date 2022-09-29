
package looping;

import java.util.*;

public class ForBreak {
    public static void main (String args []){
        Scanner sc=new Scanner (System.in);
        int angka,b;
        
        System.out.println("===PROGRAM LOOP DENGAN BREAK====");
        for (b=0;true;){
            System.out.print("Masukkan bilangan : ");
            angka=sc.nextInt();
            b += angka;
            
            if(b>50)break;
        }  
        System.out.printf("Angka Berhenti pada jumlah angka : %d \n",b);
    }
}
