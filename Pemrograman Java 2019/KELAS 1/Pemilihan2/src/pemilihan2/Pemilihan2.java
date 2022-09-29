3/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemilihan2;

/**
 *
 * @author Rajendra Rakha
 */
import java.util.Scanner;

public class Pemilihan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner (System.in);
        int nilai;
        
        System.out.println("Masukan Sebuah bilangan: ");
        nilai=input.nextInt();
        
        if (nilai>=100){
            nilai+=10;
        }
        else{
            nilai-=10;
        }
        System.out.println("Hasil akhir Nilai Adalah= " +nilai );                                        
    }  
}
