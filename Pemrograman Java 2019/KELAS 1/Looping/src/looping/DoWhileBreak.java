
package looping;

import java.util.*;
public class DoWhileBreak {
    public static void main (String args []){
        Scanner sc=new Scanner (System.in);
        int angka,b;
        System.out.println("====PROGRAM LOOP DENGAN BREAK====");
        b=0;
        do
        {
            System.out.print("Masukkan Bilangan : ");
            angka=sc.nextInt();
            b += angka;
            if (b>50) break;
        }
        while (true);
        System.out.printf("Angka berhenti pada angka : %d \n", b);
    }
}
