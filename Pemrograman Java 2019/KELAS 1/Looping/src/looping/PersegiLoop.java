/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looping;

/**
 *
 * @author Rajendra Rakha
 */
public class PersegiLoop {
    public static void main (String args []){
        for (int i = 0; i<5;i++){//outer
            for (int j=0; j<4;j++){//inner
                 System.out.print("*");
            }
           System.out.println( );
        }
    }
}
