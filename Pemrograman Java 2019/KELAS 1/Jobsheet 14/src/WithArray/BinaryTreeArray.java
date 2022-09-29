/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WithArray;

/**
 *
 * @author Rajendra Rakha
 */
import java.util.*;

public class BinaryTreeArray {

    int[] data;
    int idxLast;
    int a = 0;

    public BinaryTreeArray() {
        data = new int[10];
    }

    void add(int nilai) {
        data[a] = nilai;
        a++;
    }

    void popuLateData(int data[], int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }

    void traversePreOrder(int idxStart) {
        System.out.print(data[idxStart] + " ");
        traverseInOrder(2 * idxStart + 1);
        traverseInOrder(2 * idxStart + 2);
    }

    void traversePostOrder(int idxStart) {
        traverseInOrder(2 * idxStart + 1);
        traverseInOrder(2 * idxStart + 2);
        System.out.print(data[idxStart] + " ");
    }
}

class BinaryTreeArrayMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTreeArray bta = new BinaryTreeArray();
        //int[] data = {6, 4, 8, 3, 5, 7, 9, 0, 0, 0};
        //int idxLast = 6;
        int value, a;
        System.out.print("Masukkan Length IdxLast \n >> ");
        int idxLast = sc.nextInt();
        System.out.print("Masukkan Panjang Length \n >> ");
        int length = sc.nextInt();
        for (a = 0; a < length; a++) {
            System.out.println("MASUKKAN INDEKS KE-" + a);
            System.out.print("MASUKKAN NILAI : ");
            value = sc.nextInt();
            bta.add(value);
            System.out.println("===========================");
        }
        bta.popuLateData(bta.data, idxLast);
        bta.traverseInOrder(0);
        System.out.println("");
        bta.traversePostOrder(0);
        System.out.println("");
        bta.traversePreOrder(0);
        System.out.println("");
    }
}
