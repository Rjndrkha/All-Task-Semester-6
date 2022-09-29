/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rajendra.relasiclass.Assignment;

/**
 *
 * @author Rajendra Rakha
 */
public class DataPelanggan {

    private int Id;
    private String nama;

    public DataPelanggan() {
    }

    public DataPelanggan(int id, String nama) {
        this.Id = id;
        this.nama = nama;

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void info() {
        System.out.println("Id Pelanggan\t\t: " + this.Id);
        System.out.println("Nama \t\t: " + this.nama);

    }
}
