/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author Rajendra Rakha
 */
public class PesanTiket {

    int indeks;
    TiketClass[] data = new TiketClass[5];

    void tambah(TiketClass m) {
        if (indeks < data.length) {
            data[indeks] = m;
            indeks++;
        } else {
            System.out.println("Data Sudah Penuh");
        }
    }

    void tampil() {
        for (TiketClass m : data) {
            m.tampil();
            System.out.println("	");
        }
    }

    void bubleSort() {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 1; j < data.length - i; j++) {
                if (data[j].TicketPrice < data[j - 1].TicketPrice) {
                    TiketClass tmp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < data.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j].TicketPrice < data[idxMin].TicketPrice) {
                    idxMin = j;
                }
            }
            TiketClass tmp = data[idxMin];
            data[idxMin] = data[i];
            data[i] = tmp;
        }

    }

    void maskapai() {
        data[0] = new TiketClass();
        data[0].Maskapai = "Lion Air";
        data[0].DepartureTime = (float) 12.35;
        data[0].TicketPrice = 650000;
        data[0].durasiTempuh = (int) 1.5;
        data[1] = new TiketClass();
        data[1].Maskapai = "Garuda Indonesia";
        data[1].DepartureTime = (float) 17.15;
        data[1].TicketPrice = 1000000;
        data[1].durasiTempuh = (int) 2;
        data[2] = new TiketClass();
        data[2].Maskapai = "Batik Air";
        data[2].DepartureTime = (float) 10.40;
        data[2].TicketPrice = 725000;
        data[2].durasiTempuh = (int) 2.5;
        data[3] = new TiketClass();
        data[3].Maskapai = "Wings Air";
        data[3].DepartureTime = (float) 20.00;
        data[3].TicketPrice = 1500000;
        data[3].durasiTempuh = 1;
        data[4] = new TiketClass();
        data[4].Maskapai = "Sriwijaya Air";
        data[4].DepartureTime = (float) 22.25;
        data[4].TicketPrice = 450000;
        data[4].durasiTempuh = 2;
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". Nama Maskapai = " + data[i].Maskapai);
            System.out.println("Waktu Berangkat = " + data[i].DepartureTime);
            System.out.println("Harga Tiket = " + data[i].TicketPrice);
            System.out.println("Durasi Tempuh (jam) = " + data[i].durasiTempuh);
            System.out.println();
        }
    }
}
