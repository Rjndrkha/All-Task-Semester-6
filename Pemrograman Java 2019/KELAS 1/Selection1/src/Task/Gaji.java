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
public class Gaji {
    public static void main (String args[]){
        double gaji,uangTransport,uangMakan;
        double totalPajak,totalGaji,pajak=0.1;
        Scanner sc=new Scanner (System.in);
        
        System.out.print("Input Your Salary = ");
        gaji = sc.nextInt();
        System.out.print("Input Your Meal Allowance = ");
        uangMakan=sc.nextInt();
        System.out.print("Input Your Transportation Money = ");
        uangTransport=sc.nextInt();
        
        totalGaji = gaji + uangMakan + uangTransport;
       
        if (totalGaji>=1000000){
            totalPajak = (totalGaji*pajak);
            totalGaji = totalGaji - totalPajak;
            System.out.println("Your Salary Total is = " + totalGaji);
        }
        else{
            System.out.println("Your Salary = " +totalGaji);
        }
         
        
    }
    
}
