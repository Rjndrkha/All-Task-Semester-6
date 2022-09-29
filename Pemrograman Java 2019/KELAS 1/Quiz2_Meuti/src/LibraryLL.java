/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MeiMei
 */
public class LibraryLL {

    Library head;
    Library sorted;
    int size;

    public LibraryLL() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String name, String author, int stock) {
        head = new Library(name, author, stock, head);
        size++;
    }

    public void add(String name, String author, int stock, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        }
        if (isEmpty() || index == 0) {
            addFirst(name, author, stock);
        } else {
            Library tmp = head;
            for (int i = 1; i < index; i++) {
                tmp = tmp.next;
            }
            Library next = (tmp == null) ? null : tmp.next;
            tmp.next = new Library(name, author, stock, next);
        }
        size++;

    }

    public void addLast(String name, String author, int stock) {
        if (isEmpty()) {
            addFirst(name, author, stock);
        } else {
            Library tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Library(name, author, stock, null);
        }
        size++;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas");
        }
        if (isEmpty()) {
            removeFirst();
        } else {
            Library prev = head;
            Library cur = head.next;
            for (int i = 1; i < index; i++) {
                prev = cur;
                cur = prev.next;
            }
            prev.next = cur.next;
            size--;
        }
    }

    public void removeFirst() throws Exception {
        head = head.next;
        size--;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Library tmp = head;
            while (tmp != null) {
                System.out.println(tmp.name + "\t");
                System.out.println(tmp.author + "\t");
                System.out.println(tmp.stock + "\t");

                if (valid(tmp.name)) {
                    System.out.println("Available");
                } else {
                    System.out.println("Unavailable");
                }
                System.out.println("+--------------------------------------------------+");
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("LinkedLists kosong");
        }
    }

    public boolean valid(String name) {
        int i = 1;
        Library curr = head;
        while (curr != null) {
            if (curr.name.equalsIgnoreCase(name)) {
                if (curr.stock == 0) {
                    return false;
                } else {
                    return true;
                }
            }
            curr = curr.next;
            i++;
        }
        return false;
    }

    public void searchByKeyBorrow(String name) throws Exception {
        if (isEmpty()) {
            throw new Exception("Library is empty");
        }
        int i = 1;
        Library curr = head;
        while (curr != null) {
            if (curr.name.equalsIgnoreCase(name)) {
                if (valid(name)) {
                    curr.stock--;
                    System.out.println("Loaning Success");
                    break;
                } else {
                    System.out.println("Out of Stock");
                }
            }
            curr = curr.next;
            i++;
        }

    }

    public void searchByKeyReturn(String name) throws Exception {
        if (isEmpty()) {
            throw new Exception("Library is empty");
        }
        int i = 1;
        Library curr = head;
        while (curr != null) {
            if (curr.name.equalsIgnoreCase(name)) {
                curr.stock++;
                System.out.println("Returning Success");
                break;

            }
            curr = curr.next;
            i++;
        }

    }

    void insertionSort() {

        sorted = null;
        Library current = head;

        while (current != null) {
            Library next = current.next;
            sortedInsert(current);
            current = next;
        }
        head = sorted;
        print();
    }

    void sortedInsert(Library newnode) {
        if (sorted == null || sorted.name.charAt(0) >= newnode.name.charAt(0)) {
            newnode.next = sorted;
            sorted = newnode;
        } else {
            Library current = sorted;

            while (current.next != null && current.next.name.charAt(0) < newnode.name.charAt(0)) {
                current = current.next;
            }
            newnode.next = current.next;
            current.next = newnode;
        }
    }
}
