/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selection1;

/**
 *
 * @author Rajendra Rakha
 */
import java.util.Scanner;

public class experimen2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner (System.in);
        int score1;
        float averagescore;
        
        System.out.print("Enter Score 1: ");
        score1=input.nextInt();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Score 2: ");
        
        int score2;
        score2=sc.nextInt();
        averagescore = (score1 + score2)/2;
        
        if (averagescore>=100){
            averagescore-=5;
        }
        
        System.out.println("Your final score is = " +averagescore);
    }        
}
