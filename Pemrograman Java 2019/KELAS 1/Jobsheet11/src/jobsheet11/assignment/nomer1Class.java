/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet11.assignment;

/**
 *
 * @author Rajendra Rakha
 */
class nodeMhs {

    String nim, nama, alamat;
    nodeMhs next;

    public nodeMhs(String nim, String nama, String alamat, nodeMhs next) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.next = next;
    }
}

public class nomer1Class {

    nodeMhs head;
    int size;

    public nomer1Class() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String nim, String nm, String almt) {
        head = new nodeMhs(nim, nm, almt, head);
        size++;
    }

    public void add(String nim, String nm, String almt) {
        if (isEmpty()) {
            addFirst(nim, nm, almt);
        } else {
            nodeMhs tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new nodeMhs(nim, nm, almt, null);
            size++;
        }
    }

    public void addLast(String nim, String nm, String almt) {
        if (isEmpty()) {
            addFirst(nim, nm, almt);
        } else {
            nodeMhs tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new nodeMhs(nim, nm, almt, null);
            size++;
        }
    }

    public void removeByValue(String nim) {
        nodeMhs prev = head;
        nodeMhs cur = head.next;
        for (int i = 1; i < size; i++) {
            if (nim != prev.nim) {
                prev = prev;
                cur = prev.next;
            }
        }
        prev.next = cur.next;
        size--;
    }

    public void cari(String cari) {
        nodeMhs tmp = head;
        for (int i = 1; i < size; i++) {
            if (cari != tmp.nim) {
                tmp = tmp.next;
            }
        }
        System.out.println("        Data yang dicari ");
        System.out.println("NIM " + "\t" + "NAMA" + "\t" + "ALAMAT ");
        System.out.print(tmp.nim + "\t");
        System.out.print(tmp.nama + "\t");
        System.out.println(tmp.alamat + "\t");
    }

    void print() {
        if (!isEmpty()) {
            nodeMhs tmp = head;
            System.out.println("=========================");
            System.out.println("     DATA MAHASISWA      ");
            System.out.println("=========================");
            System.out.println("NIM " + "\t" + "NAMA" + "\t" + "ALAMAT ");
            while (tmp != null) {
                System.out.print(tmp.nim + "\t");
                System.out.print(tmp.nama + "\t");
                System.out.println(tmp.alamat);
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("KOSONG!!");
        }
    }
}
