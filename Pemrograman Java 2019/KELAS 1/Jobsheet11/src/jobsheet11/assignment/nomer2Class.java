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
class nodeGudang {

    String nama, jenis;
    nodeGudang next;

    public nodeGudang(String nama, String jenis, nodeGudang next) {
        this.nama = nama;
        this.jenis = jenis;
        this.next = next;
    }
}

public class nomer2Class {

    nodeGudang head;
    int size;

    public nomer2Class() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String nama, String alamat) {
        head = new nodeGudang(nama, alamat, head);
        size++;
    }

    public void add(String nama, String alamat) {
        if (isEmpty()) {
            addFirst(nama, alamat);
        } else {
            nodeGudang tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new nodeGudang(nama, alamat, null);
            size++;
        }
    }

    public void getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Kosong");
        }
        System.out.println("Nama Barang = " + head.nama);
        System.out.println("Jenis Barang = " + head.jenis);
    }

    public void getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Kosong");
        }
        nodeGudang tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        System.out.println("Nama Barang = " + head.nama);
        System.out.println("Jenis Barang = " + head.jenis);
    }

    public void cari(String cari) {
        nodeGudang tmp = head;
        int a = 0;
        for (int i = 1; i < size; i++) {
            if (!cari.equalsIgnoreCase(tmp.nama)) {
                a = i;
            }
            tmp = tmp.next;
        }
        System.out.println("Data yang dicari : ");
        System.out.println();
        System.out.println("Ada di urutan ke- " + (a + 1));
        System.out.println("Nama Barang = " + tmp.nama);
        System.out.println("Jenis Barang = " + tmp.jenis);
    }

    public void searchindex(int index) {
        nodeGudang tmp = head;
        for (int i = 1; i < index; i++) {
            tmp = tmp.next;
        }
        System.out.println("Nama Barang = " + tmp.nama);
        System.out.println("Jenis Barang = " + tmp.jenis);
    }

    public void print() {
        if (!isEmpty()) {
            nodeGudang tmp = head;
            System.out.println("NAMA " + "\t" + "JENIS ");
            while (tmp != null) {

                System.out.print(tmp.nama + "\t");
                System.out.println(tmp.jenis);
                tmp = tmp.next;

            }
            System.out.println();
        } else {
            System.out.println("Kosong");
        }
    }

    public void removeByValue(String nma) {
        nodeGudang prev = head;
        nodeGudang cur = head.next;
        for (int i = 1; i < size; i++) {
            if (nma != prev.nama) {
                prev = prev;
                cur = prev.next;
            }
        }
        prev.next = cur.next;
        size--;
    }
}
