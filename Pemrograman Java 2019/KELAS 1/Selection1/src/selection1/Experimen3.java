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

public class Experimen3 {
    public static void main(String[] args) {
        
        Scanner input=new Scanner (System.in);
        int umur;
        
        System.out.println("Masukkan Umur Anda: ");
        umur=input.nextInt();
        
        if (umur>60){
            System.out.println("Lansia");
        }    
        else if (umur>45){
            System.out.println("Tua");
        }
        else if (umur>17){
            System.out.println("Dewasa");    
        }
        else if (umur>5){
            System.out.println("Anak-Anak");    
        }    
        else if (umur <=0){
                System.out.println("Maaf umur yang amda masukkan salah");
        }
        else {
            System.out.println("Balita");
        }
        }
    }