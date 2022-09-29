package Task;

import java.util.*;

public class Restoran {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int bulan, tahun, jumlahhari;

        System.out.println("masukkan tahun ");
        tahun = sc.nextInt();

        if (tahun % 4 == 0) {
            System.out.println("kabisat");
            System.out.println("januari = 31 ");
            System.out.println("februari = 29 ");
            System.out.println("maret = 31 ");
            System.out.println("april = 30");
            System.out.println("mei = 31");
            System.out.println("juni = 30");
            System.out.println("july = 31");
            System.out.println("agust = 30");
            System.out.println("sept = 31");
            System.out.println("okt =  30 ");
            System.out.println("nov =  31 ");
            System.out.println("des = 30 ");
            jumlahhari = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 30 + 31 + 30 + 31 + 30;
            System.out.println("your total days " + jumlahhari);

        } else {
            System.out.println("bukan tahun kabisat ");
            System.out.println("januari = 31 ");
            System.out.println("februari = 28 ");
            System.out.println("maret = 31 ");
            System.out.println("april = 30");
            System.out.println("mei = 31");
            System.out.println("juni = 30");
            System.out.println("july = 31");
            System.out.println("agust = 30");
            System.out.println("sept = 31");
            System.out.println("okt =  30 ");
            System.out.println("nov =  31 ");
            System.out.println("des = 30 ");
            System.out.println("jumlah hari 366");
        }
}
}
}
