package frontend;

import backend.*;

public class TestBackend {

    public static void main(String[] args) {

        Kategori kat1 = new Kategori("Novel", "Koleksi buku novel");
        Kategori kat2 = new Kategori("Referensi", "Buku referensi ilmiah");
        Kategori kat3 = new Kategori("Komik", "Komik anak-anak");

        kat1.save();
        kat2.save();
        kat3.save();

        kat2.setKeterangan("Koleksi buku referensi ilmiah");
        kat2.save();

        kat3.delete();

        for (Kategori k : new Kategori().getAll()) {
            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }

        for (Kategori k : new Kategori().search("ilmiah")) {
            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }

        Anggota ang1 = new Anggota("Rajendra", "Malang", "0812326109");
        Anggota ang2 = new Anggota("Rakha", "Surabaya", "0823231241");
        Anggota ang3 = new Anggota("Arya", "Jakarta", "081303556400");

        // test insert
        ang1.save();
        ang2.save();
        ang3.save();

        // test update
        ang2.setAlamat("Palembang");
        ang2.save();

        //test delete
        ang1.delete();

        // test select all
        for (Anggota a : new Anggota().getAll()) {
            System.out.println("Nama: " + a.getNama() + ", Alamat: " + a.getAlamat() + ", Telepon: " + a.getTelepon());
        }

        for (Anggota a : new Anggota().search("Malang")) {
            System.out.println("Nama: " + a.getNama() + ", Alamat: " + a.getAlamat() + ", Telepon: " + a.getTelepon());
        }

        Kategori novel = new Kategori().getById(10);
        Kategori referensi = new Kategori().getById(11);

        Buku buku1 = new Buku(novel, "Timun Mas", "Elex Media", "Bang Supit");
        Buku buku2 = new Buku(referensi, "Metode Linier", "Springer", "Alex Baldwin");
        Buku buku3 = new Buku(novel, "Bintang Terang", "Erlangga", "Mat Sewoot");

        // test insert
        buku1.save();
        buku2.save();
        buku3.save();

        // test update
        buku2.setJudul("Aljabar Linier");
        buku2.save();

        // test delete
        buku3.delete();

        // test select all
        for (Buku b : new Buku().getAll()) {
            System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: " + b.getJudul());
        }

        // test search
        for (Buku b : new Buku().search("timun")) {
            System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: " + b.getJudul());
        }

        Anggota ang = new Anggota().getById(10);
        // Anggota ang2 = new Anggota().getById(11);

        Buku buk = new Buku().getById(4);
        Buku buk2 = new Buku().getById(1);

        Peminjaman pen = new Peminjaman(ang, buk, "2000/03/13", "2000/01/10");
        Peminjaman pen2 = new Peminjaman(ang2, buk2, "2020/01/03", "2020/11/10");

        pen.setTanggalKembali("2021/10/10");
        pen2.save();
        pen.save();

        for (Peminjaman b : new Peminjaman().getAll()) {
            System.out.println("IDAnggota: " + b.getAnggota().getIdAnggota()
                    + ", ID Buku: " + b.getBuku().getIdbuku());
        }
    }

}
