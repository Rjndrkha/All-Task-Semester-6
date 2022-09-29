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
class pegawai {

    private String nip, nama;

    public pegawai(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String info() {
        String info = "";
        info += "Nip : " + this.nip + "\n";
        info += "Nama : " + this.nama + "\n";
        return info;
    }
}

class KeretaApi {

    private String nama, kelas;
    private pegawai masinis;
    private pegawai asisten;

    public KeretaApi(String nama, String kelas, pegawai masinis) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }

    public KeretaApi(String nama, String kelas, pegawai masinis, pegawai asisten) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public pegawai getMasinis() {
        return masinis;
    }

    public void setMasinis(pegawai masinis) {
        this.masinis = masinis;
    }

    public pegawai getAsisten() {
        return asisten;
    }

    public void setAsisten(pegawai asisten) {
        this.asisten = asisten;
    }

    public String info() {
        String info = "";
        info += "Nama : " + this.nama + "\n";
        info += "Kelas : " + this.kelas + "\n";
        info += "\n";
        info += "Masinis : \n" + this.masinis.info() + "\n";

        if (this.asisten != null) {
            info += "Asisten : \n" + this.asisten.info() + "\n";
        }

        return info;
    }
}

public class practicum3 {

    public static void main(String[] args) {
        pegawai masinis = new pegawai("1234", "Spongebob");
        pegawai asisten = new pegawai("4567", "Patrick Star");
        KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis, asisten);
        System.out.println(keretaApi.info());
    }
}
