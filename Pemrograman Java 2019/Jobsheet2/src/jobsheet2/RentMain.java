/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet2;

/**
 *
 * @author Rajendra Rakha
 */
public class RentMain {

    public static void main(String[] args) {
        Rent call = new Rent();
        call.id = 105;
        call.MemberName = "Rajendra Rakha A.P";
        call.GameName = "GTA V";
        call.Price = 5000;
        int lama = 10;
        call.tampilData();
        System.out.println("Lama sewa\t: " + lama + " hari");
        
        System.out.println("Total harga\t: Rp." + call.totalHarga(lama));
        System.out.println("----------------------------------------");
    }
}
