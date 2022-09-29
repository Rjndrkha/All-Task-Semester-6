/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author MeiMei
 */

//Meuti Zari Annisa
//TI-1H

public class LibraryMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryLL data = new LibraryLL();
        int menuCh;
        int repeat = 0;
        System.out.println("+--------------------------------------------------+");
        System.out.println("|                 WELCOME TO 1H LIBRARY            |");
        System.out.println("+--------------------------------------------------+");
        do {
            Menu();
            menuCh = sc.nextInt();
            switch (menuCh) {

                case 1:
                    SubMenuAdd();
                    int subA = sc.nextInt();
                    if (subA == 1) {
                        System.out.print("Input name of book to add first : ");
                        String addname = sc.next();
                        System.out.print("Input author to add first : ");
                        String addauth = sc.next();
                        System.out.print("Input stock of book to add first : ");
                        int addstock = sc.nextInt();
                        data.addFirst(addname, addauth, addstock);
                    } else if (subA == 2) {
                        System.out.print("Input name of book to add : ");
                        String name = sc.next();
                        System.out.print("Input auhtor to add : ");
                        String auth = sc.next();
                        System.out.print("Input stock of book to add : ");
                        int stock = sc.nextInt();
                        System.out.print("Input index of book : ");
                        int index = sc.nextInt();
                        try {
                            data.add(name, auth, stock, index);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    } else if (subA == 3) {
                        System.out.print("Input name of book to add : ");
                        String namelast = sc.next();
                        System.out.print("Input auhtor to add : ");
                        String authlast = sc.next();
                        System.out.print("Input stock of book to add : ");
                        int stocklast = sc.nextInt();

                        data.addLast(namelast, authlast, stocklast);
                    }
                    break;
                case 2:
                    SubMenuDelete();
                    int subB = sc.nextInt();
                    if (subB == 1) {
                        System.out.print("Input index of data  : ");
                        int delIdx = sc.nextInt();
                        try {
                            data.remove(delIdx);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    } else if (subB == 3) {
                        data.clear();
                    }
                    break;
                case 3:
                    SubMenuLoan();
                    int subC = sc.nextInt();
                    if (subC == 1) {
                        System.out.print("Input name of book  : ");
                        String bookName = sc.next();
                        try {
                            data.searchByKeyBorrow(bookName);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }

                    } else if (subC == 2) {
                        System.out.print("Input name of book : ");
                        String retBook = sc.next();
                        try {
                            data.searchByKeyReturn(retBook);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case 4:
                    data.insertionSort();
                    break;
                case 5:
                    System.out.println("Thankyou!");
                    break;
            }
        } while (menuCh == 1 || menuCh == 2 || menuCh == 3 || menuCh == 4);

    }

    public static void Menu() {
        System.out.println("1. Add");
        System.out.println("2. Delete");
        System.out.println("3. Loan");
        System.out.println("4. Print");
        System.out.println("5. Exit");
        System.out.println("+--------------------------------------------------+");
    }

    public static void SubMenuAdd() {
        System.out.println("1. First");
        System.out.println("2. Index");
        System.out.println("3. Last");
        System.out.println("+--------------------------------------------------+");
    }

    public static void SubMenuDelete() {
        System.out.println("1. Index");
        System.out.println("3. Clear");
        System.out.println("+--------------------------------------------------+");
    }

    public static void SubMenuLoan() {
        System.out.println("1. Borrow");
        System.out.println("2. Return");
        System.out.println("+--------------------------------------------------+");
    }
}
