/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet10;

/**
 *
 * @author Rajendra Rakha
 */
import java.util.*;

public class QueueMain {

    public static void menu() {
        System.out.println("================================");
        System.out.println("               Option Menu");
        System.out.println("================================");
        System.out.println("          1. Enqueue            ");
        System.out.println("          2. Dequeue            ");
        System.out.println("          3. Print              ");
        System.out.println("          4. Peek               ");    
        System.out.println("          5. PeekRear           ");
        System.out.println("          6. EXIT           ");
        System.out.println("================================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Maximum Number Of Queue : ");
        int n = sc.nextInt();
        QueueClass Q = new QueueClass(n);
        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Enter New Data: ");
                    int dataMasuk = sc.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data Retrieved : " + dataKeluar);
                        break;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.peekRear();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
        System.out.println();
        System.out.println("====================");
        System.out.println("        Thank You        ");
        System.out.println("====================");
    }
}



