/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rajendra.relasiclass;

/**
 *
 * @author Rajendra Rakha
 */
class Penumpang {

    private String nama, ktp;

    public Penumpang(String nama, String ktp) {
        this.nama = nama;
        this.ktp = ktp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKtp() {
        return ktp;
    }

    public void setKtp(String ktp) {
        this.ktp = ktp;
    }

    public String info() {
        String info = "";
        info += "Ktp : " + ktp + "\n";
        info += "Nama : " + nama + "\n";
        return info;
    }
}

class Kursi {

    private String nomor;
    private Penumpang penumpang;

    public Kursi(String nomor) {
        this.nomor = nomor;
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public Penumpang getPenumpang() {
        return penumpang;
    }

    public void setPenumpang(Penumpang penumpang) {
        this.penumpang = penumpang;
    }

    public String info() {
        String info = "";
        info += "Nomor : " + nomor + "\n";
        if (this.penumpang != null) {
            info += "Penumpang : \n" + penumpang.info() + "\n";
        }
        return info;
    }
}

class Gerbong {

    private String kode;
    private Kursi[] arrayKursi;

    public Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }

    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public Kursi[] getArrayKursi() {
        return arrayKursi;
    }

    public void setPenumpang(Penumpang penumpang, int nomor) {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[nomor - 1].setPenumpang(penumpang);

            Kursi kursi = arrayKursi[i];
            if (Integer.parseInt(kursi.getNomor()) == nomor && kursi.getPenumpang() != null) {
                System.out.println("Maaf, kursi nomor " + nomor + " sudah ada penumpang!\n");
                break;
            } else {
                this.arrayKursi[nomor - 1].setPenumpang(penumpang);
                break;
            }

        }
    }

    public String info() {
        String info = "";
        info += "Kode : " + kode + "\n";
        for (Kursi kursi : arrayKursi) {
            info += kursi.info();
        };
        return info;
    }
}

public class practicum4 {

    public static void main(String[] args) {
        Penumpang p = new Penumpang("12345", "Mr. Krab");
        Gerbong gerbong = new Gerbong("A", 10);
        gerbong.setPenumpang(p, 1);
        System.out.println(gerbong.info());

        
         Penumpang budi = new Penumpang("45678", "Budi");
         gerbong.setPenumpang(budi, 1);
        
             
         
         System.out.println(gerbong.info());
         
    }
}
