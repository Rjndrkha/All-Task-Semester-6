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
public class Mahasiswa {

    public int nim;
    public String nama,alamat,kelas;
    
    public void tampilBiodata(){
        System.out.println("Nim       : "+nim);
        System.out.println("Adress  : "+nama);
        System.out.println("Alamat  : "+alamat);
        System.out.println("Kelas    : "+kelas);
        
    }

}

