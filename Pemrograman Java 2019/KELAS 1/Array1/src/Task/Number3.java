package Task;

import java.util.*;

public class Number3 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        String[] Word = {"A", "B+", "B", "C+", "C", "D"};
        double[] Number = {4, 3.5, 3, 2.5, 2, 1};
        double Number1 = 0, rata;

        System.out.print("Input Jumlah MatKul Yang Anda Pilih : ");
        int MK = sc.nextInt();

        String[] MHS = new String[MK];
        for (int i = 0; i < MHS.length; i++) {
            System.out.print("Masukan Nama MK : ");
            MHS[i] = input.nextLine();
        }
        System.out.println("-----------------------------------------");
        for (String i : MHS) {
            System.out.print("Input Bobot SKS " + i + " : ");
            double Bobot = sc.nextDouble();
            System.out.print("Input Score " + i + " (A,B+,B,C+,C,D): ");
            String nilai = input.nextLine();
            System.out.println("-----------------------------------------");
            for (int j = 0; j < Word.length; j++) {
                if (nilai.equalsIgnoreCase(Word[j])) {
                    Number1 += Number[j];
                }
            }
        }
        rata = Number1 / MK;
        System.out.print("Your IP Semester is : " + rata);
    }
}
