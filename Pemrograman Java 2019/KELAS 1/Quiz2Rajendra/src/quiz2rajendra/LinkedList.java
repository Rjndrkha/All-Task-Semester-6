/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2rajendra;

/**
 *
 * @author Rajendra Rakha
 */
class node<T> {

    T data;
    node<T> next;

    public node(T data, node<T> next) {
        this.data = data;
        this.next = next;
    }
}

public class LinkedList<T> {

    node<T> headBuku;
    node<T> headNama;
    node<T> headStok;
    node<T> headISBN;
    node<T> headBuku2;
    node<T> headNama2;
    node<T> headStok2;
    node<T> headISBN2;
    int size, size2;

    public LinkedList() {
        headBuku = null;
        headStok = null;
        headNama = null;
        headISBN = null;
        headBuku2 = null;
        headStok2 = null;
        headNama2 = null;
        headISBN2 = null;

        size = 0;
        size2 = 0;

    }

    public boolean kosong() {
        return headBuku == null;
    }

    public boolean kosong2() {
        return headBuku2 == null;
    }

    public void addFirst(T buku, T nama, T menu, T isbn) {
        headBuku = new node(buku, headBuku);
        headStok = new node(menu, headStok);
        headNama = new node(nama, headNama);
        headISBN = new node(isbn, headISBN);
        size++;

    }

    public void addFirst2(T buku, T nama, T menu, T isbn) {
        headBuku2 = new node(buku, headBuku2);
        headStok2 = new node(menu, headStok2);
        headNama2 = new node(nama, headNama2);
        headISBN2 = new node(isbn, headISBN2);
        size2++;
    }

    public void addLast(T buku, T nama, T menu, T isbn) {
        if (kosong()) {
            addFirst(buku, nama, isbn, menu);
        } else {
            node tmp1 = headBuku;
            node tmp2 = headNama;
            node tmp3 = headStok;
            node tmp4 = headISBN;
            while (tmp1.next != null) {
                tmp1 = tmp1.next;
                tmp2 = tmp2.next;
                tmp3 = tmp3.next;
                tmp4 = tmp4.next;
            }
            tmp1.next = new node(buku, null);
            tmp2.next = new node(nama, null);
            tmp3.next = new node(menu, null);
            tmp4.next = new node(isbn, null);
            size++;

        }
    }

    public void addLast2(T buku, T nama, T menu, T isbn) {
        if (kosong2()) {
            addFirst2(buku, nama, menu, isbn);
        } else {
            node tmp1 = headBuku2;
            node tmp2 = headNama2;
            node tmp3 = headStok2;
            node tmp4 = headISBN2;
            while (tmp1.next != null) {
                tmp1 = tmp1.next;
                tmp2 = tmp2.next;
                tmp3 = tmp3.next;
                tmp4 = tmp4.next;
            }
            tmp1.next = new node(buku, null);
            tmp2.next = new node(nama, null);
            tmp3.next = new node(menu, null);
            tmp4.next = new node(isbn, null);
            size2++;
        }
    }

    public void removeFirst() {
        headBuku = headBuku.next;
        headStok = headStok.next;
        headNama = headNama.next;
        headISBN = headISBN.next;
        size--;
    }

    public void removeByValue(T value) throws Exception {
        node tmp = headBuku;
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (tmp.data == value) {
                index = i;
                break;
            }
            tmp = tmp.next;
        }
        if (index == -1) {
            throw new Exception("Value tidak ada!!!");
        } else {
            if (index == 0) {
                removeFirst();
            } else {
                node prev1 = headBuku;
                node cur1 = headBuku.next;
                node prev2 = headStok;
                node cur2 = headStok.next;
                node prev3 = headNama;
                node cur3 = headNama.next;
                node prev4 = headISBN;
                node cur4 = headISBN.next;
                for (int i = 1; i < index; i++) {
                    prev1 = cur1;
                    cur1 = prev1.next;
                    prev2 = cur2;
                    cur2 = prev2.next;
                    prev3 = cur3;
                    cur3 = prev3.next;
                    prev4 = cur4;
                    cur4 = prev4.next;
                }
                prev1.next = cur1.next;
                prev2.next = cur2.next;
                prev3.next = cur3.next;
                prev4.next = cur4.next;
                size--;
            }
        }
    }

    public void print() {
        if (!kosong()) {
            node<T> tmp1 = headNama;
            node<T> tmp2 = headBuku;
            node<T> tmp3 = headStok;
            node<T> tmp4 = headISBN;
            System.out.println("Data\tNama\tStok\tISBN");
            while (tmp1 != null) {
                System.out.print(tmp2.data + "\t");
                System.out.print(tmp1.data + "\t");
                System.out.print(tmp3.data + "\t");
                System.out.print(tmp4.data + "\t");
                tmp1 = tmp1.next;
                tmp2 = tmp2.next;
                tmp3 = tmp3.next;
                tmp4 = tmp4.next;
                System.out.println();
            }
            System.out.println();
        } else {
            System.out.println("LinkedList kosong!!!");
        }
    }

    public void clear() {
        headBuku = null;
        headStok = null;
        headNama = null;
        headISBN = null;
        size = 0;
    }
    
    public boolean isEmpty() {
        return headBuku == null;
    }
    public void borrow(String name) throws Exception {
        if (isEmpty()) {
            throw new Exception("Library Is Empty ");
        }
        int i = 1;
        node bk = headBuku;
        while (bk != null) {
            if (bk.nama.equalsIgnoreCase(name)) {
                curr.stock--;
                System.out.println("Returning success");
                break;
            }
            curr = curr.next;
            i++;
        }
    }

}
