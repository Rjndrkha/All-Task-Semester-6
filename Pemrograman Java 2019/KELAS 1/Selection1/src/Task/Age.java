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
public class Age {
    public static void main (String args []){
        int umur;
     Scanner sc = new Scanner (System.in);
        System.out.print("Input your age = ");
        umur = sc.nextInt();
        
     if (umur>=17){
         System.out.println("You can Ride ");
     }
     else{    
         System.out.println("You Can't Ride ");
    }
    
    }
}
