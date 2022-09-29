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
public class Rent {

    public int id,Price;
    public String MemberName,GameName;
    

    public int totalHarga(int lamaSewa) {
        int totalHarga = lamaSewa * Price;
        return totalHarga;
    }

    public void tampilData() {
        System.out.println("\n----------------------------------------");
        System.out.println("               STRUK PEMINJAMAN");
        System.out.println("----------------------------------------");
        System.out.println("Id\t: " + id);
        System.out.println("Nama member\t: " + MemberName);
        System.out.println("Nama game\t: " + GameName);
        System.out.println("Harga\t: Rp." + Price);
    }
}
