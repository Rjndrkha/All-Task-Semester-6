/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet10;

/**
 *
 * @author Rajendra Rakha
 */
class Manusia {

    public void bernafas() {
        System.out.println("Manusia bernafas");
    }

    public void makan() {
        System.out.println("Manusia makan");
    }
}

class Dosen extends Manusia {

    public void makan() {
        System.out.println("Dosen makan");
    }

    public void lembur() {
        System.out.println("Dosen lembur");
    }
}

class Mahasiswa extends Manusia {

    public void makan() {
        System.out.println("Mahasiswa makan");
    }

    public void tidur() {
        System.out.println("Mahasiswa tidur");
    }
}

public class Main2 {

    public static void infoManusia(Manusia manusia) {
        manusia.bernafas();
        manusia.makan();
        System.out.println();
    }

    public static void infoDosen(Dosen dosen) {
        dosen.makan();
        dosen.lembur();
        System.out.println();
    }

    public static void infoMahasiswa(Mahasiswa mahasiswa) {
        mahasiswa.makan();
        mahasiswa.tidur();
        System.out.println();
    }

    public static void main(String[] args) {
        // Method dynamic dispatch
        Manusia manusia;

        manusia = new Manusia();
        manusia.makan();

        manusia = new Dosen();
        manusia.makan();

        manusia = new Mahasiswa();
        manusia.makan();

        System.out.println("======================");

        Manusia m = new Manusia();
        Dosen dsn = new Dosen();
        Mahasiswa mhs = new Mahasiswa();

        infoManusia(m);
        infoDosen(dsn);
        infoMahasiswa(mhs);
    }
}
