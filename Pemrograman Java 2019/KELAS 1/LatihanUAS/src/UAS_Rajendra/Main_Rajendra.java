/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_Rajendra;

/**
 *
 * @author Rajendra Rakha
 */
import java.text.SimpleDateFormat;

import java.util.*;

public class Main_Rajendra {

    public static void SubMenuDelete() {
        System.out.println("1. Index");
        System.out.println("2. Clear");
        System.out.println("+--------------------------------------------------+");
    }

    public static void menu() {
        System.out.println("1. Book In");
        System.out.println("2. Book Out");
        System.out.println("3. Broken Book");
        System.out.println("4. Print All Book");
        System.out.println("5. Book Searching");
        System.out.println("6. Remove");
        System.out.println("7. Sorting With Ascending (Based On Code)");
        System.out.println("8. Exit");
    }

    private static void printBook(DoubleLinkedList_Rajendra<Book_Rajendra> bookList, int index) {
        try {
            System.out.printf("%d", index);
            System.out.printf(" %5s  %5s %10s %9s %7s\n", bookList.get(index).getCode(), bookList.get(index).getTitle(), bookList.get(index).getPublisher(), bookList.get(index).getStock(), bookList.get(index).getBroken());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void exit() {
        System.out.println("==========================================  ");
        System.out.println("                   THANK YOU                        ");
        System.out.println("             UAS Rajendra Rakha                  ");
        //Date&time Format
        Date Tanggal = new Date();
        SimpleDateFormat tgl;
        tgl = new SimpleDateFormat("E,dd/MM/yyy hh:mm:ss a");
        System.out.println("     == " + tgl.format(Tanggal) + " ==");
        //Date&time Format
        System.out.println("===========================================");
        System.out.println("                   Supervisor               ");
        for (int space = 0; space < 4; space++) {
            System.out.println();
        }
        System.out.println("       VIVIN AYU LESTARI, S.Pd., M.Kom  ");
        System.out.println("    ___________________________________ ");

        System.exit(0);
    }

    //
    //MAIN FUNCTION
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu, index;
        Book_Rajendra book;
        DoubleLinkedList_Rajendra<Book_Rajendra> bookList = new DoubleLinkedList_Rajendra<>();
        System.out.println("\t            1941720080-23");
        System.out.println("\t====UAS RAJENDRA RAKHA====");
        System.out.println("\t  ===WELCOME TO MY MENU===");
        System.out.println("\t         ==ODD QUESTION==");
        //Date&time Format
        Date Tanggal = new Date();
        SimpleDateFormat tgl;
        tgl = new SimpleDateFormat("E,dd/MM/yyy hh:mm:ss a");
        System.out.println("\t== " + tgl.format(Tanggal) + " ==");
        //Date&time Format

        try {
            while (true) {

                System.out.println("===================================================================");
                menu();
                System.out.println();
                System.out.println("Input Selected Menu ");
                menu = Util.getIntInput(">> ", input, 8);

                switch (menu) {
                    case 1:
                        System.out.println("===================================================================");
                        int code = Util.getIntInput("Code: ", input, 0);
                        String title = Util.getStringInput("Title: ", input);
                        String publisher = Util.getStringInput("Publisher: ", input);
                        int stock = Util.getIntInput("Stock: ", input, 0);
                        int broken = Util.getIntInput("Number of Broken Book: ", input, 0);

                        book = new Book_Rajendra(code, title, publisher, stock, broken);

                        bookList.addBook(bookList, book);
                        System.out.println();
                        break;

                    case 2:
                        System.out.println("===================================================================");
                        System.out.println();
                        index = Util.getIntInput("Input Index of Book: ", input, 0);
                        book = bookList.get(index);

                        System.out.printf("id %5s %-5s %10s %5s %5s\n", "Code", "Title", "Publisher", "Stock", "Broken");
                        printBook(bookList, index);

                        int reduce = Util.getIntInput("Reduce book (Based on Stock): ", input, book.getStock());
                        bookList.get(index).setStock(book.getStock() - reduce);
                        System.out.println();
                        System.out.println("After Reduced ");
                        System.out.printf("id %5s %-5s %10s %5s %5s\n", "Code", "Title", "Publisher", "Stock", "Broken");
                        for (int i = 0; i < bookList.size(); i++) {
                            printBook(bookList, i);
                        }
                        break;
                    case 3:
                        System.out.println("===================================================================");
                        index = Util.getIntInput("Input Index of Book: ", input, 0);
                        book = bookList.get(index);

                        System.out.printf("id %5s %-5s %10s %5s %5s\n", "Code", "Title", "Publisher", "Stock", "Broken");
                        printBook(bookList, index);

                        int addBroken = Util.getIntInput("Broken book: ", input, 0);
                        bookList.get(index).setBroken(book.getBroken() + addBroken);
                        break;
                    case 4:
                        System.out.println("===================================================================");
                        System.out.printf("id %5s %-5s %10s %5s %5s\n", "Code", "Title", "Publisher", "Stock", "Broken");
                        for (int i = 0; i < bookList.size(); i++) {
                            printBook(bookList, i);
                        }
                        break;
                    case 5:
                        System.out.println("===================================================================");
                        searchBook(input, bookList);
                        break;
                    case 6:
                        SubMenuDelete();
                        int subB = Util.getIntInput(">>", input, 0);
                        if (subB == 1) {
                            int delIdx = Util.getIntInput("Input index of data  :", input, 0);
                            try {
                                bookList.remove(delIdx);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        } else if (subB == 2) {
                            bookList.clear();
                        }
                        break;
                    case 7:
                        System.out.println("First Data : ");
                        System.out.println("===================================================================");
                        System.out.printf("id %5s %-5s %10s %5s %5s\n", "Code", "Title", "Publisher", "Stock", "Broken");
                        for (int i = 0; i < bookList.size(); i++) {
                            printBook(bookList, i);
                        }
                        System.out.println("\nData Ascending : ");
                        System.out.println("===================================================================");
                        System.out.printf("id %5s %-5s %10s %5s %5s\n", "Code", "Title", "Publisher", "Stock", "Broken");
                        for (int i = 0; i < bookList.size(); i++) {
                            bookList.bubbleSortAscending();
                            printBook(bookList, i);
                        }
                        break;
                    case 8:
                        exit();
                        break;
                    default:
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void searchBk() {
        System.out.println("1. Search by Code");
        System.out.println("2. Search by Title");
        System.out.println("3. Search by Publisher");
    }

    private static void searchBook(Scanner input, DoubleLinkedList_Rajendra<Book_Rajendra> bookList) {
        boolean found = false;
        searchBk();
        int searchMenu = Util.getIntInput("Input Search by: ", input, 3);
        System.out.println("===================================================================");

        if (searchMenu == 1) {
            int code = Util.getIntInput("Input Book code", input, 0);
            System.out.printf("id %5s %-5s %10s %5s %5s\n", "Code", "Title", "Publisher", "Stock", "Broken");
            try {
                for (int i = 0; i < bookList.size(); i++) {
                    if (bookList.get(i).getCode() == code) {
                        printBook(bookList, i);
                        found = true;
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (searchMenu == 2) {
            String title = Util.getStringInput("Input Book title: ", input);
            System.out.printf("id %5s %-5s %10s %5s %5s\n", "Code", "Title", "Publisher", "Stock", "Broken");
            try {
                for (int i = 0; i < bookList.size(); i++) {
                    if (bookList.get(i).getTitle().equalsIgnoreCase(title)) {
                        printBook(bookList, i);
                        found = true;
                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            String publisher = Util.getStringInput("Input Book Publisher: ", input);
            System.out.printf("id %5s %-5s %10s %5s %5s\n", "Code", "Title", "Publisher", "Stock", "Broken");
            try {
                for (int i = 0; i < bookList.size(); i++) {
                    if (bookList.get(i).getPublisher().equalsIgnoreCase(publisher)) {
                        printBook(bookList, i);
                        found = true;
                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        if (!found) {
            System.out.println("Book not Found!");
        }
    }

}
