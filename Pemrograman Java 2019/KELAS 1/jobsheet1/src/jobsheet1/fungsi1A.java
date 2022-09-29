/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet1;

/**
 *
 * @author Rajendra Rakha
 */


public class fungsi1A {
    public static void main (String args []){
        int num1=0;
        int num2=1;
        int num3;
        System.out.print(num1+","+num2);
        for (int i=0;i<7;i++){
            num3=num1+num2;
            System.out.print(","+num3);
            num1=num2;
            num2=num3;
        }
    }
    
}

