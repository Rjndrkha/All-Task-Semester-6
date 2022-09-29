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
public class Nilai {
    public static void main (String args[]){
        int uts,uas,kuis,task,nilaiAkhir,total;
        Scanner sc=new Scanner (System.in); 
        
        System.out.print("Input your score UTS = ");
        uts = sc.nextInt();
        System.out.print("Input your score UAS = ");
        uas = sc.nextInt();
        System.out.print("Input your score kuis = ");
        kuis = sc.nextInt();
        System.out.print("Input your score task = ");
        task = sc.nextInt();
        
        nilaiAkhir = ((40*uas)/100) + ((30*uts)/100) + ((10*kuis)/100) + ((20*task)/100);
        
        if (nilaiAkhir<=65){
            System.out.println("You Get Remidi");
        }
        else{
            System.out.println("You Don't get Remidi");
        }
    }
    
}
