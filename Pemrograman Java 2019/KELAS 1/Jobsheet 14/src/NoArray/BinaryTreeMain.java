/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NoArray;

/**
 *
 * @author Rajendra Rakha
 */
import java.util.*;

public class BinaryTreeMain {

    static void menu() {
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("  +++   SELECTED MENU TREE  +++");
        System.out.println("---------------------------------");
        System.out.println("             PILIH MENU :        ");
        System.out.println("         1. ADD                  ");
        System.out.println("         2. DELETE               ");
        System.out.println("         3. FIND                 ");
        System.out.println("         4. TRAVERSE INORDER     ");
        System.out.println("         5. TRAVERSE PREORDER    ");
        System.out.println("         6. TRAVERSE POSTORDER   ");
        System.out.println("         7. EXIT                 ");
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        int menu, angka;
        try {
            do {
                menu();
                System.out.print(">> ");
                menu = sc.nextInt();
                System.out.println("---------------------------------");
                System.out.println();
                if (menu == 1) {
                    System.out.print("Masukkan Data : ");
                    angka = sc.nextInt();
                    bt.add(angka);
                } else if (menu == 2) {
                    System.out.print("Masukkan Data : ");
                    angka = sc.nextInt();
                    bt.delete(angka);
                } else if (menu == 3) {
                    System.out.print("Masukkan Data	: ");
                    angka = sc.nextInt();
                    System.out.println("Find" + bt.find(angka));
                } else if (menu == 4) {
                    bt.traverseInOrder(bt.root);
                } else if (menu == 5) {
                    bt.traversePreOrder(bt.root);
                } else if (menu == 6) {
                    bt.traversePostOrder(bt.root);
                } else if (menu == 7) {
                    System.out.println("PROGRAM ANDA TELAH SELESAI!");
                    System.exit(0);
                }
            } while (menu == 1 || menu == 2 || menu == 3 || menu == 4 || menu == 5 || menu == 6);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
