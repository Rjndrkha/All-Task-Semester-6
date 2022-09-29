package Task;

/**
 *
 * @author Rajendra Rakha
 */
import java.util.*;

public class BangunRuang {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String menu;
        double sisi, luas, tinggi, alas, volume, jari2;
        String menu2, menu3;

        System.out.println("pilih menu 1/2");
        menu = sc.nextLine();
        if (menu.equals("1")) {
            System.out.println("a.Persegi");
            System.out.println("b.Segitiga");
            System.out.print("a/b?");
            menu2 = sc.nextLine();
            if (menu2.equals("a")) {
                System.out.print("Masukkan sisi: ");
                sisi = sc.nextDouble();
                luas = sisi * sisi;
                System.out.println("Luas persegi: " + luas);
            } else if (menu2.equals("b")) {
                System.out.print("Masukkan alas: ");
                alas = sc.nextDouble();
                System.out.print("Masukkan tinggi: ");
                tinggi = sc.nextDouble();
                luas = alas * tinggi / 2;
                System.out.println("Luas persegi: " + luas);
            } else {

            }
        } else if (menu.equals("2")) {
            System.out.println("a.Kubus");
            System.out.println("b.Tabung");
            System.out.print("a/b?");
            menu3 = sc.nextLine();
            if (menu3.equals("a")) {
                System.out.print("Masukkan sisi: ");
                sisi = sc.nextDouble();
                volume = sisi * sisi * sisi;
                System.out.println("Volume Kubus: " + volume);
            } else if (menu3.equals("b")) {
                System.out.print("Masukkan jari-jari: ");
                jari2 = sc.nextDouble();
                System.out.print("Masukkan tinggi: ");
                tinggi = sc.nextDouble();

                volume = 3.14 * jari2 * jari2 * tinggi;
                System.out.println("Volume Tabung: " + volume);
            } else {

            }
        }
    }

}
