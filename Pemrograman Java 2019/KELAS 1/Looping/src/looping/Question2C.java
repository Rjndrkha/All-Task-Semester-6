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
public class Question2C {
    public static void main (String args []){
        int n=5;
        long hasil =1;
        for (int i=1;i<=n;i++){
            hasil = hasil *i;
            
        }
        System.out.println(n+"!="+hasil);
    }
}
