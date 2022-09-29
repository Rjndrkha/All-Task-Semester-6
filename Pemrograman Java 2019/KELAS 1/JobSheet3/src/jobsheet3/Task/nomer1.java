/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet3.Task;

/**
 *
 * @author Rajendra Rakha
 */
public class nomer1 {

    //variabel global
    public int nilaiTugas[], nilaiKuis[], nilaiUts[], nilaiUas[], nilai[];
    public String namaMhs[];
    public double TotalNilai, allT;

    public nomer1(int a) {
        namaMhs = new String[a];
        nilaiTugas = new int[a];
        nilaiKuis = new int[a];
        nilaiUas = new int[a];
        nilaiUts = new int[a];
    }

    //caraBF
    double Rumus(int nilaiTugas, int nilaiKuis, int nilaiUas, int nilaiUts) {
        double nilTug, nilKui, nilaiUTS, nilaiUAS;
        nilTug = nilaiTugas * 0.3;

        nilKui = nilaiKuis * 0.2;

        nilaiUTS = nilaiUts * 0.2;

        nilaiUAS = nilaiUas * 0.3;
        return nilTug + nilKui + nilaiUAS + nilaiUTS;

    }

    //caara DC
    double all(double arr[]) {
        double amount = arr.length, sum = 0, average;
        for (int i = 0; i < amount; i++) {
            sum += arr[i];
        }
        average = sum / amount;
        return average;
    }

}
