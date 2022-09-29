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
public class Harga {
    public static void main (String args []){
        double pajak1 = 0.02;
        double pajak2 = 0.05;
        double pajak3 = 0.1;
        double total,potongan,totalBayar =0;
        Scanner sc=new Scanner (System.in);
        
        System.out.println("Masukkan total belanja anda : ");
        total=sc.nextDouble();
        
        
        if(total==200000){
            System.out.println("Maaf total Belanja anda masi kurang ");
            System.out.println("Total bayar anda adalah : " + total);
        }
        else if (total>200000 && total<500000){
            System.out.println("Anda mendapatkan member Silver Sebesar 2%");
            potongan=(total*pajak1);
            totalBayar=(total-potongan);
            System.out.println("Total belanja anda adalah : " + total);
            System.out.println("Potongan diskon member anda adalah : " + potongan);
            System.out.println("Total bayar anda adalah : " + totalBayar);
        }
        else if (total>500000&&total<1000000){
            System.out.println("Anda mendapatkan member Gold Sebesar 5%");
            potongan=(total*pajak2);
            totalBayar=(total-potongan);
            System.out.println("Total belanja anda adalah : " + total);
            System.out.println("Potongan diskon member anda adalah : " + potongan);
            System.out.println("Total bayar anda adalah : " + totalBayar);
        }
        else if (total>1000000){
            System.out.println("Anda mendapatkan member Platinum Sebesar 10s%");
            potongan=(total*pajak3);
            totalBayar=(total-potongan);
            System.out.println("Total belanja anda adalah : " + total);
            System.out.println("Potongan diskon member anda adalah : " + potongan);
            System.out.println("Total bayar anda adalah : " + totalBayar);
        }
    }
    
}
