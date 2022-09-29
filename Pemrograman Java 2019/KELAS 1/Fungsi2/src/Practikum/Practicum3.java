
package Practikum;
import java.util.*;

public class Practicum3 {

    static double hitungBunga(double saldo, int tahun) {
        if (tahun == 0) {
            return (saldo);
        } else {
            return (1.11 * hitungBunga(saldo, tahun - 1));
        }
    }

    public static void main(String args[]) {
        int saldoAwal, tahun;
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah Saldo Awal: ");
        saldoAwal = sc.nextInt();
        System.out.println("Lamanya Menabung (tahun): ");
        tahun = sc.nextInt();
        System.out.print("jumlah Uang Setelah " + tahun + "tahun: ");
        System.out.println(hitungBunga(saldoAwal, tahun));
    }
}
