/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet11;

/**
 *
 * @author Rajendra Rakha
 */
import java.util.*;

public class LinkedListModifMain {

    static Scanner sc = new Scanner(System.in);
    static LinkedListModif data = new LinkedListModif();
    static int value, index, selcMenu;

    public static void main(String[] args) {
        System.out.println("==================================");
        System.out.println("   *** LINKED LISTS PROGRAM ***   ");
        System.out.println("==================================");
        do {
            menu();
            subMenu(selcMenu);
        } while (selcMenu == 1 || selcMenu == 2 || selcMenu == 3 || selcMenu == 4 || selcMenu > 5 || selcMenu < 1);

    }

    public static void menu() {
        String menu = "1. Add \n2. Remove \n3. Search \n4. Print \n5. Exit";
        System.out.println("\n----------------------------------");
        System.out.println("          OPERATION MENU");
        System.out.println("----------------------------------\n");
        System.out.println(menu);
        System.out.print("\nEnter selection : ");
        selcMenu = sc.nextInt();
    }

    public static int inputSubMenu() {
        int pilSubMenu;
        System.out.print("\nEnter selection : ");
        pilSubMenu = sc.nextInt();
        return pilSubMenu;
    }

    public static int inputnilai() {
        int inNilai;
        System.out.print("\nEnter value : ");
        inNilai = sc.nextInt();
        return inNilai;
    }

    public static int inputIndex() {
        int inIndex;
        System.out.print("\nEnter index : ");
        inIndex = sc.nextInt();
        return inIndex;
    }

    public static void inputSalah() {
        System.out.println("\nOption not available!");
    }

    public static void subMenu(int selcMenu) {
        String menuTambah = "1. Add (First) \n2. Add (Index) \n3. Add (Value) \n4. Add (Last)";
        String menuHapus = "1. Remove (Index) \n2. Remove (Value) \n3. Clear";
        String menuCari = "1. Search (Index) \n2. Search (Value)";
        int jwb;
        if (selcMenu == 1) {
            System.out.println("\n----------------------------------");
            System.out.println("                ~ Add Menu ~\n");
            System.out.println(menuTambah);
            jwb = inputSubMenu();
            menuAdd(jwb);
            System.out.println();
        } else if (selcMenu == 2) {
            System.out.println("\n----------------------------------");
            System.out.println("              ~ Remove Menu ~\n");
            System.out.println(menuHapus);
            jwb = inputSubMenu();
            menuRemove(jwb);
            System.out.println();
        } else if (selcMenu == 3) {
            System.out.println("\n----------------------------------");
            System.out.println("              ~ Search Menu ~\n");
            System.out.println(menuCari);
            jwb = inputSubMenu();
            menuSearch(jwb);
            System.out.println();
        } else if (selcMenu == 4) {
            System.out.println("\n----------------------------------");
            System.out.println("             Data Linked List ~\n");
            data.print();
        } else if (selcMenu == 5) {
            //System.exit(0);
            System.out.println("\n----------------------------------");
            System.out.println("                  Thank You");
            System.out.println("----------------------------------");
        } else {
            inputSalah();
        }
    }

    public static void menuAdd(int jwb) {
        switch (jwb) {
            case 1:
                value = inputnilai();
                data.addFirst(value);
                break;
            case 2:
                value = inputnilai();
                index = inputIndex();
                try {
                    data.add(value, index);
                } catch (Exception e) {
                }
                break;
            case 3:
                System.out.print("\nEnter value you're looking for : ");
                int cari = sc.nextInt();
                try {
                    data.getKey(cari);
                } catch (Exception e) {
                }
                System.out.print("\nEnter the added value : ");
                int add = sc.nextInt();
                try {
                    data.addByValue(add, cari);
                } catch (Exception e) {
                }
                break;
            case 4:
                value = inputnilai();
                data.addLast(value);
                break;
            default:
                inputSalah();
                break;
        }
    }

    public static void menuRemove(int jwb) {
        switch (jwb) {
            case 1:
                index = inputIndex();
                try {
                    data.remove(index);
                } catch (Exception e) {
                }
                break;
            case 2:
                value = inputnilai();
                try {
                    data.removeByValue(value);
                } catch (Exception e) {
                }
                break;
            case 3:
                data.clear();
                break;
            default:
                inputSalah();
                break;
        }
    }

    public static void menuSearch(int jwb) {
        switch (jwb) {
            case 1:
                index = inputIndex();
                try {
                    System.out.println("Index " + index + " found   : " + data.get(index));
                } catch (Exception e) {
                }
                break;
            case 2:
                value = inputnilai();
                try {
                    data.getKey(value);
                } catch (Exception e) {
                }
                break;
            case 3:

                break;
            default:
                inputSalah();
                break;
        }
    }
}
