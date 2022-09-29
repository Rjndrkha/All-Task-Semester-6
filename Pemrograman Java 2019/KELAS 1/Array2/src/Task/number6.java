package Task;

import java.util.*;

public class number6 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a;
        char[] kode = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        String[] Kota = {"BANTEN", "JAKARTA", "BANDUNG", "CIREBON", "BOGOR", "PEKALONGAN", "SEMARANG", "SURABAYA", "MALANG", "TEGAL"};
        char[][] kota = new char[10][12];

        System.out.println("=====Kode plat Nomor=====");
        System.out.println("=========================");
        for (a = 0; a < 10; a++) {
            kota[a] = Kota[a].toCharArray();
            System.out.print(kode[a] + "=");
            System.out.println(Kota[a]);
        }
        System.out.println("=========================");
    }
}
