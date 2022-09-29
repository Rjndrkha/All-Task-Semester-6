/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

/**
 *
 * @author Rajendra Rakha
 */
public class Manusia implements Melihat {

    private String nama;

    public Manusia(String nama) {
        this.nama = nama;
    }

    @Override
    public void infoElek() {
        System.out.println("Namaku " + this.nama);
        System.out.println();
    }

    @Override
    public void infoBina() {
        System.out.println("Namaku " + this.nama);
        System.out.println();
    }

}
