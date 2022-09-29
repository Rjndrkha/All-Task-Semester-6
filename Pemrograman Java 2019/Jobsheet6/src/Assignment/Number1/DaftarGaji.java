/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment.Number1;

import Assignment.Number1.Pegawai;

/**
 *
 * @author Rajendra Rakha
 */
public class DaftarGaji extends Pegawai{

    public Pegawai[] listPegawai;
    Pegawai call;
    int amount = 0;

    protected DaftarGaji() {
        super.setNama("Rajendra Rakha");
        super.setNama1("Ariono Septian");
        
        System.out.println(super.getNama()+" [Pegawai] ");
        System.out.println("Ariono Septian   [Dosen]");

    }

    public void addPegawai(Pegawai pegawai) {
        listPegawai[amount] = pegawai;
        amount++;
    }

    public void printSemuaGaji() {
        for (int i = 0; i < amount; i++) {
            String nama = listPegawai[i].getNama();
            int gaji = listPegawai[i].getGaji();

            System.out.println(nama + " mendapatkan gaji : " + gaji);
        }
    }
}

