/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet10.Assignment;

/**
 *
 * @author Rajendra Rakha
 */
import java.util.*;

public class QueueModifMain {

    public static void menu() {
        System.out.println("===================================");
        System.out.println("                 Option Menu");
        System.out.println("===================================");
        System.out.println("            1. Enqueue             ");
        System.out.println("            2. Dequeue             ");
        System.out.println("            3. Print               ");
        System.out.println("            4. Peek                ");
        System.out.println("            5. Peek Rear           ");
        System.out.println("            6. Peek Position       ");
        System.out.println("            7. Peek At             ");
        System.out.println("            8. Exit             ");
        System.out.println("===================================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Choose;
        System.out.print("Enter The Maximum Number Of Queue : ");
        int n = sc.nextInt();

        QueueClassModif qm = new QueueClassModif(n);
        do {
            menu();
            Choose = sc.nextInt();
            switch (Choose) {
                case 1:
                    System.out.print("Enter New Data : ");
                    int dataMasuk = sc.nextInt();
                    qm.Enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = qm.Dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data Retrieved : " + dataKeluar);
                        break;
                    }
                case 3:
                    qm.print();
                    break;
                case 4:
                    qm.peek();
                    break;
                case 5:
                    qm.peekRear();
                    break;
                case 6:
                    System.out.print("Enter the Number you are looking for : ");
                    int no = sc.nextInt();
                    qm.peekPosition(no);
                    break;
                case 7:
                    System.out.print("Enter the position you are looking for : ");
                    int pos = sc.nextInt();
                    qm.peekAt(pos);
            }
        } while (Choose == 1 || Choose == 2 || Choose == 3 || Choose == 4 || Choose == 5 || Choose == 6 || Choose == 7);
        System.out.println("========================");
        System.out.println("        TERIMAKASIH        ");
        System.out.println("========================");
    }
}
