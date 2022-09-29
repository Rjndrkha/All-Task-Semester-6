/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizrajendra;

/**
 *
 * @author Rajendra Rakha , Code : A
 */
import java.util.*;

public class QuizRajendraMain {
    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sca = new Scanner(System.in);
        System.out.print("Input Jumlah Murid : ");
        int student = sc.nextInt();

        QuizRajendraMain[] array = new QuizRajendraMain[student];
        System.out.println();

        QuizRajendra1 a = new QuizRajendra1(student);

        for (int i = 0; i < array.length; i++) {

            System.out.print("Input Name : ");
            a.namaMhs[i] = sca.nextLine();
            System.out.print("Input Score : ");
            a.nilaiTugas[i] = sc.nextDouble();
            a.sum += a.nilaiTugas[i];
            System.out.println();

        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("==================================");
            System.out.println("Nama Mahasiswa : " + a.namaMhs[i]);
            System.out.println("Nilai Tugas : " + a.nilaiTugas[i]);
            if (a.nilaiTugas[i] >= 0 && a.nilaiTugas[i] <= 50) {
                System.out.println("You Get Score C ");
            } else if (a.nilaiTugas[i] >= 51 && a.nilaiTugas[i] <= 80) {
                System.out.println("You Get Score B ");
            } else if (a.nilaiTugas[i] >= 81 && a.nilaiTugas[i] <= 100) {
                System.out.println("You Get Score A");
            }
            System.out.println("==================================");
            System.out.println();
        }

        System.out.println("==Cara Dengan Brute Force==");
        System.out.println("Average Score Mahasiswa : " + a.Rumus());
        //System.out.println("==Cara Dengan Divide Conquer==");

    }

}
