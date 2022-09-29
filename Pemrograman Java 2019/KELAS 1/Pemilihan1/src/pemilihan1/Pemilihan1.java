/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemilihan1;

/**
 *
 * @author Rajendra Rakha
 */
import java.util.Scanner;
public class Pemilihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner (System.in);
        int bil;
        System.out.print("Masukkan Sebuah Bilangan = ");
        bil=input.nextInt();
        
        
        if (bil%2==0){
            System.out.println("Bilangan Genap");
        }
        else{
            System.out.println("Bilangan Ganjil");
        }
    }
    
}
